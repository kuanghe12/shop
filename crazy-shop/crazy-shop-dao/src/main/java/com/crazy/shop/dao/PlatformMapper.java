package com.crazy.shop.dao;

import java.util.List;

import com.crazy.shop.model.Platform;
import com.crazy.shop.model.PlatformBill;

public interface PlatformMapper {
	public int savePlatform(Platform platform);
	
	public List<Platform> getPlatform(Platform platform);
	
	public int updatePlatform(Platform platform);
	
	public int deletPlatform(Platform platform);
	
	public int getPlatformTotal(Platform platform);
	public List<Platform> getPlatformBySelect(Platform platform);
	public List<PlatformBill> getPlatformBills(PlatformBill platformBill);
}
