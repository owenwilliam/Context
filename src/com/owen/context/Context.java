package com.owen.context;

/**
 * 定义容器的接口方法，要包含放入元素的获取元素
 * @author OwenWilliam 2016-4-24
 * @version 1.0  
 * 
 */
public interface  Context
{
	 public  void setParams(String key, Object value);
	 public  Object getParams(String key);
}
