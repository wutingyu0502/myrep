package com.wty.helper;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import com.google.gson.Gson;
import com.wty.entity.vo.StuVo;
import com.wty.mapper.SHMapper;
import com.wty.mapper.StudentMapper;

public class Consumer {
	@Resource
	StudentMapper sm;
	@Resource
	SHMapper shm;
	public void read(Object message)
	{
		Gson g = new Gson();
		StuVo sv = g.fromJson((String) message,StuVo.class);
		int a = sm.add(sv);
		Map<Object,Object> map = new HashMap<Object,Object>();
		map.put("sid", sv.getSid());
		map.put("hid", sv.getHid());
		shm.add(map);
		System.out.println("this message -> "+message);
	}
}
