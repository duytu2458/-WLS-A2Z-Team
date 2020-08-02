package vn.vtd.wls.admin.dto;

import org.springframework.stereotype.Component;


@Component

public class UserSearch {
	
	private String account;
	private String fullName;
	private Boolean pm;
	private String phone;
	
	public UserSearch() {
	}
	
	public UserSearch(String account, String fullName, Boolean pm, String phone) {
		this.account = account;
		this.fullName = fullName;
		this.pm = pm;
		this.phone = phone;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Boolean getPm() {
		return pm;
	}
	public void setPm(Boolean pm) {
		this.pm = pm;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public UserSearch getUserMappingFindAll() {
		UserSearch userFindAll = new UserSearch("","",null,""); 
		return userFindAll;
	}
	
	
	
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		UserSearch userSearchClone = new UserSearch(this.account,this.fullName,this.pm,this.phone); 
		return userSearchClone;
	}

	@Override
	public boolean equals(Object obj) {
		if (this instanceof UserSearch) {
			UserSearch userSearch = (UserSearch) obj;
			if (this.account.equals(userSearch.account) &&
					this.fullName.equals(userSearch.fullName) &&
							this.pm == null && userSearch.pm == null &&
								this.phone.equals(userSearch.phone)) {
				return true;
			}
			return false;
			
		}
		return false;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
