package vn.vtd.wls.entitys;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import javassist.expr.NewArray;
import vn.vtd.wls.entitys.base.UserBaseEntity;

@Entity
@Table(name = "user_entity")
@Component
public class UserEntity extends UserBaseEntity{

	@Column(name = "is_pm")
	private boolean pm;
	
	@OneToMany(mappedBy = "userEntity")
	List<JoinProjectEntity> joinProjectEntities = new ArrayList<>();
	
	@OneToMany(mappedBy = "roleEntity")
	List<JoinProjectEntity> joinProjectEntities2 = new ArrayList<>();
	
	
	
	
	

	public boolean isPm() {
		return pm;
	}

	public void setPm(boolean pm) {
		this.pm = pm;
	}

	public List<JoinProjectEntity> getJoinProjectEntities() {
		return joinProjectEntities;
	}

	public void setJoinProjectEntities(List<JoinProjectEntity> joinProjectEntities) {
		this.joinProjectEntities = joinProjectEntities;
	}

	public List<JoinProjectEntity> getJoinProjectEntities2() {
		return joinProjectEntities2;
	}

	public void setJoinProjectEntities2(List<JoinProjectEntity> joinProjectEntities2) {
		this.joinProjectEntities2 = joinProjectEntities2;
	}
	
	
	
}
