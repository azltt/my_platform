package com.azl.permission.shiro.spring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.util.CollectionUtils;
import org.springframework.cache.support.SimpleValueWrapper;

import net.sf.ehcache.Ehcache;

/**
 * 包装Spring cache抽象.
 */
public class SpringCacheManagerWrapper implements CacheManager {

	private org.springframework.cache.CacheManager cacheManager;

	/**
	 * 设置spring cache manager
	 *
	 * @param cacheManager
	 */
	public void setCacheManager(org.springframework.cache.CacheManager cacheManager) {
		this.cacheManager = cacheManager;
	}

	@SuppressWarnings("unchecked")
	public <K, V> Cache<K, V> getCache(String name) throws CacheException {
		org.springframework.cache.Cache springCache = cacheManager.getCache(name);
		return new SpringCacheWrapper(springCache);
	}

	@SuppressWarnings("rawtypes")
	static class SpringCacheWrapper implements Cache {
		private org.springframework.cache.Cache springCache;

		SpringCacheWrapper(org.springframework.cache.Cache springCache) {
			this.springCache = springCache;
		}

		
		public Object get(Object key) throws CacheException {
			Object value = springCache.get(key);
			if (value instanceof SimpleValueWrapper) {
				return ((SimpleValueWrapper) value).get();
			}
			return value;
		}

		
		public Object put(Object key, Object value) throws CacheException {
			springCache.put(key, value);
			return value;
		}

		
		public Object remove(Object key) throws CacheException {
			springCache.evict(key);
			return null;
		}

		
		public void clear() throws CacheException {
			springCache.clear();
		}

	
		public int size() {
			if (springCache.getNativeCache() instanceof Ehcache) {
				Ehcache ehcache = (Ehcache) springCache.getNativeCache();
				return ehcache.getSize();
			}
			throw new UnsupportedOperationException("invoke spring cache abstract size method not supported");
		}

		@SuppressWarnings("unchecked")
		
		public Set keys() {
			if (springCache.getNativeCache() instanceof Ehcache) {
				Ehcache ehcache = (Ehcache) springCache.getNativeCache();
				return new HashSet(ehcache.getKeys());
			}
			throw new UnsupportedOperationException("invoke spring cache abstract keys method not supported");
		}

		@SuppressWarnings("unchecked")
	
		public Collection values() {
			if (springCache.getNativeCache() instanceof Ehcache) {
				Ehcache ehcache = (Ehcache) springCache.getNativeCache();
				List keys = ehcache.getKeys();
				if (!CollectionUtils.isEmpty(keys)) {
					List values = new ArrayList(keys.size());
					for (Object key : keys) {
						Object value = get(key);
						if (value != null) {
							values.add(value);
						}
					}
					return Collections.unmodifiableList(values);
				} else {
					return Collections.emptyList();
				}
			}
			throw new UnsupportedOperationException("invoke spring cache abstract values method not supported");
		}
	}
}
