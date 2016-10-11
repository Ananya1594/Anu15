package com.store.dao;

import java.util.List;

import com.store.model.Userdetails;

public interface UserDao {

	public boolean save(Userdetails userdetails);
	public boolean update(Userdetails userdetails);
	public void delete(String id);
	public UserDao get(String id);
	public List<Userdetails> list();
	public Userdetails isValidUser(String name, String password);
}
