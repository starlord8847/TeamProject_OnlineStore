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
	
	@RequestMapping(value = "/chicken", method = RequestMethod.GET)
	public ModelAndView chicken(Model model, HttpServletRequest request) {
			
		ListService ls = sqlSession.getMapper(ListService.class);
		ArrayList<ListDTO> list = ls.chicken();
		
		model.addAttribute("list", list);
		
		mav.setViewName("listsearchpage");
		return mav;
	}
	
	@RequestMapping(value = "/drink", method = RequestMethod.GET)
	public ModelAndView drink(Model model, HttpServletRequest request) {
			
		ListService ls = sqlSession.getMapper(ListService.class);
		ArrayList<ListDTO> list = ls.drink();
		
		model.addAttribute("list", list);
		
		mav.setViewName("listsearchpage");
		return mav;
	}
	
	@RequestMapping(value = "/salad", method = RequestMethod.GET)
	public ModelAndView salad(Model model, HttpServletRequest request) {
			
		ListService ls = sqlSession.getMapper(ListService.class);
		ArrayList<ListDTO> list = ls.salad();
		
		model.addAttribute("list", list);
		
		mav.setViewName("listsearchpage");
		return mav;
	}
	
	@RequestMapping(value = "/pork", method = RequestMethod.GET)
	public ModelAndView pork(Model model, HttpServletRequest request) {
			
		ListService ls = sqlSession.getMapper(ListService.class);
		ArrayList<ListDTO> list = ls.pork();
		
		model.addAttribute("list", list);
		
		mav.setViewName("listsearchpage");
		return mav;
	}
	
	@RequestMapping(value = "/beef", method = RequestMethod.GET)
	public ModelAndView beef(Model model, HttpServletRequest request) {
			
		ListService ls = sqlSession.getMapper(ListService.class);
		ArrayList<ListDTO> list = ls.beef();
		
		model.addAttribute("list", list);
		
		mav.setViewName("listsearchpage");
		return mav;
	}
	
	@RequestMapping(value = "/rice", method = RequestMethod.GET)
	public ModelAndView rice(Model model, HttpServletRequest request) {
			
		ListService ls = sqlSession.getMapper(ListService.class);
		ArrayList<ListDTO> list = ls.rice();
		
		model.addAttribute("list", list);
		
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
	
	@RequestMapping(value = "/buy", method = RequestMethod.GET)
	public ModelAndView buy(Model model, HttpServletRequest request) {
		
		String pcode = request.getParameter("pcode");
		int bb = Integer.parseInt(request.getParameter("bb"));
		
		ListService ls = sqlSession.getMapper(ListService.class);
		ArrayList<ListDTO> list = ls.buy(pcode);
		
		model.addAttribute("list", list);
		model.addAttribute("bb", bb);
		
		mav.setViewName("listbuy");
		return mav;
	}
	
	@RequestMapping(value = "/buysave", method = RequestMethod.GET)
	public ModelAndView buysave(Model model, HttpServletRequest request) {
		
		String pcode = request.getParameter("pcode");
		String scode = request.getParameter("scode");
		String omethod = request.getParameter("omethod");
		int bb = Integer.parseInt(request.getParameter("bb"));
		
		ListService ls = sqlSession.getMapper(ListService.class);
		ls.buysave(scode, pcode, bb, omethod);
		
		mav.setViewName("redirect:main");
		return mav;
	}
}
