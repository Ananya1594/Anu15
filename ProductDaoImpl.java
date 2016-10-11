package com.store.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.store.model.Product;

@Repository("ProductDao")
@Transactional
public class ProductDaoImpl implements ProductDao {
    	
    	
@Autowired
private SessionFactory sessionFactory;

public ProductDaoImpl(SessionFactory sessionFactory)
{
	this.sessionFactory = sessionFactory;
}

@Transactional
public boolean save(Product product) {
	
	try
	{
		sessionFactory.getCurrentSession().save(product);
	}catch(Exception e)
	{
		
	}
	
	return true;
}

@Transactional
public boolean update(Product product) {
	
	try
	{
		sessionFactory.getCurrentSession().update(product);
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
public ProductDao get(String id) {
	
	String hql = "from Product where id = '" + id + "'";
	Query query= sessionFactory.getCurrentSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	
	List<Product> list = query.list();
	
	if(list == null || list.isEmpty())
	{
    return null;
	}
	return (ProductDao) list.get(0);
}

@Transactional
public List<Product> list() {
	
	return null;
}
}




