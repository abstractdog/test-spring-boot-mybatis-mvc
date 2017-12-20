package com.abstractdog.spring.boot.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface XmlMapper {
	String select1xml ();
}
