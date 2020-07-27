package com.ram.msg.msgConfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("message-service")
public class Configuration {
	
	

	private String ramMsg;
	private String amolMsg;
	
	public Configuration() {
		// TODO Auto-generated constructor stub
	}

	public Configuration(String ramMsg, String amolMsg) {
		super();
		this.ramMsg = ramMsg;
		this.amolMsg = amolMsg;
	}

	public String getRamMsg() {
		return ramMsg;
	}

	public void setRamMsg(String ramMsg) {
		this.ramMsg = ramMsg;
	}

	public String getAmolMsg() {
		return amolMsg;
	}

	public void setAmolMsg(String amolMsg) {
		this.amolMsg = amolMsg;
	}

	
	@Override
	public String toString() {
		return "Configuration [ramMsg=" + ramMsg + ", amolMsg=" + amolMsg + "]";
	}

}
