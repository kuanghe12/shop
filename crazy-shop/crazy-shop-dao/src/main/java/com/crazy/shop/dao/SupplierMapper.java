package com.crazy.shop.dao;

import java.util.List;

import com.crazy.shop.model.Supplier;
import com.crazy.shop.model.SupplierBill;

public interface SupplierMapper {

	public int saveSupplier(Supplier supplier);
	
	public List<Supplier> getSupplier(Supplier supplier);
	
	public int updateSupplier(Supplier supplier);
	
	public int deletSupplier(Supplier supplier);
	public int getSupplierTotal(Supplier supplier);
	public Supplier getSupplierById(Supplier supplier);
	public List<SupplierBill> getSupplierBills(SupplierBill supplierBill);

	public List<Supplier> getSupplierSelect();
}
