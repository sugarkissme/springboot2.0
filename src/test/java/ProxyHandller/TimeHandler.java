package ProxyHandller;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler  {
	private Object target;
	
	public TimeHandler(Object target) {
		super();
		this.target = target;
	}



	/**
	 * proxy 被代理对象
	 * method 被代理对象方法
	 * args 方法的参数
	 */
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("这是动态代理类开始");
		method.invoke(target,args);
		System.out.println("这是动态代理类结束");
		return null;
	}
	
	

}
