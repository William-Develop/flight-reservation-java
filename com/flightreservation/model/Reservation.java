package com.flightreservation.model;

public class Reservation extends AbstractModel {

    private Passenger passenger;
    private Flight flight;
    private long flightId;
    private int numberOfBags;
    private boolean checkedIn;


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

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }



    //toString method to print the contents of an object in a human-readable format.

    @Override
    public String toString() {
        return "Reservation{" +
                "passenger=" + passenger +
                ", flight=" + flight +
                ", flightId=" + flightId +
                ", numberOfBags=" + numberOfBags +
                ", checkedIn=" + checkedIn +
                '}';
    }
}//eoc
