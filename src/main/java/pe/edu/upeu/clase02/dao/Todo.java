package pe.edu.upeu.clase02.dao;

import java.util.List;
import java.util.Map;

public interface Todo<T> { 
  List<Map<String,Object>> readAll2(); 
  List<Map<String,Object>> readAll3();
  
}

