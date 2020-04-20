package com.gp.patterns.movietickets.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gp.patterns.movietickets.bo.Ticket;
import com.gp.patterns.movietickets.dao.TicketDao;

@Service
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	TicketDao dao;
//method parameter from bo not needed
	@Override
	public void purchaseTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		//process pmt
		com.gp.patterns.movietickets.entities.Ticket ticketEntity = new com.gp.patterns.movietickets.entities.Ticket();
		ticketEntity.setId(ticket.getId());
		ticketEntity.setMovie(ticket.getMovieName());
		ticketEntity.setScreen(ticket.getScreenNo());
		ticketEntity.setSeat(ticket.getSeatNo());
		
		dao.create(ticketEntity);
		//email or text ticket

	}

}
