package com.owen.context;

/**
 * ���������Ľӿڷ�����Ҫ��������Ԫ�صĻ�ȡԪ��
 * @author OwenWilliam 2016-4-24
 * @version 1.0  
 * 
 */
public interface  Context
{
	 public  void setParams(String key, Object value);
	 public  Object getParams(String key);
}
