package com.abstractdog.spring.boot.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abstractdog.spring.boot.mybatis.dao.Dao;

@Service
public class DaoService {
	private final Dao dao;

	@Autowired
	public DaoService(Dao dao) {
		this.dao = dao;
	}

	public String select1() {
		return dao.select1();
	}
	
	public String select1xml() {
		return dao.select1xml();
	}
}
