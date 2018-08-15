package com.example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class IndexBean {
	private double simpleInterest;
	private String message = "Hello  Welcome to JSF!";
    private double principle;
    private int years;
    private double interest;

    public double getSimpleInterest()
    {
    	return simpleInterest;
    }
    public void setSimpleInterest(double simpleInterest)
    {
    	this.simpleInterest = simpleInterest;
    }
    
    public double getPrinciple()
    {
    	return principle;
    }
    
    public void setPrinciple(double principle)
    {
    	this.principle = principle;
    }
    
    public int getYears()
    {
    	return years;
    }
    
    public void setYears(int years)
    {
    	this.years = years;
    }
    
    public double getInterest()
    {
    	return interest;
    }
    
    public void setInterest(double interest)
    {
    	this.interest = interest;
    }
    
    public String getMessage()
    {
    	return message;
    }
    
    public void setMessage(String message)
    {
    	this.message = message;
    }
    
    public String calculateSI()
    {
    	simpleInterest = principle * interest * years;
    	return "index";
    }
}