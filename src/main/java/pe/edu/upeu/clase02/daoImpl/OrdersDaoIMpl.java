package pe.edu.upeu.clase02.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.upeu.clase02.dao.Todo;
import pe.edu.upeu.clase02.entity.Orders;

@Component
public class OrdersDaoIMpl implements Todo<Orders> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL = "select o.ShipCountry Orden,count(c.CustomerID) as Cantidad from orders o  \n"
				+ "inner join customers c\n"
				+ "on  o.CustomerID =c.CustomerID\n"
				+ "group by c.Country\n"
				+ "order by 1;";
		return jdbcTemplate.queryForList(SQL);
		
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	

	
	
}
