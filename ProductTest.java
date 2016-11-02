package store;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.store.dao.ProductDao;
import com.store.model.Product;

public class ProductTest {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext Context = new AnnotationConfigApplicationContext();
		Context.scan("com.store");
		Context.refresh();
		ProductDao productdao = (ProductDao) Context.getBean("productDao");
		Product product = (Product) Context.getBean("product");
		product.setId("CB_04");
		product.setName("Cricket kit bag");
		product.setDescription("Cricket item");
		product.setPrice(600);
	    productdao.save(product);
		System.out.println("Objects are created successfully");
		
	}
}
