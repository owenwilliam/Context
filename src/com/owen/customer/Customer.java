package com.owen.customer;

/**
 * ”√ªß
 * @author OwenWilliam 2016-4-24
 * @version 1.0 
 *
 */
public class Customer
{
    private String usename;
    private String password;
    
	public Customer(String usename, String password)
	{
		super();
		this.usename = usename;
		this.password = password;
	}
	public String getUsename()
	{
		return usename;
	}
	public void setUsename(String usename)
	{
		this.usename = usename;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
    
}
