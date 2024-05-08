package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @org.junit.jupiter.api.Test
    void testPunchInAndOut() {
        //Arrange
        Employee employee = new Employee("12345", "John Doe", "Receptionist", 25.00, 43.00);
        employee.punchIn(2.45);
        double expectedHoursWorked = 44.00;
        //Act
        employee.punchOut(3.45);
        //Assert
        assertEquals(expectedHoursWorked, (employee.getRegularHours() + employee.getOvertimeHours()));
    }

    @org.junit.jupiter.api.Test
    void testOverloadedPunchInAndOut() {
        //Arrange
        Employee employee = new Employee("12345", "John Doe", "Receptionist", 25.00, 43.00);
        employee.punchIn();
        double expectedHoursWorked = 43.00;
        //Act
        employee.punchOut();
        assertEquals(expectedHoursWorked, (employee.getRegularHours() + employee.getOvertimeHours()));
    }


}