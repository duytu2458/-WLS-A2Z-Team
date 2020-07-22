package vn.vtd.wls.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
@Table(name = "TypeWork")
public class TypeWorkEntity {
	
	@Id
	@Column(name = "product_id")
	private ProductEntity productEntity;
	
	@Id
	@Column(name = "log_work_id")
	private LogWorkEntity logWorkEntity;
	
	
	/////////////////////
	@Column(name = "type_work")
	private String typeWork;
	
	
	
	
}
