package Assignment_2.Bike_Management_Subsystem;

import java.util.Date;

public class BikeManagementSystem {
    public static void main(String[] args) {
        BikeRentalSubSystem bikeRentalSystem = BikeRentalSubSystem.getInstance();
        
        // Adding new bikes to the inventory
        bikeRentalSystem.addNewBikeToInventory("Mountain Bike", "12345", "New");
        bikeRentalSystem.addNewBikeToInventory("Road Bike", "67890", "New");

        // Updating bike information
        bikeRentalSystem.updateBikeInformation("12345", "Location A", "Checked", "Available");

        // Removing a bike from service
        bikeRentalSystem.removeBikeFromService("67890");

        // Retiring a bike
        bikeRentalSystem.retireBike("12345");

        // Printing bike inventory
        for (Bike bike : bikeRentalSystem.getBikeInventory()) {
            System.out.println("Bike Model: " + bike.getModel() + ", Serial Number: " + bike.getSerialNumber());
        }

        // User actions
        User user = new User();
        user.monitorBikeAvailability();
        user.rentBike("Mountain Bike", 7);
        user.returnBike("12345");
        user.trackMaintenanceHistory("67890");
        user.scheduleMaintenance("67890", new Date());
        user.manageBikeStates();
    }
}

