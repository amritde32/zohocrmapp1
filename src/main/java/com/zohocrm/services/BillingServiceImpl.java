package com.zohocrm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Billing;
@Service
public class BillingServiceImpl implements BillingService {
	@Autowired
	public BillingService billService;

	@Override
	public void saveBill(Billing bill) {
		billService.saveBill(bill);

	}

}
