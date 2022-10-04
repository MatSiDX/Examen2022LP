package pe.edu.upeu.clase02.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int OrderID;
	private String ShipCountry;

	public int getOrderID() {
		return OrderID;
	}
	public void setOrderID(int orderID) {
		OrderID = orderID;
	}
	public String getShipCountry() {
		return ShipCountry;
	}
	public void setShipCountry(String shipCountry) {
		ShipCountry = shipCountry;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
		
	
	
	
	
	
}
