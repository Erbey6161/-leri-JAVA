package com.springdemo;

public class CustomerManager implements ICustomerService {
	
	private ICustomerDal customerDal;
	
	
	//constructor injection best practice
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	} 
	
	

	public void add() {
		//İş kuralları
		
		customerDal.add();
	}

}
