package com.ram.limits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.limits.limitconfiguration.Configuration;
import com.ram.limits.limitconfiguration.LimitConfiguration;

@RestController
public class LimitsController {

	@Autowired
	private Configuration config;
	
	@GetMapping("/limits")
	public LimitConfiguration limits()
	{
		return new LimitConfiguration(config.getMaximum(),config.getMinimum());
	}
}
