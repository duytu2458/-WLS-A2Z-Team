package vn.vtd.wls.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component

public class Member {
	@Id
	@Column (name = "account")
	private String account;
	
	@Column (name = "fullName")
	private String fullName;

	@Column (name = "role")
	private String role;

	@Column (name = "gender")
	private String gender;

	@Column (name = "phone")
	private String phone;

	public Member(String account, String fullName, String role, String gender, String phone) {
		super();
		this.account = account;
		this.fullName = fullName;
		this.role = role;
		this.gender = gender;
		this.phone = phone;
	}

	public Member() {
		super();
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
