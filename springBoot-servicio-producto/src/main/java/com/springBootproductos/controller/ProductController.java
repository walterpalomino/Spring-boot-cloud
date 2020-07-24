package com.springBootproductos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBootproductos.entity.Category;
import com.springBootproductos.entity.Product;
import com.springBootproductos.servicio.ProductoDao;

@RestController
public class ProductController {
			
	@Autowired
	ProductoDao<Product, Category> servicio;
	
	
	
	@GetMapping("/listado")
	public ResponseEntity<List<Product>> listadoProducto(){
		
		List<Product> p=servicio.listObjeto();
		
		if(p.isEmpty())
		{  
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(p);
	}
	
	public ResponseEntity<Product> addProduct(@RequestBody Product p)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(servicio.addObjeto(p));
	}
	
	

}
