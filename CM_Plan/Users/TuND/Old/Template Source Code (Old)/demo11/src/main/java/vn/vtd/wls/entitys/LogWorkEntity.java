package vn.vtd.wls.entitys;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import vn.vtd.wls.entitys.base.BaseEntity;

//@Entity
@Table(name = "LogWork")
public class LogWorkEntity extends BaseEntity{
	
	@Id
	@Column(name = "log_work_id")
	private String logWorkId;
	
	@Column(name = "create_by")
//		@CreatedBy
	private UserEntity userEntity;
	
	
	////////////////
	@Column(name = "project_phase")
	private String projectPhase;
	
	@Column(name = "content")
	private String content;
	
	
	@Column(name = "hours")
	private int hours;
	
	@Column(name = "create_date")
//		@CreatedDate
	private Date createDate;
	
	
	@Column(name = "modifi_date")
//		@LastModifiedDate
	private Date modifiDate;
	
	
	/////////////////////
	@Column(name = "feedback_account")
	private String feedbackAccount;
	
	///////////////////////
	@Column(name = "feedback_description")
	private String feedbackDescription;
	
	
	
	
	
	
	
}
