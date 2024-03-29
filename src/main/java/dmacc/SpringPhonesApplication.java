package dmacc;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Phone;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.PhoneRepository;



@SpringBootApplication
public class SpringPhonesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringPhonesApplication.class, args);
	}
	
	@Autowired
	PhoneRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Using an existing bean
		Phone phone = appContext.getBean("phone", Phone.class);
        phone.setModel("iPhone 11");
        repo.save(phone);
        
        //Create a bean to use - not managed by Spring
        Phone newphone = new Phone("Google", "Pixel 8", 2024, 600);
        repo.save(newphone);
        
        List<Phone> allPhones = repo.findAll();
        for (Phone p: allPhones) {
        	System.out.println(p.toString());
        }
        
        ((AbstractApplicationContext) appContext).close();
	}
	
}
