package com.flightreservation.model;

public class Reservation {

    private Passenger passenger;
    private Flight flight;
    private long flightId;

    //Getters and setters.
    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public long getFlightId() {
        return flightId;
    }

    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }

    //toString method to print the contents of an object in a human-readable format.
    @Override
    public String toString() {
        return "Reservation{" +
                "passenger=" + passenger +
                ", flight=" + flight +
                ", flightId=" + flightId +
                '}';
    }
}//eoc
