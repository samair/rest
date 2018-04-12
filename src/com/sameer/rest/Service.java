package com.sameer.rest;

import java.util.ArrayList;
import java.util.List;

public class Service {
	private List<DomainManager> dmList =  new ArrayList<DomainManager>();

	public List<DomainManager> getDomainManagers(){
		

		dmList.add(new DomainManager("SAM","MOM", "AM_PM"));
		dmList.add(new DomainManager("AM","AM", "NA"));
		dmList.add(new DomainManager("ESM","AM", "AM"));
		
		return dmList;
		
	}
	
	
	public DomainManager getDomainManager(String DomainName)
	{
		DomainManager dtore = null;
		for(DomainManager d : dmList)
		{
			if(d.getDomainName().equals(DomainName))
			{
				dtore = d;
				break;
			}
		}
		
		return dtore;
	}
	
	
}
