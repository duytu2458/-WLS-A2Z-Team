package vn.vtd.wls.entitys;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Role")
public class RoleEntity {
	
	@Id
	@Column(name = "role_id")
	private String roleId;
	
	@Column(name = "role_name")
	private String roleName;
	
	@OneToMany(mappedBy = "roleEntity")
	List<JoinProjectEntity> joinProjectEntities = new ArrayList<>();
	
	
	
}
