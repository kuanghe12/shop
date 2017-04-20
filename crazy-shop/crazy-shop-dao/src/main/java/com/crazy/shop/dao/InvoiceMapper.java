package com.crazy.shop.dao;

import java.util.List;

import com.crazy.shop.model.Invoice;

public interface InvoiceMapper {
	public int saveInvoice(Invoice Invoice);
	
	public List<Invoice> getInvoice();
}
