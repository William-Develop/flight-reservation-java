package com.flightreservation.model;

public class AbstractModel {

    private Long id;

    //Getters and setters.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}//eoc

//Description:
/*

`AbstractModel.java` is a simple Java class that serves as a base class for other models in the application.
It contains a single property, `id`, which is of type `Long`. This `id` property is likely used as a unique identifier
for instances of classes that extend `AbstractModel`.

The class provides getter and setter methods (`getId` and `setId`) for the `id` property, allowing other classes that extend
`AbstractModel` to access and modify the `id` value.

In the context of this application, `AbstractModel` is extended by `Reservation`, `Flight`, and `Passenger` classes, meaning
these classes inherit the `id` property and its associated methods.

 */
