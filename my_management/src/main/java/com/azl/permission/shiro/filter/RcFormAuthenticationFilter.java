package com.azl.permission.shiro.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;


/**
 * 自定义form表单认证过滤器<br/>
 * 目的是：验证码过滤器发现验证码错误，不需要做认证过滤
 */
public class RcFormAuthenticationFilter extends FormAuthenticationFilter {

	protected boolean onAccessDenied(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
		if (request.getAttribute(getFailureKeyAttribute()) != null) {
			return true;
		}
		return super.onAccessDenied(request, response, mappedValue);
	}
}
