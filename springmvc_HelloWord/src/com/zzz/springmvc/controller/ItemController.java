package com.zzz.springmvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zzz.springmvc.bean.Item;

@RequestMapping("/itemController")
@Controller
public class ItemController {

	@RequestMapping("/item.do") // 映射请求的URL
	public ModelAndView queryItems() {
		// 创建页面需要显示的商品数据
		List<Item> list = new ArrayList<>();
		list.add(new Item(1, "1华为 荣耀8", 2399, new Date(), "质量好！1"));
		list.add(new Item(2, "2华为 荣耀8", 2399, new Date(), "质量好！2"));
		list.add(new Item(3, "3华为 荣耀8", 2399, new Date(), "质量好！3"));
		list.add(new Item(4, "4华为 荣耀8", 2399, new Date(), "质量好！4"));
		list.add(new Item(5, "5华为 荣耀8", 2399, new Date(), "质量好！5"));
		list.add(new Item(6, "6华为 荣耀8", 2399, new Date(), "质量好！6"));
		// 创建ModelAndView
		ModelAndView mv = new ModelAndView("/WEB-INF/jsp/itemList.jsp");
		//把数据添加到视图中
		mv.addObject(list);
		return mv;
	}
}
