package com.example.apartmentbuilding;

@Getter
@Setter
public class Apartment extends Room {
    private String ownerName;

    public Apartment(String id, String ownerName) {
        super(id);
        this.ownerName = ownerName;
    }

}
