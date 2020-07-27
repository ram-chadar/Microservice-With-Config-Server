package com.ram.msg.msgConfiguration;

public class MsgConfiguration {

	private String ramMsg;
	private String amolMsg;
	
	public MsgConfiguration() {
		// TODO Auto-generated constructor stub
	}

	public MsgConfiguration(String ramMsg, String amolMsg) {
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
		return "MsgConfiguration [ramMsg=" + ramMsg + ", amolMsg=" + amolMsg + "]";
	}
	
	
}
