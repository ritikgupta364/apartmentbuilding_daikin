package com.example.apartmentbuilding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApartmentbuildingApplication {

	public static void main(String[] args) {
        Building building = new Building(25.0);

        building.addApartment(new Apartment("101", "Ritik Gupta"));
        building.addApartment(new Apartment("102", "Ankit Sharma"));
        building.addCommonRoom(new CommonRoom("Gym1", "Gym"));
        building.addCommonRoom(new CommonRoom("Library1", "Library"));

        building.recalculateHeatingCooling();

        // Display room status
        System.out.println("Building Status:");
        for (Apartment apartment : building.getApartments()) {
            System.out.println(apartment.getId() + " - Heating: " + apartment.isHeatingEnabled() +
                    ", Cooling: " + apartment.isCoolingEnabled());
        }
        for (CommonRoom commonRoom : building.getCommonRooms()) {
            System.out.println(commonRoom.getId() + " - Heating: " + commonRoom.isHeatingEnabled() +
                    ", Cooling: " + commonRoom.isCoolingEnabled());
        }
    }
}
