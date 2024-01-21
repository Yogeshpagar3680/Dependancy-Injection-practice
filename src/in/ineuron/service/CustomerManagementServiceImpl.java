package in.ineuron.service;

import java.net.Socket;

import javax.sound.midi.Soundbank;

import in.ineuron.bo.CustomerBO;
import in.ineuron.dao.CustomerDAO;
import in.ineuron.dto.CustomerDTO;

public class CustomerManagementServiceImpl implements CustomerManagementService {

	private CustomerDAO dao;
	
	//constructor injection - injecting customerdao 
	public CustomerManagementServiceImpl(CustomerDAO dao) {
		this.dao = dao;
	}

    @Override
	public String calculateSimpleInterest(CustomerDTO customerDTO) {
		
    	float intrAmt = 0.0f;
    	
    	intrAmt = (customerDTO.getPamt() * customerDTO.getRate() * customerDTO.getTime()) / 100;
    	
    	CustomerBO bo = new CustomerBO();
    	
    	bo.setCustomerAddress(customerDTO.getCustomerAddress());
    	bo.setCustomerName(customerDTO.getCustomerName());
    	bo.setPamt(customerDTO.getPamt());
    	bo.setTime(customerDTO.getTime());
    	bo.setInterestAmt(intrAmt);
    	
    	int count = dao.insert(bo);
    	
    	if(count == 0)
    	{
    		return "Data inserted successfully ";
    		
    	}
    	else {
			
    		return "Data failed to insert :";
		}
		
	}

}
