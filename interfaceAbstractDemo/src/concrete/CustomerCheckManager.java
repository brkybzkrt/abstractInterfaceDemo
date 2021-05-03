package concrete;

import java.rmi.RemoteException;

import abstractFile.CustomerCheckService;
import entities.Customer;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements CustomerCheckService{

	private KPSPublicSoapProxy kps;
	
	
	public CustomerCheckManager(KPSPublicSoapProxy kps) {
		
		this.kps = kps;
	}



	
	public boolean checkIfRealCustomer(Customer customer) {
		
		boolean check=false;
		
		long nationalId = Long.valueOf(customer.getNationalityId());
		int dogumYili = customer.getDateOfBirth().getYear();
		
		try {
			if(this.kps.TCKimlikNoDogrula(nationalId, customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), dogumYili)) {
				
				check= true;
				
			}
		} catch (RemoteException e) {
			
			e.printStackTrace();
			check=false;
		}
		
		
		
		return check;
		
		
	}

}
