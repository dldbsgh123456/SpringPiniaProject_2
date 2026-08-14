package com.sist.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sist.web.mapper.FoodMapper;
import com.sist.web.vo.FoodVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FoodServiceImpl implements FoodService {
	 private final FoodMapper fmapper;
	
	@Override
	public List<FoodVO> foodListData(int page) {
		// TODO Auto-generated method stub
		int start=(page*12)-12;
		return fmapper.foodListData(start);
	}

	@Override
	public int FoodTotalPage() {
		// TODO Auto-generated method stub
		return fmapper.foodTotalPage();
	}

	@Override
	public FoodVO foodDetailData(int no) {
		// TODO Auto-generated method stub
		fmapper.foodHitIncrement(no);
		return fmapper.foodDetailData(no);
	}
    /*
     *     1. Mapper : 재료(데이터베이스만 연동)
     *          => JDBC / MyBatis / JPA 
     *     2. Controller / RestController 서빙 (브라우저로 전송)
     *     3. Service : 쉐프 : 전체 요청 처리 
     * 
     */
	@Override
	public int[] foodPages(int page) {
		// TODO Auto-generated method stub
		/*
		 * int totalpage=recipeTotalPage();
			final int BLOCK=10;
			int startPage=((page-1)/BLOCK*BLOCK)+1;
			int endPage=((page-1)/BLOCK*BLOCK)+BLOCK;
			if(endPage>totalpage)
				endPage=totalpage;
			int[] pages= {page,totalpage,startPage,endPage};
			return pages;
		 * 
		 */
		int totalpage=fmapper.foodTotalPage();
		final int BLOCK=10;
		int startPage=((page-1)/BLOCK*BLOCK)+1;
		int endPage=((page-1)/BLOCK*BLOCK)+BLOCK;
		if(endPage>totalpage)
			endPage=totalpage;
		int pages[]= {page,totalpage,startPage,endPage};
		return pages;
	}

}
