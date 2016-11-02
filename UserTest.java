package store;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.store.dao.UserDao;
import com.store.model.Userdetails;

public class UserTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext Context = new AnnotationConfigApplicationContext();
		Context.scan("com.store");
		Context.refresh();
		UserDao userdao = (UserDao) Context.getBean("userDao");
		Userdetails userdetails = (Userdetails) Context.getBean("userdetails");
		userdetails.setId("01");
		userdetails.setName("Ananya");
        userdetails.setMailid("ananyaganaps@gmail.com");
        userdetails.setPassword("anan");
        userdetails.setRole("admin");
		userdao.save(userdetails);
		System.out.println("Objects are created successfully");
		
	}

}
