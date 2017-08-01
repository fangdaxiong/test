package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;


@Api(value = "test接口",description="test接口method")
@Controller
@RequestMapping("/api")
public class TestController {

    @RequestMapping(value ="/test",method = RequestMethod.GET)
    @ResponseBody
	public String listAll(){
		
		return "this is a test!";
	}
}
