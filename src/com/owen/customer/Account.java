package com.owen.customer;

/**
 * ’Àªß
 * @author OwenWilliam 2016-4-24
 * @since 1.0 
 *
 */
public class Account
{
     private String pass;
     private String what;
     private String amount;
     
     
	public Account(String pass, String amount, String what)
	{
		super();
		this.pass = pass;
		this.amount = amount;
		this.what = what;
	}
	
	public String getPass()
	{
		return pass;
	}

	public void setPass(String pass)
	{
		this.pass = pass;
	}

	public String getWhat()
	{
		return what;
	}
	public void setWhat(String what)
	{
		this.what = what;
	}
	public String getAmount()
	{
		return amount;
	}
	public void setAmount(String amount)
	{
		this.amount = amount;
	}
    
     
}
