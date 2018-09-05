package ProxyHandller;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
	
  public static void main(String[] args) {
	
	  Car car = new Car();
	  InvocationHandler h =new TimeHandler(car);
	  Moveable m =(Moveable)Proxy.newProxyInstance(car.getClass().getClassLoader(), car.getClass().getInterfaces(), h);
	  requireNonNull(car);
	  m.move();
	  
}
  
  public static <T> T requireNonNull(T obj) {
      if (obj == null)
          throw new NullPointerException();
      return obj;
  }

}
