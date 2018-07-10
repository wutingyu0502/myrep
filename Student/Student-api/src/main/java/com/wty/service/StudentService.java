package com.wty.service;

import java.util.List;
import java.util.Map;

import com.wty.entity.vo.StuVo;

public interface StudentService {

	List getStuList(Map<Object, Object> map);

	Integer getCount(Map<Object, Object> map);

	void add(StuVo sv);

	StuVo getStu(Integer sid);

	void update(StuVo sv);

	void delete(Integer sid);

	void add1(StuVo sv);

}
