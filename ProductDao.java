package com.store.dao;

import java.util.List;

import com.store.model.Product;

public interface ProductDao {
	
	public boolean save(Product product);
	public boolean update(Product product);
	public void delete(String id);
	public ProductDao get(String id);
	public List<Product> list();

}
