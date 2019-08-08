package com.neusoft.ht.fee.mapper;

import java.util.List;

import com.neusoft.ht.heating.model.PaymentTypeModel;

public interface IPaymentTypeMapper {
	//C
	public void create(PaymentTypeModel paymentTypeModel) throws Exception;
	//U
	public void update(PaymentTypeModel paymentTypeModel) throws Exception;
	//R
	public List<PaymentTypeModel> selectListByAll() throws Exception;
	//D
	public void delete(PaymentTypeModel paymentTypeModel) throws Exception;
}
