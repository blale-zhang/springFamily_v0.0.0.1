package com.catt.spring.mode;

import com.catt.spring.framework.persistent.annotation.Column;
import com.catt.spring.framework.persistent.annotation.Entity;
import com.catt.spring.framework.persistent.annotation.Id;
import com.catt.spring.framework.persistent.annotation.Table;

/**
 * 客户
 * 
 * @author Thinkpad
 * 
 */
@Entity
@Table(name = "client")
public class Client {

	@Id
	@Column(dataType = "bitint", name = "client_name")
	private String clientName;
	
	@Column(dataType = "varchar", name = "email")
	private String email;
	
	@Column(dataType = "varchar", name = "phone_number")
	private String phoneNumber;
	
	@Column(dataType = "bitint", name = "company_id")
	private Long companyId;
	
	@Column(dataType = "bitint", name = "uuuid")
	private Long uuuid;

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getUuuid() {
		return uuuid;
	}

	public void setUuuid(Long uuuid) {
		this.uuuid = uuuid;
	}

}
