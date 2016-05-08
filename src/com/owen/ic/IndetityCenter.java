package com.owen.ic;

import com.owen.context.Context;
import com.owen.context.MQContext;

/**
 * 用户信息处理逻辑类
 * @author OwenWilliam 2016-4-24
 * @since 1.0 
 *
 */
public class IndetityCenter
{
    public static void doReceive(Context context)
    {
    	
    	if ("owen".equals(context.getParams("usename")) 
    			 && "1234".equals(context.getParams("password")))
    	{
    		context = new MQContext();
    		context.setParams("IC","SYS0000");
    	}
    	else
    	{
    		context = new MQContext();
    		context.setParams("IC","IC400");
    	}
    }
}
