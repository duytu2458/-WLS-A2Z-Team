package vn.vtd.wls.form;

import javax.validation.constraints.NotEmpty;

import vn.vtd.wls.validator.constraint.Password;
import vn.vtd.wls.validator.constraint.Phone;

public class UserForm {

	@NotEmpty
	private String fullName;

	private String gender;

	private Boolean enable;

	@Phone
	private String phone;

	@Password
	private String passWord;

	private String roleLogin;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getRoleLogin() {
		return roleLogin;
	}

	public void setRoleLogin(String roleLogin) {
		this.roleLogin = roleLogin;
	}

}
