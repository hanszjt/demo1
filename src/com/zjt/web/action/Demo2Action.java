package com.zjt.web.action;

import com.opensymphony.xwork2.Action;

/**
 * ����������ĵڶ��ַ�ʽ��
 * 		����һ����ͨ�࣬ʵ��action�ӿڣ�ʵ�ֽӿ��еķ���
 * @author 77169
 *
 */
public class Demo2Action implements Action {

	/**
	 * Action�ӿ��еĳ�����
	 * 		SUCCESS		"success"    ��ִ�гɹ���ǰ��ָ����λ��
	 * 		NONE 		"none" 		   �������κν����ͼ����return null��һ����
	 * 		ERROR		"error" 	   ��ִ�з����������쳣��ǰ��ָ����λ��
	 * 		INPUT		"input" 	   ���ݻ���
	 * 		LOGIN		"login"		 һ�����ڷ��ص�¼ҳ�� 
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

}
