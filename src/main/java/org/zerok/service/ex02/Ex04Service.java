package org.zerok.service.ex02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerok.domain.ex01.CustomerDto;
import org.zerok.domain.ex01.EmployeeDto;
import org.zerok.mapper.ex02.Ex02Mapper;

@Service
public class Ex04Service {

	@Autowired
	private Ex02Mapper mapper;
	
	public String getNameById(int id) {
		String name = mapper.selectNameById(id);
		
		return name;
	}
	
	@Autowired
	private Ex02Mapper mapper1;
	
	public String getfirstNameById(int id) {
		return mapper1.selectfirstNameById(id);
		
	}

	public CustomerDto getCustomerInfoById(int id) {
		
		return mapper.selectCustomerById(id);
	}
	
	public EmployeeDto getEmployeeFullNameById(int id) {
		
		return mapper.selectEmployeeFullNameById(id);
	}

	public boolean addCustomer(CustomerDto customer) {
		
		int count = mapper.insertCustomer(customer);
		return count == 1;
	}

	public boolean addEmployee(EmployeeDto employee) {
		
		int count = mapper.insertEmployee(employee);
		return count == 1;
	}
	
	public List<EmployeeDto> listEmployee() {
		return mapper.listEmployee();
	}

	public List<CustomerDto> listCustomer() {
		return mapper.listCustomer();
	}

	public List<CustomerDto> listCustomerPage(int page, int rowPerPage) {
		
		int from = (page-1) * rowPerPage;
		return mapper.listCustomerPage(from, rowPerPage);
	}

	public int countCustomers() {
		return mapper.countCustomers();
	}
}
