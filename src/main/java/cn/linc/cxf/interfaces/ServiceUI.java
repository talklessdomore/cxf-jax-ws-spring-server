package cn.linc.cxf.interfaces;


import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import cn.linc.cxf.domain.Car;
import cn.linc.cxf.domain.User;

@WebService
public interface ServiceUI {
	@WebMethod
	String sayHello(String name);
	@WebMethod
	List<Car> fingCarsByUser(User user);
}
