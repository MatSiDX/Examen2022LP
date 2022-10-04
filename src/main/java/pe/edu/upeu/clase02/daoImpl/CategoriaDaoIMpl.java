package pe.edu.upeu.clase02.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.upeu.clase02.dao.Todo;
import pe.edu.upeu.clase02.entity.Categories;

@Component
public class CategoriaDaoIMpl implements Todo<Categories> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL = "select c.CategoryName as categoria,count(p.CategoryID) as cantidad from products p \n"
				+ "inner join categories c\n"
				+ "on  p.CategoryID =c.CategoryID\n"
				+ "group by p.CategoryID\n"
				+ "order by 2;";
		return jdbcTemplate.queryForList(SQL);
		
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		String SQL = "select o.OrderDate as FechadeOrden, count(c.CustomerID) as Cantidad from orders o  \n"
				+ "inner join customers c\n"
				+ "on  o.CustomerID =c.CustomerID\n"
				+ "group by c.Country\n"
				+ "order by 1;";
		return jdbcTemplate.queryForList(SQL);
		
	}

	

	

	

	
	
}
