package com.store.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
public class Registercontroller {

	@Autowired
	private Product product;
	
	@Autowired
	private Supplier supplier;
	
	@Autowired
	private Category category;
	
	@Autowired
	private SupplierDao supplierDao;
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private Userdetails userdetails;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam(value = "Username") String mailID,
		@RequestParam(value = "password") String password) {
	
		userdetails = userDao.isValidUser( mailID,password);
		ModelAndView mv = null;
		if (userdetails == null){
			mv=new ModelAndView("Home");
		mv.addObject("errorMessage", "Invalid credentials..please try again");
	}
	
	else {
		if (userdetails.getRole().equals("ROLE_ADMIN")) { 
			mv = new ModelAndView("admin");
			session.setAttribute("categoryList", categoryDao.list());
			session.setAttribute("supplierList", supplierDao.list());
			session.setAttribute("productList", productDao.list());
			
			session.setAttribute("category", category);
			session.setAttribute("supplier", supplier);
			session.setAttribute("product", product);
		
		} else if (userdetails.getRole().equals("ROLE_USER")){
			mv = new ModelAndView("Home");
		
		session.setAttribute("userName", userdetails.getName());
		session.setAttribute("userID", userdetails.getId());
	}
	}
return mv;
	}
}
	

	


