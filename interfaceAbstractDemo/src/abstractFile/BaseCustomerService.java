package abstractFile;

import entities.Customer;

public abstract class BaseCustomerService implements CustomerService{

	public void save(Customer customer) {
		
		System.out.println( customer.getFirstName() +"- veritabanýna kaydedildi.");
		
		
		
	};
}
