package com.zjt.web.action;

import com.opensymphony.xwork2.Action;

/**
 * 创建动作类的第二种方式：
 * 		创建一个普通类，实现action接口，实现接口中的方法
 * @author 77169
 *
 */
public class Demo2Action implements Action {

	/**
	 * Action接口中的常量：
	 * 		SUCCESS		"success"    当执行成功后，前往指定的位置
	 * 		NONE 		"none" 		   不返回任何结果视图，和return null是一样的
	 * 		ERROR		"error" 	   当执行方法，出现异常后，前往指定的位置
	 * 		INPUT		"input" 	   数据回显
	 * 		LOGIN		"login"		 一般用于返回登录页面 
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

}
