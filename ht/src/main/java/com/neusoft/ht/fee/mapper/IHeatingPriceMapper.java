package com.neusoft.ht.fee.mapper;

import java.util.List;

import com.neusoft.ht.fee.model.HeatingPriceModel;

public interface IHeatingPriceMapper {
	//C
	public void create(HeatingPriceModel heatingPriceModel) throws Exception;
	//U
	public void update(HeatingPriceModel heatingPriceModel) throws Exception;
	//R
	public List<HeatingPriceModel> selectListByAll() throws Exception;
	//D
	public void delete(HeatingPriceModel heatingPriceModel) throws Exception;
}
