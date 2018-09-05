package ProxyHandller;

import ProxyHandller.Moveable;

public class Car implements Moveable{

	@Override
	public void move() {
		System.out.println("汽车开始启动");
		
		try {
			Thread.sleep(1000l);
			System.out.println("汽车行驶中");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
