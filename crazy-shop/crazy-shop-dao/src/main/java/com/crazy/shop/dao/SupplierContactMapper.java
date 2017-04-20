package com.crazy.shop.dao;

import java.util.List;

import com.crazy.shop.model.SupplierContact;

public interface SupplierContactMapper {
	public int saveSupplierContact(SupplierContact supplierInfo);
	
	public List<SupplierContact> getSupplierContact(SupplierContact supplierInfo);
	public int getSupplierContactTotal(SupplierContact supplierInfo);
}
