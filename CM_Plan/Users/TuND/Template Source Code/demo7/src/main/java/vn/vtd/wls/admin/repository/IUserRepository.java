package vn.vtd.wls.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.vtd.wls.entitys.UserEntity;

public interface IUserRepository extends JpaRepository<UserEntity, String> {
	
	

}
