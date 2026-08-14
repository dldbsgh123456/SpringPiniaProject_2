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
	public List<FoodVO> FoodListData(int start) {
		// TODO Auto-generated method stub
		return fmapper.FoodListData(start);
	}

	@Override
	public int FoodTotalPage() {
		// TODO Auto-generated method stub
		return fmapper.FoodTotalPage();
	}

	@Override
	public FoodVO foodDetailData(int no) {
		// TODO Auto-generated method stub
		return fmapper.foodDetailData(no);
	}

	@Override
	public void foodHitIncrement(int no) {
		// TODO Auto-generated method stub
		fmapper.foodHitIncrement(no);
	}

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
		int totalpage=FoodTotalPage();
		final int BLOCK=10;
		int startPage=((page-1)/BLOCK*BLOCK)+1;
		int endPage=((page-1)/BLOCK*BLOCK)+BLOCK;
		if(endPage>totalpage)
			endPage=totalpage;
		int pages[]= {page,totalpage,startPage,endPage};
		return pages;
	}

}
