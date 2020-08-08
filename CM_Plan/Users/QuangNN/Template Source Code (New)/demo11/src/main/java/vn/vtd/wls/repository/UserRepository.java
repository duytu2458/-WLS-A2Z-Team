package vn.vtd.wls.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import vn.vtd.wls.entitys.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {
	
	
//	@Query("SELECT u FROM UserEntity u WHERE u.account like '%%' AND u.fullName like '%%' AND CONCAT('u.pm','') like '%u%'")
//	List<UserEntity> search();  AND u.fullName like '%:fullNAme%' AND u.phone like '%:phone%'

	
	
//	@Query("SELECT u FROM UserEntity u WHERE u.account like '%ad%' AND u.fullName = '%ad%' AND CONCAT('u.pm','') like '%true%'"
	
	
	
//	@Query("SELECT u FROM UserEntity u WHERE u.account LIKE ?1% AND u.fullName LIKE ?2% AND u.phone LIKE ?3%")
//	Page<UserEntity> findByField(String account,String fullName, String phone,Pageable pageable);
	
	
//	@Query("SELECT u FROM UserEntity u WHERE u.account LIKE ?1% AND u.fullName LIKE ?2% AND u.pm = ?3 AND u.phone LIKE ?4%")
//	Page<UserEntity> findByField(String account,String fullName,Boolean pm,String phone,Pageable pageable);
	
	
//	select account from user_entity where account like 'QuangNN%'
	@Query("SELECT account FROM UserEntity WHERE account like ?1%")
	List<String> getSameAccount(String account);
}

