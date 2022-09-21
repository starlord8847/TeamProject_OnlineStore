package com.teampj.shop.list;

import java.util.ArrayList;

public interface ListService {
	
	ArrayList<ListDTO> mainout();

	ArrayList<ListDTO> rankingout();

	ArrayList<ListDTO> monthout();

	ArrayList<ListDTO> search(String svalue);

	ArrayList<ListDTO> detail(String pcode);

	

}