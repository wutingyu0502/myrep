package com.wty.mapper;

import com.wty.entity.Hobby;
import com.wty.entity.HobbyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HobbyMapper {
    long countByExample(HobbyExample example);

    int deleteByExample(HobbyExample example);

    int deleteByPrimaryKey(Integer hid);

    int insert(Hobby record);

    int insertSelective(Hobby record);

    List<Hobby> selectByExample(HobbyExample example);

    Hobby selectByPrimaryKey(Integer hid);

    int updateByExampleSelective(@Param("record") Hobby record, @Param("example") HobbyExample example);

    int updateByExample(@Param("record") Hobby record, @Param("example") HobbyExample example);

    int updateByPrimaryKeySelective(Hobby record);

    int updateByPrimaryKey(Hobby record);

	List getHobList();
}