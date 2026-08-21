package com.sist.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sist.web.mapper.CommentMapper;
import com.sist.web.vo.CommentVO;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService{
        private final CommentMapper cmapper;
	@Override
	public List<CommentVO> commentListData(int start,int fno) {
		// TODO Auto-generated method stub
		return cmapper.commentListData(start,fno);
	}

	@Override
	public int commentRowCount(int fno) {
		// TODO Auto-generated method stub
		return cmapper.commentRowCount(fno);
	}

	@Override
	public void commentInsert(CommentVO vo) {
		// TODO Auto-generated method stub
		cmapper.commentInsert(vo);
	}

	@Override
	public void commentDelete(int no) {
		// TODO Auto-generated method stub
		cmapper.commentDelete(no);
	}

	@Override
	public void commentUpdate(CommentVO vo) {
		// TODO Auto-generated method stub
		cmapper.commentUpdate(vo);
		
	}

}
