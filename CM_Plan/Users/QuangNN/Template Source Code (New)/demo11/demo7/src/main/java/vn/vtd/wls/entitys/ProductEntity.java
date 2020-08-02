package vn.vtd.wls.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
@Table(name = "Product")
public class ProductEntity {
	
	@Id
	@Column(name = "product_id")
	private String productId;
	
	@Column(name = "name")
	private String productName;
	
	/////////////
	@Column(name = "create_by")
			//@CreatedBy
	private String createBy;
	
	@Column(name = "product_phase")
	private String productPhase;
	
	@Column(name = "status")
	private String status;
	
	
	@Column(name = "project_id")
	private ProjectEntity projectEntity;
	
	
	
	
	
	
	
	
	

}
