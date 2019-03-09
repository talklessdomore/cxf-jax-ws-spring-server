package cn.linc.cxf.interfaces.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import cn.linc.cxf.domain.Car;
import cn.linc.cxf.domain.User;
import cn.linc.cxf.interfaces.ServiceUI;

@WebService(endpointInterface="cn.linc.cxf.interfaces.ServiceUI",serviceName="userService")
public class ServiceUIImpl implements ServiceUI {
	public String sayHello(String name) {
		return "hello  "+name ;
	}
	public List<Car> fingCarsByUser(User user) {
		if ("xiaoming".equals(user.getUsername())) {
			List<Car> cars = new ArrayList<Car>();
			Car car1 = new Car();
			car1.setId(1);
			car1.setCarName("大众");
			car1.setPrice(200000d);
			cars.add(car1);

			Car car2 = new Car();
			car2.setId(2);
			car2.setCarName("现代");
			car2.setPrice(170000d);
			cars.add(car2);

			return cars;
		} else {
			return null;
		}
	}


	
	

}
