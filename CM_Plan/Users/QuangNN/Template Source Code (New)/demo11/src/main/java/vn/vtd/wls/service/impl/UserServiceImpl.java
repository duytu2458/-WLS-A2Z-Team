package vn.vtd.wls.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import vn.vtd.wls.common.Handling;
import vn.vtd.wls.dto.UserSearch;
import vn.vtd.wls.entitys.UserEntity;
import vn.vtd.wls.repository.UserRepository;
import vn.vtd.wls.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public Page<UserEntity> findAll(int pageNum) {
		Pageable pageable = PageRequest.of(pageNum - 1, 10);
		return userRepository.findAll(pageable);
	}

	@Override
	public List<UserEntity> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

//	@Override
//	public Page<UserEntity> findAll(int pageNum,String sortField, String sortDrc) {
//		Pageable pageable = PageRequest.of(pageNum - 1, 5, 
//				sortDrc.equals("asc") ? Sort.by(sortField).ascending() : Sort.by(sortField).descending());
//		return userRepository.findAll(pageable);
//	}

	@Override
	public void save(UserEntity userEntity) {
		userRepository.save(userEntity);
	}

//	@Override
//	public Page<UserEntity> findByField(int pageNum, UserSearch userSearch) {
//
//		Pageable pageable = PageRequest.of(pageNum - 1, 5);
//		try {
//			UserSearch userSearch2 = (UserSearch) userSearch.clone();
//			if (userSearch2.getPm() == null) {
//				return userRepository.findByField(userSearch2.getAccount(), userSearch2.getFullName(),
//						userSearch2.getPhone(), pageable);
//			} else {
//				return userRepository.findByField(userSearch2.getAccount().trim(), userSearch2.getFullName(),
//						userSearch2.getPm(), userSearch2.getPhone(), pageable);
//			}
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//			return null;
//		}
//	}

	@Override
	public void deleteAll() {
		userRepository.deleteAll();
	}

	@Override
	public String getAccountFromFullName(String fullName) {
		String account = Handling.getAccountFromFullName(fullName);

		return account == null ? null
				: Handling.getAccountFromAccountList(account, userRepository.getSameAccount(account));
	}
}
