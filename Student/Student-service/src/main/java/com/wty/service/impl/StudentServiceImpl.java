package com.wty.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.google.gson.Gson;
import com.wty.entity.vo.StuVo;
import com.wty.helper.Provider;
import com.wty.mapper.SHMapper;
import com.wty.mapper.StudentMapper;
import com.wty.service.StudentService;

public class StudentServiceImpl implements StudentService{
	@Resource
	private StudentMapper sm;
	@Resource
	private SHMapper shm;
	@Resource
	private Provider p;
	@Override
	public List getStuList(Map<Object, Object> map) {
		// TODO Auto-generated method stub
		return sm.getStuList(map);
	}

	@Override
	public Integer getCount(Map<Object, Object> map) {
		// TODO Auto-generated method stub
		return sm.getCount(map);
	}

	@Override
	public void add(StuVo sv) {
		Gson g = new Gson();
		String json = g.toJson(sv);
		
		p.send(json);
		
	}

	@Override
	public StuVo getStu(Integer sid) {
		// TODO Auto-generated method stub
		return sm.getStu(sid);
	}

	@Override
	public void update(StuVo sv) {
		// TODO Auto-generated method stub
		sm.update(sv);
		
	}

	@Override
	public void delete(Integer sid) {
		// TODO Auto-generated method stub
		shm.delete(sid);
	}

	@Override
	public void add1(StuVo sv) {
		Map<Object,Object> map = new HashMap<Object,Object>();
		map.put("sid", sv.getSid());
		map.put("hid", sv.getHid());
		shm.add(map);
		
	}

}
