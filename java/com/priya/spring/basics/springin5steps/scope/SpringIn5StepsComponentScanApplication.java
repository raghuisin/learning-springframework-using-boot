package com.priya.spring.basics.springin5steps.scope;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.priya.spring.basics.componentscan.ComponentDAO;

@SpringBootApplication
@ComponentScan("com.priya.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm()); spring does this
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
//		
//	int result = binarySearch.binarySearch(new int[] {12,4,6}, 3);
//		System.out.println(result);
		
		//Application context
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		ComponentDAO componentDao1 = applicationContext.getBean(ComponentDAO.class);
		//ComponentDAO personDao2 = applicationContext.getBean(ComponentDAO.class);
		LOGGER.info("{}",componentDao1);
		LOGGER.info("{}",componentDao1.getJdbcConnection());
//		
//		LOGGER.info("{}",personDao2);
//		LOGGER.info("{}",personDao2.getJdbcConnection());
	}

}
