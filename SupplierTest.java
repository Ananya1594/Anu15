package store;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.store.dao.SupplierDao;
import com.store.model.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext Context = new AnnotationConfigApplicationContext();
		Context.scan("com.store");
		Context.refresh();
		SupplierDao supplierdao = (SupplierDao) Context.getBean("supplierDao");
		Supplier supplier = (Supplier) Context.getBean("supplier");
		supplier.setId("CB_01");
		supplier.setName("Cricket Bat");
		supplier.setDescription("Cricket item");
		supplierdao.save(supplier);
		System.out.println("Objects are created successfully");
		
	}

}
