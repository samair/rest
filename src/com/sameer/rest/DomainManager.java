package com.sameer.rest;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class DomainManager {

	private String DomainName;
	private String type;
	private Date timestamp;
	private String manages;
	
	public DomainManager(){
		
	}
	
	public DomainManager(String DomainN, String t, String m)
	{
		this.DomainName = DomainN;
		this.timestamp = new Date();
		this.type = t;
		this.manages = m;
	}
	
	
	public String getDomainName() {
		return DomainName;
	}
	public void setDomainName(String domainName) {
		DomainName = domainName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getManages() {
		return manages;
	}
	public void setManages(String manages) {
		this.manages = manages;
	}
	
}
