package com.neusoft.ht.fee.mapper;

import java.util.List;

import com.neusoft.ht.heating.model.HouseTypeModel;

public interface IHouseTypeMapper {
	//C
	public void create(HouseTypeModel houseTypeModel) throws Exception;
	//U
	public void update(HouseTypeModel houseTypeModel) throws Exception;
	//R
	public List<HouseTypeModel> selectListByAll() throws Exception;
	//D
	public void delete(HouseTypeModel houseTypeModel) throws Exception;
}
