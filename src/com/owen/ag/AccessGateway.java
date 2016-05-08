package com.owen.ag;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.owen.context.Context;
import com.owen.context.ICContext;
import com.owen.context.TCContext;
import com.owen.customer.Account;
import com.owen.customer.Customer;
import com.owen.ic.IndetityCenter;
import com.owen.tc.TransactionCenter;

/**
 * �ӿ��߼�������
 * @author OwenWilliam 2016-4-24
 * @since 1.0
 *
 */
public class AccessGateway
{
    private final static String IC_SERVICE_ID = "IC";
    private final static String TC_SERVICE_ID = "TC";
    public static void doService(Context context, String serviceId, Object object)
    {
    	//ICҵ��Ĵ���
    	if (object != null && IC_SERVICE_ID.equals(serviceId))
    	{
    		context = new ICContext();
    		Customer customer = (Customer)object;
    		
    		//AGֻ�������жϣ��������Ϣ��Ϊ�վ����ˣ���ʵ��������������ж�
    		//ֻ��ͨ����AG����֤�ɹ�֮��ſɽ��뵽IC��ҵ����
    		if ("".equals(customer.getUsename()) || "".equals(customer.getPassword()))
    		{
    			JOptionPane.showMessageDialog(null,
    			          "Your information is wrong!", "Error",
    			          JOptionPane.ERROR_MESSAGE);
    		}
    		else
    		{
    			context.setParams("usename", customer.getUsename());
    			context.setParams("password", customer.getPassword());
    			IndetityCenter.doReceive(context);
    		}
    		
    	}
    	//TCҵ��Ĵ���
    	else if (object != null && TC_SERVICE_ID.equals(serviceId))
    	{
    		context = new TCContext();
    		Account account = (Account)object;
    		context.setParams("amount", account.getAmount());
			context.setParams("pass", account.getPass());
    		TransactionCenter.doReceive(context);
    	}
    }

	
}
