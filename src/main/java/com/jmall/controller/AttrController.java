package com.jmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jmall.bean.MODEL_T_MALL_ATTR;
import com.jmall.service.AttrServiceInf;

@Controller
public class AttrController {
	
	@Autowired
	AttrServiceInf attrServiceInf;
	
	@RequestMapping("goto_attr_add")
	public String goto_attr_add(int flbh2,ModelMap map){
		map.put("flbh2", flbh2);
		return "attrAdd";
	}
	
	@RequestMapping("attr_add")
	public ModelAndView attr_add(int flbh2,MODEL_T_MALL_ATTR list_attr){
		ModelAndView mv = new ModelAndView("redirect:/goto_attr_add.do");
		mv.addObject("flbh2", flbh2);
		return mv;
	}
}
