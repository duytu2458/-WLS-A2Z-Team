package vn.vtd.wls.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import vn.vtd.wls.entitys.base.UserBaseEntity;

@Entity
@Table(name = "user_entity")
@Component
public class UserEntity extends UserBaseEntity {

	@Column(name = "is_pm")
	private boolean pm;

	@Column(name = "enable")
	private boolean enable;

//	@OneToMany(mappedBy = "userEntity")
//	List<JoinProjectEntity> joinProjectEntities = new ArrayList<>();
//	
//	@OneToMany(mappedBy = "roleEntity")
//	List<JoinProjectEntity> joinProjectEntities2 = new ArrayList<>();

	public UserEntity() {
		super();
	}

	public UserEntity(@NotBlank(message = "123123123") @NotEmpty String account,
			@Size(min = 1, max = 25) @NotBlank @NotEmpty String fullName,
			@Size(min = 3, max = 320) @NotBlank @NotEmpty String passWord, @NotBlank @NotEmpty String gender,
			@Size(min = 9, max = 11) @PositiveOrZero @NotBlank @NotEmpty String phone, boolean pm, boolean enable) {
		super(account, fullName, passWord, gender, phone);
		this.pm = pm;
		this.enable = enable;
	}

	public boolean isPm() {
		return pm;
	}

	public void setPm(boolean pm) {
		this.pm = pm;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

//	public List<JoinProjectEntity> getJoinProjectEntities() {
//		return joinProjectEntities;
//	}
//
//	public void setJoinProjectEntities(List<JoinProjectEntity> joinProjectEntities) {
//		this.joinProjectEntities = joinProjectEntities;
//	}
//
//	public List<JoinProjectEntity> getJoinProjectEntities2() {
//		return joinProjectEntities2;
//	}
//
//	public void setJoinProjectEntities2(List<JoinProjectEntity> joinProjectEntities2) {
//		this.joinProjectEntities2 = joinProjectEntities2;
//	}
//	

}
