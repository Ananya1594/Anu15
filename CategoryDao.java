package com.store.dao;

import java.util.List;

import com.store.model.Category;

public interface CategoryDao {
	
	public boolean save(Category category);
	public boolean update(Category category);
	public void delete(String id);
	public CategoryDao get(String id);
	public List<Category> list();

}
