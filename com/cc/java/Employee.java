package com.cc.java;

public class Employee {

    private String eLN, eFN, eRL, eEY;

    public Employee( String eLN, String eFN, String eRL, String eEY ) {
        this.eLN = eLN;
        this.eFN = eFN;
        this.eRL = eRL;
        this.eEY = eEY;
    }

    public void seteLN(String eLN) { this.eLN = eLN; }
    public void seteFN(String eFN) { this.eFN = eFN; }
    public void seteRL(String eRL) { this.eRL = eRL; }
    public void seteEY(String eEY) { this.eEY = eEY; }

    public String getInfo( String gI ) {
        switch ( gI ) {
            case "#eLN":
                return eLN;
            case "#eFN":
                return eFN;
            case "#eEY":
                return eEY;
            case "#eRL":
                return eRL;
            default:
                return "no correct input info";
        }
    }
    public String setInfo( int sI1, String sI2 ) {
        switch ( sI1 ) {
            case 0:
            case 1:
            case 2:
            case 3:
                return sI2;
            default:
                return sI2;
        }
    }
}