package com.neusoft.ht.fee.mapper;

import java.util.List;

import com.neusoft.ht.fee.model.HomeModel;

public interface IHomeMapper {
	//C
	public void create(HomeModel homeModel) throws Exception;
	//U
	public void update(HomeModel homeModel) throws Exception;
	//R
	public List<HomeModel> selectListByAll() throws Exception;
	//D
	public void delete(HomeModel homeModel) throws Exception;
}
