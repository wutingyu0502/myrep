package com.wty.mapper;

import com.wty.entity.SH;
import com.wty.entity.SHExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SHMapper {
    long countByExample(SHExample example);

    int deleteByExample(SHExample example);

    int insert(SH record);

    int insertSelective(SH record);

    List<SH> selectByExample(SHExample example);

    int updateByExampleSelective(@Param("record") SH record, @Param("example") SHExample example);

    int updateByExample(@Param("record") SH record, @Param("example") SHExample example);

	void add(Map<Object, Object> map);

	void delete(Integer sid);
}