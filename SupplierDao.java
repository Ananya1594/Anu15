package com.store.dao;

import java.util.List;

import com.store.model.Supplier;

public interface SupplierDao {
	
	public boolean save(Supplier supplier);
	public boolean update(Supplier supplier);
	public void delete(String id);
	public SupplierDao get(String id);
	public List<Supplier> list();

}
