package vn.vtd.wls.admin.service;

import java.util.List;

import vn.vtd.wls.entitys.UserEntity;

public interface IUserService {
	
	
	List<UserEntity> findAll ();

	void save(UserEntity userEntity);

	default void test() {
		// Co the trien khai duoc ham trong nay (tu java 8 tro di)
	}
	
}
