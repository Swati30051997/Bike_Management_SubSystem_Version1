package Assignment_2.Bike_Management_Subsystem;


public class ManageBikeStates {
    private static ManageBikeStates instance;

    private ManageBikeStates() {}

    public static synchronized ManageBikeStates getInstance() {
        if (instance == null) {
            instance = new ManageBikeStates();
        }
        return instance;
    }

    public void manageBikeStates() {
        // Implement logic to manage bike states
        System.out.println("Managing bike states...");
    }
}

