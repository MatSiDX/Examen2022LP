package pe.edu.upeu.clase02.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.clase02.dao.Todo;
import pe.edu.upeu.clase02.daoImpl.OrdersDaoIMpl;
import pe.edu.upeu.clase02.entity.Orders;

@Service
public class OrderService implements Todo<Orders> {

	@Autowired
	private OrdersDaoIMpl daoIMpl;

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll2();
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return null;
	}

	


}
