package com.store.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.store.model.Userdetails;

@Repository("UserDao")
@Transactional
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public UserDaoImpl(SessionFactory sessionFactory) {
		
		try
		{
	     this.sessionFactory = sessionFactory;
	}catch(Exception e)
		{
		e.printStackTrace();
		}
	}

	@Transactional
	public boolean save(Userdetails userdetails) {
		
		try
		{
			sessionFactory.getCurrentSession().save(userdetails);
		}catch(Exception e)
		{
			
		}
		return true;
	}

	@Transactional
	public boolean update(Userdetails userdetails) {
		
		try
		{
			sessionFactory.getCurrentSession().update(userdetails);
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
	public UserDao get(String id) {
		
		String hql = "from Userdetails where id= '"+id+"'";
		Query query= sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		
		List<Userdetails> list= query.list();
		
		if(list ==null || list.isEmpty())
		{
			return null;
		}
		return (UserDao) list.get(0);
	}
	
	@Transactional
	public List<Userdetails> list() {
		
		return null;
	}

@Transactional
public Userdetails isValidUser(String name, String password)
{
	
	String hql = "from Userdetails where name= '"+name+"'"+ "and"+ "password="+ "'"+ password +"'"; 
	Query query= sessionFactory.getCurrentSession().createQuery(hql);
	
	@SuppressWarnings("unchecked")
	List<Userdetails> list= (List<Userdetails>)query.list();
	
	if(list !=null && !list.isEmpty())
	{
		return list.get(0);
	}
	
	return null;
}
}
