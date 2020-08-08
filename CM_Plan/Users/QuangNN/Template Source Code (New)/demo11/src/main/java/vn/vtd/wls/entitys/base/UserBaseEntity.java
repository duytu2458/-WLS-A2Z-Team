package vn.vtd.wls.entitys.base;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class UserBaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected Long id;

	@Column(name = "account")
	protected String account;
	
	@Column(name = "gender")
	protected String gender;

	@Column(name = "fullname")
	protected String fullName;

	@Column(name = "password")
	protected String passWord;

	

	@Column(name = "phone")
	protected String phone;

	public UserBaseEntity() {
		super();
	}

	public UserBaseEntity(long id, String account, String fullName, String passWord, String gender, String phone) {
		super();
		this.id = id;
		this.account = account;
		this.fullName = fullName;
		this.passWord = passWord;
		this.gender = gender;
		this.phone = phone;
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

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
