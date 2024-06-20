package com.cc.airline.ticketing;

import com.cc.airline.passengers.Passenger;
import static org.junit.Assert.*;
import org.junit.Test;

public class TicketTest {

	@Test
	public void testTicketCreation() {
		// Setup
		Passenger passenger = new Passenger(/* parameters to create a Passenger */);
		Seat seat = new Seat();
		seat.setRow(10);
		seat.setLetter('A');
		double price = 300.0;

		// Execution
		Ticket ticket = new Ticket(passenger, seat, price);

		// Verification
		assertEquals("Passenger should match the one provided", passenger, ticket.getPassenger());
		assertEquals("Seat should match the one provided", seat, ticket.getSeat());
		assertEquals("Price should match the one provided", 300.0, ticket.getPrice(), 0.01);
		assertTrue("Ticket number should be greater than 1000000", ticket.getTicketNo() > 1000000);
	}
}
