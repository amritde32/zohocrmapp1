package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.dto.Bill;
import com.zohocrm.entities.Billing;
import com.zohocrm.entities.Contact;
import com.zohocrm.services.BillingService;
import com.zohocrm.services.ContactService;

@Controller
public class BillingController {
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillingService billingService;

	@RequestMapping("/generateBill")
	public String viewBillinPage(@RequestParam("id")long id,Model model) {
		Contact contact = contactService.ContactById(id);
		model.addAttribute("contact", contact);
		return "generated_bill";
	}
	@RequestMapping("/saveBill")
	public String saveBill(Bill billi,@RequestParam("id")long id) {
		Contact contact = contactService.ContactById(id);
		Billing bill = new Billing();
		bill.setFirstName(contact.getFirstName());
		bill.setLastName(contact.getLastName());
		bill.setEmail(contact.getEmail());
		bill.setMobile(contact.getMobile());
		bill.setSource(contact.getSource());
	    bill.setProduct(billi.getProduct());
	    bill.setProduct(billi.getAmount());
		
		billingService.saveBill(bill);
		return "";
	}
}
