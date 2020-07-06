package vn.vtd.wls.entitys;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import vn.vtd.wls.entitys.base.BaseEntity;

@Entity
@Table(name = "Project")
public class ProjectEntity extends BaseEntity{
	
	
	@Id
	@Column(name = "project_id")
	private String projectId;
	
	@Column(name = "name")
	private String projectName;
	
	@Column(name = "description")
	private String description;
	
	////////////////////
	private String phase;
	
	@OneToMany(mappedBy = "projectEntity")
	List<JoinProjectEntity> joinProjectEntities = new ArrayList<>();
	
	
	
	
	
	
}
