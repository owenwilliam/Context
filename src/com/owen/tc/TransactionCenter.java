package com.owen.tc;

import java.util.Scanner;

import com.owen.context.Context;
import com.owen.context.TCContext;

/**
 * 交易处理逻辑类
 * @author OwenWilliam 2016-4-24
 * @since 1.0 
 *
 */
public class TransactionCenter
{
	private static Scanner  scan;
	private static String read;
    public static void doReceive(Context context)
    {
    	 scan = new Scanner(System.in);
    	 System.out.println("Do you want to cash in "+ context.getParams("amount") +"?(Y/N)");
	     read = scan.next();
	     
	     if ("Y".equals(read))
	     {
	    	 System.out.println("TC receive from AG");
	     	 System.out.println(
	     			          "amount:" + context.getParams("amount") +
	     			          "pass:" + context.getParams("pass") );
	     }
	     else
	     {
	    	 System.out.println("you cancel the transaction!");
	     }
    	
    }
}
