package com.wty.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.google.gson.Gson;
import com.wty.entity.vo.StuVo;
import com.wty.helper.Provider;
import com.wty.mapper.HobbyMapper;
import com.wty.service.HobbyService;

public class HobbyServiceImpl implements HobbyService {
	@Resource
	private HobbyMapper hm;
	@Resource
	Provider p;
	
	@Override
	public List getHobList() {
		// TODO Auto-generated method stub
		return hm.getHobList();
	}

	
}
