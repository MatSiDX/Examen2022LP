package pe.edu.upeu.clase02.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categories implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int CategoryID;
	private String CategoryName;
	private String OrderDate;
	
	public int getCategoryID() {
		return CategoryID;
	}
	public void setCategoryID(int categoryID) {
		CategoryID = categoryID;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public String getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(String orderDate) {
		OrderDate = orderDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
		
	
	
	
	
	
	
	
	
}
