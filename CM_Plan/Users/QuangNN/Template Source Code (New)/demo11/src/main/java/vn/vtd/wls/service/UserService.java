package vn.vtd.wls.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;

import vn.vtd.wls.dto.UserSearch;
import vn.vtd.wls.entitys.UserEntity;

public interface UserService {

	Page<UserEntity> findAll(int pageNum);

	List<UserEntity> findAll();

//	Page<UserEntity> findAll (int pageNum,String sortField,String sortDrc);
	void save(UserEntity userEntity);

	default void test() {
		// Co the trien khai duoc ham trong nay (tu java 8 tro di)
	}
//	Page<UserEntity> findByField(int pageNumInt, UserSearch userSearch);

	void deleteAll();

	String getAccountFromFullName(String fullName);
}
