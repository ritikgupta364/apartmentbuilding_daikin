package com.example.apartmentbuilding;

@Getter
@Setter
public class Room {
    private final String id;
    private double currentTemperature;
    private boolean heatingEnabled;
    private boolean coolingEnabled;

    public Room(String id) {
        this.id = id;
        this.currentTemperature = generateRandomTemperature();
        this.heatingEnabled = false;
        this.coolingEnabled = false;
    }

    private double generateRandomTemperature() {
        return 10 + (Math.random() * 30); // Random between 10 and 40
    }

    public void updateHeatingCoolingStatus(double requestedTemperature) {
        if (currentTemperature < requestedTemperature) {
            heatingEnabled = true;
            coolingEnabled = false;
        } else if (currentTemperature > requestedTemperature) {
            heatingEnabled = false;
            coolingEnabled = true;
        } else {
            heatingEnabled = false;
            coolingEnabled = false;
        }
    }

}