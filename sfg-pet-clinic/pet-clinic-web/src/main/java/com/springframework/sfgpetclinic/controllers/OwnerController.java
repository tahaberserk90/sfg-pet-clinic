package com.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springframework.sfgpetclinic.service.OwnerService;

@Controller
@RequestMapping("/owners")
public class OwnerController {
	
	private final OwnerService ownerService;
	
	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}


	@RequestMapping({"","/index"})
	public String listOfOwners(Model model) {
		
		model.addAttribute("owners", ownerService.findAll());
		
		return "owners/index";
	}
	
	@RequestMapping("/find")
	public String findOwners() {
		
		return "notImplemented";
	}

}
