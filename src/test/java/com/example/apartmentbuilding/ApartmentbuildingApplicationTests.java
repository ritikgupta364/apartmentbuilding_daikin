package com.example.apartmentbuilding;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApartmentbuildingApplicationTests {

	@Test
	void contextLoads() {
	}
	
	public static void main(String[] args) {
        Building building = new Building(25.0);

        building.addApartment(new Apartment("101", "John Doe"));
        building.addApartment(new Apartment("102", "Jane Doe"));
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

        // Allow user to input new temperature
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new requested temperature: ");
        double newTemperature = scanner.nextDouble();
        building.updateRequestedTemperature(newTemperature);

        // Display updated status
        System.out.println("Updated Building Status:");
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
