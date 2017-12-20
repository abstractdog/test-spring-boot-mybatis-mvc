package com.abstractdog.spring.boot.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface IMapper {
	@Select("SELECT 1")
	String select1();
}
