package com.neusoft.ht.fee.mapper;

import java.util.List;

import com.neusoft.ht.fee.model.NeighbourHoodModel;

public interface INeighbourHoodMapper {
	//C
	public void create(NeighbourHoodModel neighbourHoodModel) throws Exception;
	//U
	public void update(NeighbourHoodModel neighbourHoodModel) throws Exception;
	//R
	public List<NeighbourHoodModel> selectListByAll() throws Exception;
	//D
	public void delete(NeighbourHoodModel neighbourHoodModel) throws Exception;
}
	