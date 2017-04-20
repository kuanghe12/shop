package com.crazy.shop.dao;

import java.util.List;

import com.crazy.shop.model.Goods;
import com.crazy.shop.model.GoodsType;
import com.crazy.shop.model.UserMsg;

public interface GoodsTypeMapper {

	public int saveGoodsType(GoodsType goodsType);
	
	public int updateGoodsType(GoodsType goodsType);
	
	public int deletGoodsType(GoodsType goodsType);
	
	public List<GoodsType> getGoodsType(GoodsType goodsType);
	
	public GoodsType getGoodsTypeByTypeId(GoodsType goodsType);
	public List<GoodsType> getGoodsTypeBySelect(GoodsType goodsType);
	public List<Goods> getGoodsByTypeId(GoodsType goodsType);
	
	public void saveUserMsg(UserMsg userMsg);
	
}
