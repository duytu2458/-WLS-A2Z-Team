package vn.vtd.wls.entitys.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
	
	@Column(name = "start_date")
//		@CreatedDate
	protected Date startDate;
	
	@Column(name = "finish_date")
//		@LastModifiedDate
	protected Date finishDate;
	
	
	

}
