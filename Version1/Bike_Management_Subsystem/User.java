package Assignment_2.Bike_Management_Subsystem;

import java.util.Date;

public class User {

    private BikeRentalSubSystem bikeRentalSystem;

    public User() {
        this.bikeRentalSystem = BikeRentalSubSystem.getInstance();
    }

    public void monitorBikeAvailability() {
        bikeRentalSystem.monitorBikeAvailability();
    }

    public void rentBike(String bikeModel, int rentalDuration) {
        bikeRentalSystem.rentBike(bikeModel, rentalDuration);
    }

    public void returnBike(String serialNumber) {
        bikeRentalSystem.returnBike(serialNumber);
    }

    public void trackMaintenanceHistory(String serialNumber) {
        bikeRentalSystem.trackMaintenanceHistory(serialNumber);
    }

    public void scheduleMaintenance(String serialNumber, Date date) {
        bikeRentalSystem.scheduleMaintenance(serialNumber, date);
    }

    public void manageBikeStates() {
        ManageBikeStates.getInstance().manageBikeStates();
    }
}

