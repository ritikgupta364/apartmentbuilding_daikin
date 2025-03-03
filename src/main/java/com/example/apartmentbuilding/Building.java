package com.example.apartmentbuilding;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Building {
    private double requestedTemperature;
    private List<Apartment> apartments;
    private List<CommonRoom> commonRooms;

    public Building(double requestedTemperature) {
        this.requestedTemperature = requestedTemperature;
        this.apartments = new ArrayList<>();
        this.commonRooms = new ArrayList<>();
    }

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    public void addCommonRoom(CommonRoom commonRoom) {
        commonRooms.add(commonRoom);
    }

    public void updateRequestedTemperature(double newTemperature) {
        this.requestedTemperature = newTemperature;
        recalculateHeatingCooling();
    }

    private void recalculateHeatingCooling() {
        for (Apartment apartment : apartments) {
            apartment.updateHeatingCoolingStatus(requestedTemperature);
        }
        for (CommonRoom commonRoom : commonRooms) {
            commonRoom.updateHeatingCoolingStatus(requestedTemperature);
        }
    }

}
