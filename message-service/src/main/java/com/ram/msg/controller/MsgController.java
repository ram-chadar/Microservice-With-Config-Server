package com.ram.msg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.msg.msgConfiguration.Configuration;
import com.ram.msg.msgConfiguration.MsgConfiguration;

@RestController
public class MsgController {

	@Autowired
	private Configuration config;
	
	@GetMapping("/byram")
	public String byram() {
		return "Message From Ram:-" +config.getRamMsg();
	}
	
	@GetMapping("/byamol")
	public String byamol() {
		return "Message From Amol :-" +config.getAmolMsg();
	}
	
	@GetMapping("/both")
	public MsgConfiguration both() {
		return new MsgConfiguration(config.getRamMsg(),config.getAmolMsg());
	}
	
}
