package com.crazy.shop.dao;
import java.util.List;

import com.crazy.shop.model.GoodsReceipt;

public interface GoodsReceiptMapper {
	public int saveGoodsReceipt(GoodsReceipt goodsReceipt);
	
	public List<GoodsReceipt> getGoodsReceipt();

}
