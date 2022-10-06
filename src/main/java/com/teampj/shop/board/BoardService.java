package com.teampj.shop.board;

import java.util.ArrayList;

public interface BoardService {

	ArrayList<BoardDTO> review(String pcode);

	ArrayList<BoardDTO> inquiry(String pcode);
	
	ArrayList<BoardDTO> selectnotice(PageDTO pto); //페이징 처리 게시글 조회
	
	int cntnotice(); //전체 레코드 수 구하기

}