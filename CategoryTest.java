package store;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.store.dao.CategoryDao;
import com.store.model.Category;

public class CategoryTest {
	

	public static void main(String[] args) {
		AnnotationConfigApplicationContext Context = new AnnotationConfigApplicationContext();
		Context.scan("com.store");
		Context.refresh();
		CategoryDao categorydao = (CategoryDao) Context.getBean("categoryDao");
		Category category = (Category) Context.getBean("category");
		category.setId("08");
		category.setName("goggles");
		category.setDescription("swimming item");
		categorydao.save(category);
		System.out.println("Objects are created successfully");
		
	}
}
