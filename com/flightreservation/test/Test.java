package com.flightreservation.test;

import com.flightreservation.dao.ReservationDao;
import com.flightreservation.dao.ReservationDaoImplementation;
import com.flightreservation.model.Passenger;
import com.flightreservation.model.Reservation;

public class Test {

    public static void main(String[] args) {

        ReservationDao dao = new ReservationDaoImplementation();
        Reservation reservation = new Reservation();
        Passenger passenger = new Passenger();
        passenger.setId(123l);
        passenger.setFirstName("John");
        passenger.setLastName("Bailey");
        passenger.setEmail("john@bailey.com");
        reservation.setPassenger(passenger);
        reservation.setFlightId(1l);


        System.out.println(dao.bookFlight(reservation));

        
    }//eom
}
