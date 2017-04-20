package com.crazy.shop.dao;

import java.util.List;

import com.crazy.shop.model.ExpressTrackInfo;

public interface ExpressTrackInfoMapper{

	public int saveExpressTrackInfo(ExpressTrackInfo expressTrackInfo);
	
	public List<ExpressTrackInfo> getExpressTrackInfo(ExpressTrackInfo expressTrackInfo);
	
	public int updateExpressTrackInfo(ExpressTrackInfo expressTrackInfo);
	
	public int deletExpressTrackInfo(ExpressTrackInfo expressTrackInfo);
}
