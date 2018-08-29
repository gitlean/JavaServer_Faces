package com.isoft.manage;


import java.util.Date;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import com.isoft.vo.MyVO;

/**
 * 注意 没有注解 description
 * 
 * @author john
 * @date 2017年10月9日
 */
public class UserBean {
	private String name;
	private String email;

	private Date date = new Date();

	private MyVO myvo;
	
	
	
	
	public String jump(){
		System.out.println("Got it ...");
		Map params = FacesContext.getCurrentInstance().getExternalContext()  
                .getRequestParameterMap();  
		System.out.println(params);
		String username = (String) params.get("par");  
		System.out.println("username:"+username);
		
		//获取vo
		myvo=new MyVO();
		myvo.setId("123");
		myvo.setUname("Tom");
		
		this.name="AAAAAAAAAA";
		return "";
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public MyVO getMyvo() {
		return myvo;
	}



	public void setMyvo(MyVO myvo) {
		this.myvo = myvo;
	}



}