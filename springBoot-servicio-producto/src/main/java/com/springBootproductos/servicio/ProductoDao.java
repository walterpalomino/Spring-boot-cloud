package com.springBootproductos.servicio;

import java.util.List;

public interface ProductoDao<T,C> {
	
	
	
	
	public List<T> listObjeto();
	public T IdProduct(Long id);
	public T addObjeto(T objeto);
	public T updateObjeto(T objeto, Long id);
	public Boolean deleteObjeto(Long id);
	public List<T> listCategory(C c);
	

}
