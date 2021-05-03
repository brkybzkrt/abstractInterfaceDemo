package interfaceAbstractDemo;

import java.time.LocalDate;

import abstractFile.BaseCustomerService;
import concrete.CustomerCheckManager;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class Main {

	public static void main(String[] args) {
		
		
		
		BaseCustomerService baseCustomerService= new StarbucksCustomerManager(new CustomerCheckManager(new KPSPublicSoapProxy()));
		
		baseCustomerService.save(new Customer(1 ,"Ahmet Berkay","Bozkurt",  LocalDate.of( 1998 , 6 , 9 ), "32539511740"));
		
		
		
	}

}
