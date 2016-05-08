package com.owen.context;

import java.util.HashMap;
import java.util.Map;

/**
 * 交易用的容器
 * @author OwenWilliam 2016-4-24
 * @since 1.0 
 *
 */
public class TCContext implements Context
{
	
    public static Map<String,Object> parameters;
    static
    {
    	parameters = new HashMap<String,Object>();
    }
     
   
    
	@Override
	public void setParams(String key, Object value)
	{
		parameters.put(key, value);
		
	}

	@Override
	public Object getParams(String key)
	{
		return parameters.get(key);
	}

	
}
