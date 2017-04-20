package com.crazy.shop.dao;
import java.util.List;

import com.crazy.shop.model.Goods;

public interface GoodsMapper {
	
	public int saveGoods(Goods Goods);
	
	public List<Goods> getGoods(Goods Goods);
	
	public int updateGoods(Goods goods);
	
	public int deletGoods(Goods goods);
	
	public int getGoodTotal(Goods goods);

}
