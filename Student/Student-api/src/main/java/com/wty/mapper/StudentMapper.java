package com.wty.mapper;

import com.wty.entity.Student;
import com.wty.entity.StudentExample;
import com.wty.entity.vo.StuVo;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

	List getStuList(Map<Object, Object> map);

	Integer getCount(Map<Object, Object> map);

	int add(StuVo sv);

	StuVo getStu(Integer sid);

	void update(StuVo sv);
}