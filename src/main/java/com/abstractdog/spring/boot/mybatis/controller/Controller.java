package com.abstractdog.spring.boot.mybatis.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abstractdog.spring.boot.mybatis.service.DaoService;

@RestController
@RequestMapping(value = "/")
public class Controller {

	private final DaoService daoService;

	public Controller(DaoService daoService) {
		this.daoService = daoService;
	}

	@RequestMapping(value = "/select1", method = RequestMethod.GET)
	public String select1() {
		return daoService.select1();
	}
	
	@RequestMapping(value = "/select1xml", method = RequestMethod.GET)
	public String select1xml() {
		return daoService.select1xml();
	}
}
