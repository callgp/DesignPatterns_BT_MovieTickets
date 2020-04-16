package com.gp.patterns.movietickets.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gp.patterns.movietickets.entities.Ticket;
import com.gp.patterns.movietickets.entities.dao.TicketDao;

@Controller
public class TicketController {
	
	@Autowired
	TicketDao dao;
	
	@RequestMapping("/showCreateTicket")
	public String showCreateTicket() {
		return "createTicket";
	}
	
	@RequestMapping("/createTicket")
	public String createTicket(Ticket ticket, ModelMap modelMap) {
		
		dao.create(ticket);
		modelMap.addAttribute("msg", "tkt purchased");
		return "createTicket";
	}

}
