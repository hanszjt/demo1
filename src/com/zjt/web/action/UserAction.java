package com.zjt.web.action;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 用户相关的动作类
 * @author 77169
 *
 */
public class UserAction extends ActionSupport {
	
	public String addUser() {
		System.out.println("添加用户");
		return SUCCESS;
	}
	
	public String updateUser() {
		System.out.println("更新用户");
		return SUCCESS;
	}
	
	public String deleteUser() {
		System.out.println("删除用户");
		return SUCCESS;
	}
	
	public String findUser() {
		System.out.println("查询用户");
		return SUCCESS;
	}
}
