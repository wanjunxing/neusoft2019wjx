package com.neusoft.ht.fee.model;

import org.apache.ibatis.type.Alias;

import lombok.Data;

/**
 * 
 *   供热收费管理模块的小区类
 * @author 黄宇德
 *
 */
@Alias("Neighbourhood")
@Data
public class NeighbourHoodModel {
	
	private int hoodno = 0;
	private String hoodname = null;
	private String address = null;
}
