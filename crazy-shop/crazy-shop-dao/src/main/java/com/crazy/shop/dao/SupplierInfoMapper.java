package com.crazy.shop.dao;

import java.util.List;

import com.crazy.shop.model.SupplierInfo;

public interface SupplierInfoMapper {

	public int saveSupplierInfo(SupplierInfo supplierInfo);
	
	public List<SupplierInfo> getSupplierInfo();
}
