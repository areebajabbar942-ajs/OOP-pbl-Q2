import java.util.*;
public class Driver extends User{
    private String vehicleName;
    private String vehicleModel;
    private String vehicleNum;
    private boolean isAvailable;
    private ArrayList<Double> ratings = new ArrayList<>();

    public Driver(String vehicleName, String vehicleModel, 
            String vehicleNum, boolean isAvailable,
            String name, String id, String phoneNum) {
        super(name, id, phoneNum);
        this.vehicleName = vehicleName;
        this.vehicleModel = vehicleModel;
        this.vehicleNum = vehicleNum;
        this.isAvailable = isAvailable;
    }
    
    public void acceptRide(Trip trip){
        if(trip.getStatus() != "requested"){
            System.out.println("Trip already processed.");
        }
        else{
            if(isAvailable == true){
                trip.setStatus("Accepted");
                System.out.println(super.getName() + " accepted the ride");
            }
            else{
                trip.setStatus("Rejected");
                System.out.println(super.getName() + " rejected the ride");
            }
        }
    }
    
    public void driverRating(double rate){
        ratings.add(rate);
    }
    
    public double averageRating(){
        if (ratings.isEmpty()) {
            return 0;
        }
        
        double sum = 0;
        for (double r : ratings) {
            sum += r;
        }
        
        double avg= sum / ratings.size();
        return (avg);
    }
    
    public void displayProfile(){
        System.out.println("Driver's Profile: " + "\nName: " + 
                super.getName() + ", Phone number: " + super.getPhoneNum() + 
                "\nRating: " + averageRating());
        System.out.println("Vehicle Details: " + 
                "\nVehicle name: " + vehicleName + 
                "\nVehicle model: " + vehicleModel +
                "\nVehicle number: " + vehicleNum);
    }
}
