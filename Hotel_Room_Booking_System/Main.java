/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel_Room_Booking_System;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // Requirement #4: Room array + Requirement #5: Loop
        Room[] rooms = {
            new StandardRoom("101", "Juan Cruz", 3),
            new DeluxeRoom("202", "Ana Reyes", 2),
            new SuiteRoom("303", "Maria Santos", 4)
        };

        System.out.println("===== HOTEL BOOKING SYSTEM =====\n");
        for (Room room : rooms) {
            room.displayBooking();
        }
    }
}

class Room {
    protected String roomNumber, roomType, guestName;
    protected int numberOfNights;
    public Room(String roomNumber, String roomType, String guestName, int numberOfNights) {
        this.roomNumber = roomNumber; this.roomType = roomType;
        this.guestName = guestName; this.numberOfNights = numberOfNights;
    }
    public double calculateBookingCost() { return 0; }
    public void displayBooking() {
        System.out.println("Room: " + roomNumber + " | Type: " + roomType);
        System.out.println("Guest: " + guestName + " | Nights: " + numberOfNights);
        System.out.println("Total Cost: P" + calculateBookingCost());
        System.out.println("-----------------------------");
    }
}

class StandardRoom extends Room {
    public StandardRoom(String roomNumber, String guestName, int numberOfNights) {
        super(roomNumber, "Standard", guestName, numberOfNights);
    }
    @Override
    public double calculateBookingCost() {
        return numberOfNights * 1500; // No additional charge
    }
}

class DeluxeRoom extends Room {
    public DeluxeRoom(String roomNumber, String guestName, int numberOfNights) {
        super(roomNumber, "Deluxe", guestName, numberOfNights);
    }
    @Override
    public double calculateBookingCost() {
        return numberOfNights * (2500 + 300); // 2500 + 300 breakfast per night
    }
}

class SuiteRoom extends Room {
    public SuiteRoom(String roomNumber, String guestName, int numberOfNights) {
        super(roomNumber, "Suite", guestName, numberOfNights);
    }
    @Override
    public double calculateBookingCost() {
        return (numberOfNights * 4000) + 1000; // 4000 per night + 1000 service fee
    }
}