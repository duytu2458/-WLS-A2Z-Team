package vn.vtd.wls.service;

import org.springframework.data.domain.Page;

import vn.vtd.wls.dto.UserSearch;
import vn.vtd.wls.entitys.UserEntity;

public interface IUserService {
	
	Page<UserEntity> findAll (int pageNum);
	
//	Page<UserEntity> findAll (int pageNum,String sortField,String sortDrc);
	void save(UserEntity userEntity);

	default void test() {
		// Co the trien khai duoc ham trong nay (tu java 8 tro di)
	}
	Page<UserEntity> findByField(int pageNumInt, UserSearch userSearch);
	


	
}
