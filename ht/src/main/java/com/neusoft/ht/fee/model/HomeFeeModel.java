package com.neusoft.ht.fee.model;

import org.apache.ibatis.type.Alias;

import lombok.Data;

/**
 * 供热收费管理模块的居民供热记录类
 * @author黄宇德 
 *
 */
@Alias("HomeFee")
@Data
public class HomeFeeModel {
	
	private int feeno = 0;
	private HomeModel homeModel = null;
	private HeatingPriceModel heatingPriceModel = null;
	private float heatarea = 0;
	private float actualfee = 0;
	private float debtfee = 0;
	private String feedesc = null;
	private String feestatus = null;
	private int heatingdays = 0;
    
    
}
