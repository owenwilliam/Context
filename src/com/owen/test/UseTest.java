package com.owen.test;


import java.util.Scanner;
import javax.swing.JOptionPane;

import com.owen.ag.AccessGateway;
import com.owen.context.Context;
import com.owen.context.MQContext;
import com.owen.customer.Account;
import com.owen.customer.Customer;
/**
 * 
 * @author OwenWilliam 2016-4-24
 * @version 1.0
 *
 */
public class UseTest
{

	private static Scanner scan;
	private static String read;
	private static String username;
	private static String password;
	private static Context context = null;
	
	public static void main(String[] args)
	{
		
		     scan = new Scanner(System.in);
		     System.out.print("请输入您的姓名：");
		     username = scan.next();
		     System.out.print("请输入您的密码：");
		     password = scan.next();
		     Customer customer = new Customer(username,password);
		     
		     AccessGateway.doService(context, "IC", customer);
		     context = new  MQContext();
		     if( context.getParams("IC").equals("SYS0000"))
		     {
		    	 Object[] options = { "Y", "N" };
		   	     int sel = JOptionPane.showConfirmDialog(null,
		         "Logining successfully,do you want to continue?", "Login information",
		         JOptionPane.YES_NO_OPTION);
		   	     
		   	     if (options[sel].equals("Y"))
		   	     {
		   	    	 System.out.println("menu:\n" +"input number :\n" + "1.Cash in\n" 
		                     + "2.Cash out\n" + "3.Request Loan");
		        	 read = scan.next();
		        	 
		        	 getInputNUm(read);
		   	     }
		   	     else
		   	     {
		   	    	 System.out.println("cancel ");
		   	     }
		     }
		     else
		     {
		    	 System.out.println("Logging failed!");
		     }
		      
		 
	}
	
	/**
	 * 显示菜单
	 * @param num 菜单对应 的数据
	 */
	public static void getInputNUm(String num)
	{
		 switch (read)
			{
			case "1":
				System.out.println("Cash in : please enter your amount:");
				String amount = scan.next();
				System.out.println("Cash in : please enter your password:");
				String pass = scan.next();
				Account account = new Account(pass,amount,"1");
				 AccessGateway.doService(context, "TC", account);
				
				break;
			case "2":
				//TODO
				System.out.println("Cash out");
				break;
			case "3":
				//TODO
				System.out.println("Request Loan");
				break;
			}
	}

}
