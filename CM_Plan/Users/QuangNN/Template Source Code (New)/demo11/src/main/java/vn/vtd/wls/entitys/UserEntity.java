package vn.vtd.wls.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "user_entity")
@Component
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "account")
	private String account;

	@Column(name = "fullname", columnDefinition = "nvarchar(50)")
	private String fullName;

	@Column(name = "gender", columnDefinition = "nvarchar(10)")
	private String gender;

	@Column(name = "enable")
	private Boolean enable;

	@Column(name = "phone")
	private String phone;

	@Column(name = "password")
	private String passWord;

	@Column(name = "rolelogin")
	private String roleLogin;

	public UserEntity() {
		super();
	}

	public UserEntity(Long id, String account, String fullName, String gender, Boolean enable, String phone,
			String passWord, String roleLogin) {
		super();
		this.id = id;
		this.account = account;
		this.fullName = fullName;
		this.gender = gender;
		this.enable = enable;
		this.phone = phone;
		this.passWord = passWord;
		this.roleLogin = roleLogin;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
