package com.neusoft.ht.login.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.ht.login.model.AdminUserValue;

@Mapper
public interface IUserDao {

	public void create(AdminUserValue userValue) throws Exception;
	
	public void delete(AdminUserValue userValue) throws Exception;
	
	public void update(AdminUserValue userValue) throws Exception;
}
