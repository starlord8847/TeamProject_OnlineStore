package com.teampj.shop.list;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/list/**")
public class ListController {


	@Autowired
	private SqlSession sqlSession;

	ModelAndView mav = new ModelAndView();
	JSONParser jp = new JSONParser();
	JSONObject jo;

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public ModelAndView main(Model model) {
		
		ListService ls = sqlSession.getMapper(ListService.class);
		ArrayList<ListDTO> list = ls.mainout();
		
		model.addAttribute("list", list);
		
		mav.setViewName("listmain");
		return mav;
	}
	
	@RequestMapping(value = "/ranking", method = RequestMethod.GET)
	public ModelAndView ranking(Model model, HttpServletRequest request) {
		
		ListService ls = sqlSession.getMapper(ListService.class);
		ArrayList<ListDTO> list = ls.rankingout();
		
		model.addAttribute("list", list);
		
		mav.setViewName("listranking");
		return mav;
	}
	
	@RequestMapping(value = "/month", method = RequestMethod.GET)
	public ModelAndView month(Model model, HttpServletRequest request) {
		
		ListService ls = sqlSession.getMapper(ListService.class);
		ArrayList<ListDTO> list = ls.monthout();
		
		model.addAttribute("list", list);
		
		mav.setViewName("listmonth");
		return mav;
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView search(Model model, HttpServletRequest request) {
		
		String svalue = request.getParameter("svalue");
		
		ListService ls = sqlSession.getMapper(ListService.class);
		ArrayList<ListDTO> list = ls.search(svalue);
		
		model.addAttribute("list", list);
		model.addAttribute("svalue", svalue);
		
		mav.setViewName("listsearchpage");
		return mav;
	}

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public ModelAndView detail(Model model, HttpServletRequest request) {
		
		String pcode = request.getParameter("pcode");
		
		ListService ls = sqlSession.getMapper(ListService.class);
		ArrayList<ListDTO> list = ls.detail(pcode);
		
		model.addAttribute("list", list);
		
		mav.setViewName("listdetail");
		return mav;
	}
}
