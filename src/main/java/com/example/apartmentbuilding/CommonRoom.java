package com.example.apartmentbuilding;

@Getter
@Setter
public class CommonRoom extends Room {
    private String roomType;

    public CommonRoom(String id, String roomType) {
        super(id);
        this.roomType = roomType;
    }

}
