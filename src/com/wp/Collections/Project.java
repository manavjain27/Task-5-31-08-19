package com.wp.Collections;

public class Project {
	
	public int pCode;
	public String pTitle;
	public String pDuration;
	public String pClientName;
	
	
	public Project(int pCode, String pTitle, String pDuration, String pClientName) {
		super();
		this.pCode = pCode;
		this.pTitle = pTitle;
		this.pDuration = pDuration;
		this.pClientName = pClientName;
	}


	@Override
	public String toString() {
		return "Project [pCode=" + pCode + ", pTitle=" + pTitle + ", pDuration=" + pDuration + ", pClientName="
				+ pClientName + "]";
	}
	
	
	
	
	

}
