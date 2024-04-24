package com.flightreservation.dao;

import com.flightreservation.model.Reservation;

public interface ReservationDao {

    Reservation bookFlight(Reservation reservation);

    Reservation checkedIn(long reservationId, int numberOfBags);

}//eoc
