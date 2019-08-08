package com.neusoft.ht.fee.mapper;

import java.util.List;

import com.neusoft.ht.heating.model.PublicHouseModel;

public interface IPublicHouseMapper {
	//C
	public void create(PublicHouseModel publicHouseModel) throws Exception;
	//U
	public void update(PublicHouseModel publicHouseModel) throws Exception;
	//R
	public List<PublicHouseModel> selectListByAll() throws Exception;
	//D
	public void delete(PublicHouseModel publicHouseModel) throws Exception;
}
