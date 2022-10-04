package pe.edu.upeu.clase02.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.clase02.service.OrderService;

@RestController
@RequestMapping("/api/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> readAll2(){		
		return orderService.readAll2();
	}	
	
	

}
