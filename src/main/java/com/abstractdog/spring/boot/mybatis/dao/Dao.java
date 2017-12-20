package com.abstractdog.spring.boot.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dao {

	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	private XmlMapper xmlMapper;

	public String select1() {
		return sqlSession.selectOne("select1", null);
	}
	
	public String select1xml() {
		return xmlMapper.select1xml();
	}
}
