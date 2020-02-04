package com.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springframework.sfgpetclinic.service.VetService;

@Controller
@RequestMapping("/vets")
public class VetController {
	
	private final VetService vetService;
	
	
	public VetController(VetService vetService) {
		this.vetService = vetService;
	}


	@RequestMapping({"/","/index","","index.html"})
	public String listVets(Model model) {
		
		model.addAttribute("vets", vetService.findAll());
		
		return "vets/index";
	}

}
