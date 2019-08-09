package com.neusoft.ht.complain.value;

import java.text.DecimalFormat;
import java.util.Date;

import lombok.Data;

@Data
public class HomeComplainValue {
//居民投诉信息表
	//投诉序号
	private int comlainNo = 0;
	//居民编号
	private int homeNo = 0;
	//投诉类型编号
	private int typeNo = 0;
	//投诉标题
	private String complanumberitle = null;
	//投诉内容
	private String complainContent = null;
	//投诉要求
	private String requestContent = null;
	//投诉日期
	private Date complainDate = null;
	//投诉人姓名
	private String contactPerson = null;
	//电话
	private String tel = null;
	//手机
	private String mobile = null;
	//邮箱
	private String mail = null;
	//qq
	private String qq = null;
	//维修开始时间
	private Date serviceStartDate = null;
	//维修结束时间
	private Date serviceEndDate = null;
	//维修人
	private String servicePerson = null;
	//回访时间
	private Date feedBackDate = null;
	//客户意见
	private String homeComment = null;
	//保险出险时间
	private Date assuranceDate = null;
	//保险金额
	private double assuranceFee = 0.00;
}
