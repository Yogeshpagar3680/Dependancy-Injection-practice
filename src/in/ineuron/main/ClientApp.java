package in.ineuron.main;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.controller.MainController;
import in.ineuron.vo.CustomerVO;

public class ClientApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the customer name :: ");
		String customerName = scanner.next();
		
		System.out.println("Enter the customer address :: ");
		String customerAddress = scanner.next();
		
		System.out.println("Enter the principal amount :: ");
		String pamount = scanner.next();
		
		System.out.println("Enter the time period :: ");
		String time = scanner.next();
		
		System.out.println("Enter the rate of interest :: ");
		String rateString = scanner.next();
		
	    CustomerVO vo = new CustomerVO();
	    vo.setCustomerAddress(customerAddress);
	    vo.setCustomerName(customerName);
	    vo.setPamt(pamount);
	    vo.setRate(rateString);
	    vo.setTime(time);
	    
	    DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");
		
		MainController controller = factory.getBean("controller", MainController.class);
		String result = controller.processResult(vo);
		System.out.println(result);
		
		scanner.close();	
		

	}

}
