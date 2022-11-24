package com.cc.java;

public class Employee {

    private String employeeLastName;
    private String employeeFastName;
    private String employeeRole;
    private int employeeEntryYear;

    public Employee(String employeeLastName, String employeeFastName, String employeeRole, int employeeEntryYear) {
        this.employeeLastName = employeeLastName;
        this.employeeFastName = employeeFastName;
        this.employeeRole = employeeRole;
        this.employeeEntryYear = employeeEntryYear;
    }

    public String getInfo( String flag ) {
        switch ( flag ) {
            case "#eLN":
                return employeeLastName;
            case "#eFN":
                return employeeFastName;
            case "#eEY":
                return String.valueOf( employeeEntryYear );
            case "#eRL":
                return employeeRole;
            default:
                return "no correct input info";
        }
    }    
}
