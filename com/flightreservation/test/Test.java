package com.flightreservation.test;

import com.flightreservation.dao.ReservationDao;
import com.flightreservation.dao.ReservationDaoImplementation;
import com.flightreservation.model.Passenger;
import com.flightreservation.model.Reservation;

public class Test {

    public static void main(String[] args) {

        // Create a new instance of ReservationDaoImplementation
        ReservationDao dao = new ReservationDaoImplementation();

        // Create a new instance of Reservation
        Reservation reservation = new Reservation();

        // Create a new instance of Passenger
        Passenger passenger = new Passenger();

        // Set the ID of the passenger
        passenger.setId(123l);

        // Set the first name of the passenger
        passenger.setFirstName("John");

        // Set the last name of the passenger
        passenger.setLastName("Bailey");

        // Set the email of the passenger
        passenger.setEmail("john@bailey.com");

        // Set the passenger to the reservation
        reservation.setPassenger(passenger);

        // Set the flight ID to the reservation
        reservation.setFlightId(1l);

        // Book the flight with the reservation and print the result
        System.out.println(dao.bookFlight(reservation));

    }//eom
}
