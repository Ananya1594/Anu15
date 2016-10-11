package com.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.store.dao.CategoryDao;
import com.store.dao.ProductDao;
import com.store.dao.SupplierDao;
import com.store.model.Category;
import com.store.model.Product;
import com.store.model.Supplier;

@Controller
public class AdminController {

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
	
	@RequestMapping("/managecategories")
	public ModelAndView categories() {
		ModelAndView mv=new ModelAndView("/home");
		mv.addObject("category", category);
		mv.addObject("isAdminClickedCategories", "true");
		mv.addObject("categoryList", categoryDao.list());
		return mv;
	}
	
	@RequestMapping("/manageproducts")
	public ModelAndView suppliers() {
		ModelAndView mv=new ModelAndView("/home");
		mv.addObject("product", product);
		mv.addObject("isAdminClickedProducts", "true");
		mv.addObject("productList", productDao.list());
		return mv;
	}
	
	@RequestMapping("/managesuppliers")
	public ModelAndView products() {
		ModelAndView mv=new ModelAndView("/home");
		mv.addObject("supplier", supplier);
		mv.addObject("isAdminClickedSuppliers", "true");
		mv.addObject("supplierList", supplierDao.list());
		return mv;
	}
}
	
	
	

