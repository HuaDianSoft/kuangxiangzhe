package com.kxz.vo;

public class Admin {
	private int adminId;
	private String adminName;
	private String adminPwd;
	
public Admin(){super();}    
	
	public Admin(String adminName,String adminPwd){
		super();
		this.adminName = adminName;
		this.adminPwd = adminPwd;
	}
	
	public Admin(int adminId,String adminName,String adminPwd){
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPwd = adminPwd;
	}
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPwd() {
		return adminPwd;
	}
	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}
	
}
