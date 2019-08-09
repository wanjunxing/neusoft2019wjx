package com.neusoft.ht.fee.model;

import org.apache.ibatis.type.Alias;

import lombok.Data;

/**
 * 
 * 	供热收费管理模块的付款方式类
 * @author 黄宇德
 *
 */
@Alias("PaymentType")
@Data
public class PaymentTypeModel {
	
	private int typeno = 0;
	private String typename = null;
}
