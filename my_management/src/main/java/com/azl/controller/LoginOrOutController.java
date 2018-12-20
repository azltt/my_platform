package com.azl.controller;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.azl.utils.VerifyCodeUtil;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


/**
 * 本例中用到的jar文件如下
 *
 */
@Controller
@RequestMapping("/mymanagement")
public class LoginOrOutController {
	private static Logger log = LogManager.getLogger(LoginOrOutController.class.getName());
	/**
	 * 获取验证码图片和文本(验证码文本会保存在HttpSession中)
	 */
	@RequestMapping("/getVerifyCodeImage")
	public void getVerifyCodeImage(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 设置页面不缓存
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		String verifyCode = VerifyCodeUtil.generateTextCode(VerifyCodeUtil.TYPE_NUM_ONLY, 4, null);
		// 将验证码放到HttpSession里面
		request.getSession().setAttribute("verifyCode", verifyCode);
		System.out.println("本次生成的验证码为[" + verifyCode + "],已存放到HttpSession中");
		// 设置输出的内容的类型为JPEG图像
		response.setContentType("image/jpeg");
		BufferedImage bufferedImage = VerifyCodeUtil.generateImageCode(verifyCode, 90, 30, 3, true, Color.WHITE,
				Color.BLACK, null);
		// 写给浏览器
		ImageIO.write(bufferedImage, "JPEG", response.getOutputStream());
	}

	/**
	 * 用户登录
	 */
	@RequestMapping(value = "/dologin")
	public String login(HttpServletRequest request, Model model) {

		String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");

		String username = request.getParameter("managername");
		// 获取HttpSession中的验证码
		String verifyCode = (String) request.getSession().getAttribute("verifyCode");
		// 获取用户请求表单中输入的验证码
		String submitCode = WebUtils.getCleanParam(request, "verifyCode");
		System.out.println("用户[" + username + "]登录时输入的验证码为[" + submitCode + "],HttpSession中的验证码为[" + verifyCode + "]");
		/*
		 * if (StringUtils.isEmpty(submitCode) || !StringUtils.equals(verifyCode,
		 * submitCode.toLowerCase())){ request.setAttribute("message_login", "验证码不正确");
		 * return "login"; }
		 */
		/*if (exceptionClassName != null && exceptionClassName.startsWith("验证码错误")) {
			request.setAttribute("message_login", "验证码不正确");
			return "login";
		}*/

		if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
			System.out.println("对用户[" + username + "]进行登录验证..验证未通过,未知账户");
			request.setAttribute("message_login", "未知账户");
		}
		else if (IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
			System.out.println("对用户[" + username + "]进行登录验证..验证未通过,错误的凭证");
			request.setAttribute("message_login", "密码不正确");
		}
		else if (LockedAccountException.class.getName().equals(exceptionClassName)) {
			System.out.println("对用户[" + username + "]进行登录验证..验证未通过,账户已锁定");
			request.setAttribute("message_login", "账户已锁定");
		}
		else if (ExcessiveAttemptsException.class.getName().equals(exceptionClassName)) {
			System.out.println("对用户[" + username + "]进行登录验证..验证未通过,错误次数过多");
			request.setAttribute("message_login", "用户名或密码错误次数过多");
		}
		else if (AuthenticationException.class.getName().equals(exceptionClassName)) {
			System.out.println("对用户[" + username + "]进行登录验证..验证未通过,堆栈轨迹如下");
			request.setAttribute("message_login", "用户名或密码不正确");
		}else if (exceptionClassName != null) {
			request.setAttribute("message_login", exceptionClassName);
		}
		// 验证是否登录成功
		 /*if(currentUser.isAuthenticated()){ System.out.println("用户[" + username +
		 "]登录认证通过(这里可以进行一些认证通过后的一些系统参数初始化操作)"); }else{ token.clear(); }*/
		return "system/login";

	}

	/**
	 * 用户登出
	 */
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) {
		SecurityUtils.getSubject().logout();
		return InternalResourceViewResolver.REDIRECT_URL_PREFIX + "/";
	}
}
