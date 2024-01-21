package in.ineuron.controller;

import in.ineuron.dto.CustomerDTO;
import in.ineuron.service.CustomerManagementService;
import in.ineuron.vo.CustomerVO;

public class MainController {
	
	CustomerManagementService service;

	public MainController(CustomerManagementService service) {
		System.out.println("MainController:: one param constructor...");
		 this.service = service;
	}
	
	public String processResult(CustomerVO vo) {
		CustomerDTO dto = new CustomerDTO();
		dto.setCustomerName(vo.getCustomerName());
		dto.setCustomerAddress(vo.getCustomerAddress());
		dto.setPamt(Float.parseFloat(vo.getPamt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		
		String result = service.calculateSimpleInterest(dto);
		return "result";
	}
}
