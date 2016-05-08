package com.owen.context;

import java.util.HashMap;
import java.util.Map;

/**
 * 短信通知的容器
 * @author OwenWilliam 2016-4-24
 * @since 1.0 
 *
 */
public class MQContext implements Context
{
	public static  Map<String,Object> MQContext;
	 static
	    {
	    	MQContext = new HashMap<String,Object>();
	    }
	
	@Override
	public void setParams(String key, Object value)
	{
		MQContext.put(key, value);

	}

	@Override
	public Object getParams(String key)
	{
		return MQContext.get(key);
	}

}
