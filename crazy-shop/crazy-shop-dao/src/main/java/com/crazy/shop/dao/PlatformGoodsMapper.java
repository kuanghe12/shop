package com.crazy.shop.dao;

import java.util.List;

import com.crazy.shop.model.PlatformGoods;

public interface PlatformGoodsMapper {

	public int savePlatformGoods(PlatformGoods platform);
	public List<PlatformGoods> getPlatformGoods(PlatformGoods platform);
	public List<PlatformGoods> getPlatformGoodsById(PlatformGoods platform);
	public int updatePlatformGoods(PlatformGoods platform);
	public int deletPlatformGoods(PlatformGoods platform);
	public int getPlatformTotal(PlatformGoods platform);
}
