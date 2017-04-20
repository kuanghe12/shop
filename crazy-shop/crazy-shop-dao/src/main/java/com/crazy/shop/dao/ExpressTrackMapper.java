package com.crazy.shop.dao;

import java.util.List;

import com.crazy.shop.model.ExpressTrack;

public interface ExpressTrackMapper {

	public int saveExpressTrack(ExpressTrack expressTrack);
	
	public List<ExpressTrack> getExpressTrack(ExpressTrack expressTrack);
	
	public int updateExpressTrack(ExpressTrack expressTrack);
	
	public int deletExpressTrack(ExpressTrack expressTrack);
	ExpressTrack getExpressTrackById(ExpressTrack expressTrack);
}
