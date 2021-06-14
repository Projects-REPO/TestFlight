package com.itsJmPaunlagui.testflight;

/**
 *
 * @author JmPaunlagui
 */
class FlightSchedule{

    private String AircraftName;
    private String Origin;
    private String Destination;
    private String DepartureTime;
    private String ArrivalTime;
    private String DateOfFlight;

    // Empty constructor
    public FlightSchedule(){
    }
    
    public FlightSchedule(
            String AircraftName, String Origin,
            String Destination, String DepartureTime,
            String ArrivalTime, String DateOfFlight
    ) {
        this.AircraftName = AircraftName;
        this.Origin = Origin;
        this.Destination = Destination;
        this.DepartureTime = DepartureTime;
        this.ArrivalTime = ArrivalTime;
        this.DateOfFlight = DateOfFlight;
    }
    
    public String getAircraftName() {
        return AircraftName;
    }

    public void setAircraftName(String AircraftName) {
        this.AircraftName = AircraftName;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public String getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(String DepartureTime) {
        this.DepartureTime = DepartureTime;
    }

    public String getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(String ArrivalTime) {
        this.ArrivalTime = ArrivalTime;
    }

    public String getDateOfFlight() {
        return DateOfFlight;
    }

    public void setDateOfFlight(String DateOfFlight) {
        this.DateOfFlight = DateOfFlight;
    }
    
}