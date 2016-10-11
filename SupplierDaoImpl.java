package com.store.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.store.model.Supplier;

@Repository("SupplierDao")
@Transactional
public class SupplierDaoImpl implements SupplierDao {
    	
    	
@Autowired
private SessionFactory sessionFactory;

public SupplierDaoImpl(SessionFactory sessionFactory)
{
	this.sessionFactory = sessionFactory;
}

@Transactional
public boolean save(Supplier supplier) {
	
	try
	{
		sessionFactory.getCurrentSession().save(supplier);
	}catch(Exception e)
	{
		
	}
	
	return true;
}

@Transactional
public boolean update(Supplier supplier) {
	
	try
	{
		sessionFactory.getCurrentSession().update(supplier);
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
public SupplierDao get(String id) {
	
	String hql = "from Supplier where id = '" + id + "'";
	Query query= sessionFactory.getCurrentSession().createQuery(hql);
	@SuppressWarnings("unchecked")
	
	List<Supplier> list = query.list();
	
	if(list == null || list.isEmpty())
	{
    return null;
	}
	return (SupplierDao) list.get(0);
}

@Transactional
public List<Supplier> list() {
	
	return null;
  }
}



