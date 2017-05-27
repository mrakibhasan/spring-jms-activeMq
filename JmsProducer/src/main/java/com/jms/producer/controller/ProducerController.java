package com.jms.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jms.producer.model.Vendor;
import com.jms.producer.service.MessageService;

@Controller
public class ProducerController {
	
	
	@Autowired
	private MessageService messageService;
	
	@RequestMapping("/")
	public String renderVendorPage(Vendor vendor, Model model)
	{
		
		return "index";
	}
	
	@RequestMapping(value="/vendor", method=RequestMethod.POST)
	public ModelAndView processRequest(@ModelAttribute("vendor") Vendor vendor, Model model)
	{
		
		messageService.process(vendor);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		mv.addObject("message","Vendor Added Successfully");
		vendor = new Vendor();
		mv.addObject("vendor", vendor);
		return mv;
	}
}
