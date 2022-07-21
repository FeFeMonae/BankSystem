package com.lq.bank.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.lq.bank.enums.AccountType;
import com.lq.bank.model.Account;
import com.lq.bank.model.Branch;
import com.lq.bank.model.Customer;

@Service
public class CustomerService {
	
	@Autowired
	private AccountService accountService;
	
	public Map<String, Object> buildCustomerInfo(Customer customer){	
			
		Map<String, Object> customerInfo = new HashMap();
				
		customerInfo.put("name", customer.getFirstName());
		customerInfo.put("family", customer.getLastName());
		customerInfo.put("age", customer.getCustomersAge());
		customerInfo.put("branch", customer.getBranch());
				
		return customerInfo;
	}
	
		public List<Map> getAllCustomers() {
			
			List<Map> customersList = new ArrayList<Map>();
			
			Branch branchB = new Branch(2, "Branch B");
			
			Customer c1 = new Customer(1, 42, "Robin", "Thick", branchB);
			Customer c2 = new Customer(1, 48, "Jason", "Momoa", branchB);
			
			customersList.add(buildCustomerInfo(c1));
			customersList.add(buildCustomerInfo(c2));
			
			return customersList;
		}
	
		public List <Map> getAllAcccounts() {
			
			List<Map<String, Object>> accountList = new ArrayList<Map<String, Object>> ();
			
			Map<String, Object> accountInfo = new HashMap<String, Object>();
			
			Branch branchA = new Branch(1, "Branch A");
			
			Customer c1 = new Customer(10, "Robert", "Johnson", branchA);
					
			Account ac_1 = new Account(1, "Ch 1", AccountType.SAVINGS, branchA, c1);
			Account ac_2 = new Account(1, "Ch 2", AccountType.CHECKING, branchA, c1);
			Account ac_3 = new Account(1, "Ch 3", AccountType.CREDIT, branchA, c1);
			Account ac_4 = new Account(1, "Ch 2", AccountType.SALARY, branchA, c1);
			
			accountList.add(accountInfo);
		}
			
		/*public List<Map<String,Object>> getAllAccounts() {
			List<Map<String, Object>> accountList = new ArrayList<Map<String, Object>> ();
			
			Map<String, Object> accountInfo = new HashMap<String, Object>();
			
			accountInfo.put("accountID", 10);
			accountInfo.put("type", 1);
			accountInfo.put("balance", 1500.98);
			accountInfo.put("customerID", 1);
			accountInfo.put("label", "Checking 1");
			accountInfo.put("branchId", 850);
			
			accountList.add(accountInfo);
			
			Map<String, Object> accountInfo_2 = new HashMap<String, Object>();
			
			accountInfo_2.put("accountID", 16);
			accountInfo_2.put("type", 2);
			accountInfo_2.put("balance", 68000.98);
			accountInfo_2.put("customerID", 3);
			accountInfo_2.put("label", "Saving 1");
			accountInfo_2.put("branchId", 150);
			
			accountList.add(accountInfo_2);
			
			return accountList;
			}*/
		
		public List<Map> getCustomerInfo( ) {
			
			List<Map> customersList = new ArrayList<Map> ();
			
			Map<String, Object> r1 = new HashMap();
			r1.put("name", "John");
			r1.put("family", "Doe");
			r1.put("age", 15);
			r1.put("id", 5);
						
			customersList.add(r1);
						
			return customersList;
}

	
	
	
	
	
	
}
