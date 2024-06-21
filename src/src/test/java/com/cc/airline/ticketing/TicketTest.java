package com.cc.airline.ticketing;

import com.cc.airline.passengers.Passenger;
import com.cc.airline.passengers.PassengerName;
import com.cc.airline.ticketing.Seat;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class TicketTest {

	@Test
	public void testTicketValid() {
		// Create a Passenger object
		Passenger passenger = new Passenger(new PassengerName("Mary", "I", "Worth"));

		// Create a Seat object and set the row and letter
		Seat seat = new Seat();
		seat.setRow(5);
		seat.setLetter('A');

		// Define the price
		double price = 150.0;

		// Create the Ticket object
		Ticket ticket = new Ticket(passenger, seat, price);

		// Assertions to verify that the ticket is created correctly
		assertEquals(passenger, ticket.getPassenger());
		assertTrue(ticket.getTicketNo() > 1000000);
	}

	@Test
	public void testTicketBad() {
		assertThrows(IllegalArgumentException.class, () -> {
			Ticket ticket = new Ticket(null, null, -100.0);
		});
	}
}
