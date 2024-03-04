package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Phone;
/**
 * @author Phuoc Tran - ptran9@dmacc.edu
 * CIS175 - Spring 2024
 * Mar 4, 2024
 */
@Configuration
public class BeanConfiguration {
	@Bean
	public Phone phone() {
		return new Phone("Apple", "iPhone 11", 2020, 699);
	}
}
