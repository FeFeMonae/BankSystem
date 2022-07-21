package com.lq.bank.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.lq.bank.enums.AccountType;
import com.lq.bank.model.Account;
import com.lq.bank.model.Branch;
import com.lq.bank.model.Customer;

@Service
public class AccountService {
	
	public Map<String, Object> buildAccountInfo(Account account){
	
		Map<String, Object> accountInfo = new HashMap<String, Object>();
		
		accountInfo.put("accountID", account.getAcctId() );
		accountInfo.put("type", account.getType() );
		accountInfo.put("balance", 1500.98);
		accountInfo.put("customerId", account.getCustomer().getId() );
		accountInfo.put("label", account.getLabel());
		accountInfo.put("branchId", account.getBranch().getBranchId());
		
		return accountInfo;
	}
		
	public List <Map<String, Object>> getAllAcccounts() {
		
		List<Map<String, Object>> accountList = new ArrayList<Map<String, Object>> ();
		
		Branch branchA = new Branch(1, "Branch A");
		
		Customer c1 = new Customer(10, "Robert", "Johnson", branchA);
				
		Account ac_1 = new Account(1, "Ch 1", AccountType.SAVINGS, branchA, c1);
		Account ac_2 = new Account(1, "Ch 2", AccountType.CHECKING, branchA, c1);
		Account ac_3 = new Account(1, "Ch 3", AccountType.CREDIT, branchA, c1);
		Account ac_4 = new Account(1, "Ch 2", AccountType.SALARY, branchA, c1);
		
		return accountList;
		
		/*Map<String, Object> accountInfo_2 = new HashMap<String, Object>();
		
		accountInfo_2.put("accountID", 16);
		accountInfo_2.put("type", 2);
		accountInfo_2.put("balance", 68000.98);
		accountInfo_2.put("customerID", 3);
		accountInfo_2.put("label", "Saving 1");
		accountInfo_2.put("branchId", 150);
		
		accountList.add(accountInfo_2);
		
		return accountList;*/
	}
	
		public List<Map<String, Object>> getAccountInfo() {
		
		List<Map<String, Object>> accountList = new ArrayList<Map<String, Object>> ();
		
		Map<String, Object> accountInfo = new HashMap<String, Object>();
		
		accountInfo.put("accountID", 10);
		accountInfo.put("type", 1);
		accountInfo.put("balance", 1500.98);
		accountInfo.put("customerID", 1);
		accountInfo.put("label", "Checking 1");
		accountInfo.put("branchId", 850);
		
		accountList.add(accountInfo);
		
		
		return accountList;
	
	}

}
