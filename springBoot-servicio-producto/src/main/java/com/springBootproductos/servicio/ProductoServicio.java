package com.springBootproductos.servicio;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBootproductos.entity.Category;
import com.springBootproductos.entity.Product;
import com.springBootproductos.repository.ProductRepository;

@Service
public class ProductoServicio implements ProductoDao<Product, Category>{

	@Autowired
	ProductRepository repo;
	
	public List<Product> listObjeto() {
				
		return repo.findAll();
	}

	public Product IdProduct(Long id) {
		
		return repo.findById(id).orElse(null);
	}

	public Product addObjeto(Product objeto) {
		
		if (objeto ==null)
		{
			return null;	
		}
		
		return repo.save(objeto);
		
	}

	public Product updateObjeto(Product objeto, Long id) {
		
		if(this.IdProduct(id) != null)
		{
			objeto.setId(id);
			objeto.setCreateAt(new Date());
			return repo.save(objeto);
		}
		
		return null;
	}

	public Boolean deleteObjeto(Long id) {
		
		Product p=this.IdProduct(id);
		
		if( p != null)
		{
			repo.delete(p);
			return true;
		}
		return false;
	}

	public List<Product> listCategory(Category c) {
		
		return repo.findByCategory(c);
		
	}

//	public Product nameObjeto(String name) {
//		
//		Product p = repo.findByNameProducto(name);
//		if(p != null)
//		{
//			return p;
//		}
//		return null;
//	}
	
	
}
