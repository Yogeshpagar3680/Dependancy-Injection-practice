package in.ineuron.dao;

import java.sql.DriverManager;

import javax.sql.DataSource;

import in.ineuron.bo.CustomerBO;
import in.ineuron.service.CustomerManagementService;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class CustomerMysqlDAOImpl implements CustomerDAO {
	
	private DataSource dataSource;
	
	public CustomerMysqlDAOImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}


     @Override
	public int insert(CustomerBO bo) {
    	
		return 0;
		
	}

}
