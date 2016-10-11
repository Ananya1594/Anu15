package com.store.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.store.model.Category;

@Repository("categoryDao")
@Transactional
public class CategoryDaoImpl implements CategoryDao {
    	
    	
@Autowired
private SessionFactory sessionFactory;

public CategoryDaoImpl(SessionFactory sessionFactory)
{
	this.sessionFactory = sessionFactory;
}

@Transactional
public boolean save(Category category) {
	
	try
	{
		sessionFactory.getCurrentSession().save(category);
	}catch(Exception e)
	{
		
	}
	return true;
}

@Transactional
public boolean update(Category category) {
	
	try
	{
		sessionFactory.getCurrentSession().update(category);
	}catch(Exception e)
	{
		e.printStackTrace();
		return false;
	}
	return true;
}
@Transactional
public void delete(String id) {
	
	try
	{
		sessionFactory.getCurrentSession().delete(get(id));
	}catch(Exception e)
	{
		e.printStackTrace();
    }
}
@Transactional
public CategoryDao get(String id) {
	
	String hql = "from Category where id=" + "'" + id + "'" ;
	
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	
	List<Category> list= query.list();
	
	if(list !=null && !list.isEmpty())
	{
		return null;
	}
return (CategoryDao) list.get(0);
}

@Transactional

public List<Category> list() {
	
	return null;
}

}
	
