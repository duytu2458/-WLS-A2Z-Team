package vn.vtd.wls.entitys;

import javax.persistence.Entity;
import javax.persistence.Table;

import vn.vtd.wls.entitys.base.UserBaseEntity;

@Entity
@Table(name = "Admin")
public class AdminEntity extends UserBaseEntity{

}
