package com.store.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.store.dao.CategoryDao;
import com.store.dao.ProductDao;
import com.store.dao.SupplierDao;
import com.store.dao.UserDao;
import com.store.model.Category;
import com.store.model.Product;
import com.store.model.Supplier;
import com.store.model.Userdetails;

@Controller
public class HomeController {
	
	@Autowired
	private Userdetails userdetails;
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private Category category;
	
	@Autowired
	private SupplierDao supplierDao;

	@Autowired
	private Supplier supplier;
	
	@Autowired
	private Product product;
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv = new ModelAndView("home");
		session.setAttribute("category", category);
		session.setAttribute("categoryList", categoryDao.list());
		session.setAttribute("product", product);
		session.setAttribute("supplier", supplier);
		session.setAttribute("productList", productDao.list());
		session.setAttribute("supplierList", supplierDao.list());
		session.setAttribute("userdetails", userdetails);
		session.setAttribute("userList", userDao.list());
		return mv;
	}
	}

