package concrete;

import abstractFile.BaseCustomerService;
import abstractFile.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerService {

	private CustomerCheckService customerCheckservice;
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckservice) {
		
		this.customerCheckservice = customerCheckservice;
	}



	@Override
	public void save(Customer customer) {
		
		if(this.customerCheckservice.checkIfRealCustomer(customer)) {
			
			System.out.println(customer.getFirstName()+"- Veritaban�na eklendi.");
		}
		else {
			
			System.out.println(" Ki�i do�rulanamad�.");
		}
		
	};
	
}
