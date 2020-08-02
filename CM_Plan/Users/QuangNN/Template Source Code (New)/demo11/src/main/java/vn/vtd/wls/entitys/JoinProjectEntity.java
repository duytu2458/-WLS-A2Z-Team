package vn.vtd.wls.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import vn.vtd.wls.entitys.base.BaseEntity;


@Entity
@Table(name = "join_project")
@IdClass(CompositeKey.class)
public class JoinProjectEntity extends BaseEntity{

	@Id
	@JoinColumn(name = "account")
	@ManyToOne
	private UserEntity userEntity;
	
	@Id
	@JoinColumn(name = "project_id")
	@ManyToOne
	private ProjectEntity projectEntity;
	
	//////////////

	@JoinColumn(name = "project_role")
	@ManyToOne
	private RoleEntity roleEntity;
	

	
	
}
class CompositeKey implements Serializable {
    private UserEntity userEntity;
    private ProjectEntity projectEntity;

}
	