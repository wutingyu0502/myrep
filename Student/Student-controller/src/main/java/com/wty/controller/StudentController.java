package com.wty.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wty.entity.Hobby;
import com.wty.entity.vo.StuVo;
import com.wty.service.HobbyService;
import com.wty.service.StudentService;
import com.wty.utils.PageUtil;

@Controller
@RequestMapping("/stu/")
public class StudentController {
	@Resource
	private StudentService ss;
	@Resource
	private HobbyService hs;
	
	/**
	 * 列表
	 */
	@RequestMapping("list")
	public String list(Model m,String sname,Integer page,HttpServletRequest request)
	{
		Integer pageNum = page == null ? 1 : page;
		
		Integer pageSize = 3;
		
		Integer start = (pageNum-1)*3;
		
		Map<Object,Object> map = new HashMap<Object,Object>();
		
		map.put("sname", sname);
		
		map.put("start", start);
		
		List list = ss.getStuList(map);
		
		Integer listCount = ss.getCount(map);
		
		String url = "/stu/list";
		PageUtil.page(request, url, pageSize, list, listCount, pageNum, map);
		return "list";
	}
	
	
	/**
	 * qu添加
	 */
	
	@RequestMapping(value="add",method=RequestMethod.GET)
	public String add(Model m)
	{
		List<Hobby> list =  hs.getHobList();
		m.addAttribute("list", list);
		return "add";
	}
	
	/**
	 * 添加
	 */
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(StuVo sv)
	{
		ss.add(sv);
		return "redirect:list";
	}
	
	/**
	 * 去更新
	 */
	@RequestMapping("upd")
	public String upd(Model m,Integer sid)
	{
		StuVo sv = ss.getStu(sid);
		List list = hs.getHobList();
		m.addAttribute("stu", sv);
		m.addAttribute("list", list);
		return "upd";
	}
	
	/**
	 * 更新
	 */
	@RequestMapping("update")
	public String update(StuVo sv)
	{
		ss.update(sv);
		ss.delete(sv.getSid());
		ss.add1(sv);
		return "redirect:list";
	}
	
}
