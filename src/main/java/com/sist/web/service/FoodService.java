package com.sist.web.service;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sist.web.vo.FoodVO;

public interface FoodService {
	public List<FoodVO> FoodListData(int start);
	
	// 총페이지
	public int FoodTotalPage();
	
	// 상세보기
	public FoodVO foodDetailData(int no);
	
	public void foodHitIncrement(int no);
	
    public int[] foodPages(int page);
}
