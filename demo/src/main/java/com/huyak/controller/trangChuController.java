package com.huyak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //định danh cho trangchuController
public class trangChuController{
	@RequestMapping("/")
	public String viewTrangChu() {
		return "trangchu";
	}

	@RequestMapping("/login")
	public String viewLogin(){
		return "login";
	}
}
