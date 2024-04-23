package com.flightreservation.dao;

import com.flightreservation.model.Flight;

import java.util.HashMap;

public class ReservationDaoImplementation implements ReservationDao  {

    HashMap<Long, Flight> flights;

    //Constructor.
    public ReservationDaoImplementation() {
        //New instance of HashMap "flights".
        flights = new HashMap<>();

        //flight1
        Flight flight1 = new Flight();
        //Set flight1 fields.
        flight1.setId(1l);
        flight1.setFlightNumber("123");
        flight1.setOperatingAirlines("American");
        flight1.setDepartureCity("Austin");
        flight1.setArrivalCity("New York");
        flight1.setDateAndTimeOfDeparture("5/22/2022 9pm");

        //getId() of flight1 and add it flights to the HashMap "flights" instance.
        //The entire Flight object is used as the value.
        //It's being used to store flight1 in the flights HashMap with the key being the ID of flight1.
        flights.put(flight1.getId(), flight1);

        //flight2
        Flight flight2 = new Flight();
        //Set flight1 fields.
        flight2.setId(2l);
        flight2.setFlightNumber("456");
        flight2.setOperatingAirlines("South West");
        flight2.setDepartureCity("Denver");
        flight2.setArrivalCity("San Diego");
        flight2.setDateAndTimeOfDeparture("6/22/2022 10pm");

        //getId() of flight2 and add it flights to the HashMap "flights" instance.
        //The entire Flight object is used as the value.
        //It's being used to store flight2 in the flights HashMap with the key being the ID of flight2.
        flights.put(flight2.getId(), flight2);

    }

}//eoc
