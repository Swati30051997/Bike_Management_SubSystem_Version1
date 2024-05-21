package Assignment_2.Bike_Management_Subsystem;

public class Bike {
    private String model;
    private String serialNumber;
    private String initialCondition;
    private String location;
    private String maintenanceRecord;
    private String status;

    public Bike(String model, String serialNumber, String initialCondition) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.initialCondition = initialCondition;
        this.status = "Available";
    }

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getInitialCondition() {
        return initialCondition;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMaintenanceRecord() {
        return maintenanceRecord;
    }

    public void setMaintenanceRecord(String maintenanceRecord) {
        this.maintenanceRecord = maintenanceRecord;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

