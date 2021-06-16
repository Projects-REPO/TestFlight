package com.itsJmPaunlagui.testflight;

/**
 * @author JmPaunlagui
 */
class FlightSchedule {

    private String AircraftName;
    private String Origin;
    private String Destination;
    private String DepartureTime;
    private String ArrivalTime;
    private String DateOfFlight;

    // Empty constructor
    public FlightSchedule() {
    }

    public FlightSchedule(String AircraftName, String Origin, String Destination, String DepartureTime, String ArrivalTime, String DateOfFlight) {
        this.AircraftName = AircraftName;
        this.Origin = Origin;
        this.Destination = Destination;
        this.DepartureTime = DepartureTime;
        this.ArrivalTime = ArrivalTime;
        this.DateOfFlight = DateOfFlight;
    }

    public String getAircraftName(Object valueAt) {
        return AircraftName;
    }

    public String setAircraftName(String AircraftName) {
        this.AircraftName = AircraftName;
        return AircraftName;
    }

    public String getOrigin(Object valueAt) {
        return Origin;
    }

    public String setOrigin(String Origin) {
        this.Origin = Origin;
        return Origin;
    }

    public String getDestination(Object valueAt) {
        return Destination;
    }

    public String setDestination(String Destination) {
        this.Destination = Destination;
        return Destination;
    }

    public String getDepartureTime(Object valueAt) {
        return DepartureTime;
    }

    public String setDepartureTime(String DepartureTime) {
        this.DepartureTime = DepartureTime;
        return DepartureTime;
    }

    public String getArrivalTime(Object valueAt) {
        return ArrivalTime;
    }

    public String setArrivalTime(String ArrivalTime) {
        this.ArrivalTime = ArrivalTime;
        return ArrivalTime;
    }

    public String getDateOfFlight(Object valueAt) {
        return DateOfFlight;
    }

    public String setDateOfFlight(String DateOfFlight) {
        this.DateOfFlight = DateOfFlight;
        return DateOfFlight;
    }

}