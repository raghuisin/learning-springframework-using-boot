package com.priya.spring.basics.springin5steps.basic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
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

}
