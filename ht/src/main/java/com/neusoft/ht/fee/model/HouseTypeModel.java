package com.neusoft.ht.fee.model;

import org.apache.ibatis.type.Alias;

import lombok.Data;
/**
 * 
 *   供热收费管理模块的户型类
 * @author 黄宇德
 *
 */
@Alias("HouseType")
@Data
public class HouseTypeModel {
	
	private int typeno = 0;
	private String typename = null;
}
