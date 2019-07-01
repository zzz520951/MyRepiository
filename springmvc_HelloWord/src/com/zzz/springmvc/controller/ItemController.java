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

	@RequestMapping("/item.do") // ӳ�������URL
	public ModelAndView queryItems() {
		// ����ҳ����Ҫ��ʾ����Ʒ����
		List<Item> list = new ArrayList<>();
		list.add(new Item(1, "1��Ϊ ��ҫ8", 2399, new Date(), "�����ã�1"));
		list.add(new Item(2, "2��Ϊ ��ҫ8", 2399, new Date(), "�����ã�2"));
		list.add(new Item(3, "3��Ϊ ��ҫ8", 2399, new Date(), "�����ã�3"));
		list.add(new Item(4, "4��Ϊ ��ҫ8", 2399, new Date(), "�����ã�4"));
		list.add(new Item(5, "5��Ϊ ��ҫ8", 2399, new Date(), "�����ã�5"));
		list.add(new Item(6, "6��Ϊ ��ҫ8", 2399, new Date(), "�����ã�6"));
		// ����ModelAndView
		ModelAndView mv = new ModelAndView("/WEB-INF/jsp/itemList.jsp");
		//��������ӵ���ͼ��
		mv.addObject(list);
		return mv;
	}
}
