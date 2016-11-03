package com.bit2016.emaillist.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.bit2016.emaillist.dao.EmailListDao;
import com.bit2016.emaillist.vo.EmailListVo;

@Controller
public class EmailListController {
	private EmailListDao emailListDao;

	public String list(Model model) {
		List<EmailListVo> list = emailListDao.getList();
		model.addAttribute("list", list);
		
		return "/WEB-INF/views/list.jsp";
	}
}
