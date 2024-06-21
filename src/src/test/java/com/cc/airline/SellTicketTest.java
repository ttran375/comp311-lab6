package com.cc.airline;

import com.cc.airline.passengers.Passenger;
import com.cc.airline.passengers.PassengerName;
import com.cc.airline.passengers.StaffPassenger;
import com.cc.airline.ticketing.Seat;
import com.cc.airline.ticketing.SeatingClass;
import com.cc.airline.ticketing.Ticket;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SellTicketTest {

    @BeforeAll
    public static void setUpBeforeClass() {
        System.out.println("Setting up before class...");
    }

    @AfterAll
    public static void tearDownAfterClass() {
        System.out.println("Tearing down after class...");
    }

    @Test
    public void sellTicket1() {
        SeatingClass sClass = SeatingClass.ECONOMY;

        Passenger passenger = new Passenger(new PassengerName("Mary", "I", "Worth"));

        Seat seat = new Seat();
        seat.setRow(3);
        seat.setLetter('D');

        double price = sClass.getPrice();

        Ticket ticket = new Ticket(passenger, seat, price);

        System.out.println("Ticket issued: " + ticket);

        assertEquals(500.0, ticket.getPrice(), 0.005);
    }

    @Test
    public void sellTicket2() {
        SeatingClass sClass = SeatingClass.ECONOMY;

        PassengerName pName = new PassengerName("Mary", "I", "Worth");
        StaffPassenger passenger = new StaffPassenger(pName, "EMP123");

        Seat seat = new Seat();
        seat.setRow(3);
        seat.setLetter('D');

        double price = sClass.getPrice() / 2;

        Ticket ticket = new Ticket(passenger, seat, price);

        System.out.println("Ticket issued: " + ticket);

        assertEquals(250.0, ticket.getPrice(), 0.005);
    }

    @Test
    public void sellTicket3() {
        SeatingClass sClass = SeatingClass.BUSINESS;

        PassengerName pName = new PassengerName("Mary", "I", "Worth");
        StaffPassenger passenger = new StaffPassenger(pName, "EMP123");

        Seat seat = new Seat();
        seat.setRow(1);
        seat.setLetter('A');

        double price = sClass.getPrice();

        Ticket ticket = new Ticket(passenger, seat, price);

        System.out.println("Ticket issued: " + ticket);

        assertEquals(sClass.getPrice(), ticket.getPrice(), 0.005);
    }
}
