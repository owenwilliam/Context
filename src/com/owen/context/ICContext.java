package com.owen.context;

import java.util.HashMap;
import java.util.Map;
import com.owen.context.Context;
/**
 * �û������õ�����
 * @author OwenWilliam 2016-4-24
 * @version 1.0 
 *
 */
public class ICContext implements Context
{
	public static  Map<String,Object> ICContext;
	 static
	    {
	    	ICContext = new HashMap<String,Object>();
	    }

	@Override
	public void setParams(String key, Object value)
	{
		ICContext.put(key, value);
		
	}
	@Override
	public Object getParams(String key)
	{
		return ICContext.get(key);
	}
}
