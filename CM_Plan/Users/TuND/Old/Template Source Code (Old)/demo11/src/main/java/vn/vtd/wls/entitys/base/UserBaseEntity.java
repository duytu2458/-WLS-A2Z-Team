package vn.vtd.wls.entitys.base;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class UserBaseEntity {
	
	@Size(min = 2, max = 10)
	@NotBlank
	@NotEmpty
	@Id
	@Column (name = "account")
	protected String account;
	
	@Size(min = 1, max = 25)
	@NotBlank
	@NotEmpty
	@Column(name = "fullname")
	protected String fullName;
	
	@Size(min = 3, max = 320)
	@NotBlank
	@NotEmpty
	@Column (name = "password")
	protected String passWord;
	
	@NotBlank
	@NotEmpty
	@Column(name = "gender")
	protected String gender;
	
	@Size(min = 10, max = 11)
	@PositiveOrZero
	@NotBlank
	@NotEmpty
	@Column(name = "phone")
	protected String phone;

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
