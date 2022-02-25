package com.priya.spring.beanlifecycle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	//Sorting an array
	//Search the array
	//Return the result
	
	//only this it i called no setters or constructor
	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;
	

	// constructor injection
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}


	//setters injection
//	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}
//


	public int binarySearch(int[] numbers, int numberToSearchFor) {
//		Implementing  Sorting logic
		//Bubble Sort
//		BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
//		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		//Quick Sort
		
		//Search the array
		
		//modifying
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		return 3;//Return the result
	}
		
		@PostConstruct
		public void postConstruct() {
			logger.info("postConstrtuct");
		}
		
		@PreDestroy
		public void preDestroy() {
			logger.info("preDestroy");
		}
	

}
