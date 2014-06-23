package com.catt.spring.mode;

import java.sql.Timestamp;

public class Company {
	
	public String companyName; //公司名称
	public int id;
	public String companyInfo; //公司信息
	public Timestamp establishTime; //创立时间
	public String Owner; //企业法人
	public int registeredCapital; //注资 
	public int scale; //规模

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyInfo() {
		return companyInfo;
	}

	public void setCompanyInfo(String companyInfo) {
		this.companyInfo = companyInfo;
	}

	public Timestamp getEstablishTime() {
		return establishTime;
	}

	public void setEstablishTime(Timestamp establishTime) {
		this.establishTime = establishTime;
	}

	public String getOwner() {
		return Owner;
	}

	public void setOwner(String owner) {
		Owner = owner;
	}

	public int getRegisteredCapital() {
		return registeredCapital;
	}

	public void setRegisteredCapital(int registeredCapital) {
		this.registeredCapital = registeredCapital;
	}

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}

}
