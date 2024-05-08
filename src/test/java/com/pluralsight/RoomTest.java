package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @org.junit.jupiter.api.Test
    void testCheckIn() {
        //Arrange
        Room room = new Room(3, 124.00);
        boolean expectedAvailability = false;
        //Act
        room.checkIn();
        //Assert
        assertEquals(expectedAvailability, room.isAvailable());
    }

    @org.junit.jupiter.api.Test
    void testInvalidCheckInOccupied() {
        //Arrange
        Room room = new Room(3, 124.00);
        room.checkIn();
        //Act
        boolean checkIn = room.checkIn();
        //Assert
        assertFalse(checkIn);
    }

    @org.junit.jupiter.api.Test
    void testInvalidCheckInDirty() {
        //Arrange
        Room room = new Room(3, 124.00);
        room.checkIn();
        //Act
        boolean checkIn = room.checkIn();
        //Assert
        assertFalse(checkIn);
    }

    void testCheckOut() {
        //Arrange
        Room room = new Room(3, 124.00);
        boolean expectedAvailability = true;
        //Act
        room.checkOut();
        //Assert
        assertEquals(expectedAvailability, room.isAvailable());
    }

    void testCleanRoom() {
        //Arrange
        Room room = new Room(3, 124.00);
        room.checkIn();
        room.checkOut();
        boolean expectedDirty = false;
        //Act
        room.cleanRoom();
        //Assert
        assertEquals(expectedDirty, room.isDirty());
    }

    void testInvalidCleanRoomWhenOccupied() {
        //Arrange
        Room room = new Room(3, 124.00);
        room.checkIn();
        boolean expectedDirty = true;
        //Act
        room.cleanRoom();
        //Assert
        assertEquals(expectedDirty, room.isDirty());
    }

}