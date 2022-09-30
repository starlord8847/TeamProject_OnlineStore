package com.teampj.shop.list;

import java.util.ArrayList;

public interface ListService {
	
	ArrayList<ListDTO> mainout();

	ArrayList<ListDTO> rankingout();

	ArrayList<ListDTO> monthout();

	ArrayList<ListDTO> search(String svalue);

	ArrayList<ListDTO> detail(String pcode);

	ArrayList<ListDTO> chicken();

	ArrayList<ListDTO> pork();

	ArrayList<ListDTO> beef();

	ArrayList<ListDTO> rice();

	ArrayList<ListDTO> drink();

	ArrayList<ListDTO> salad();

	

}