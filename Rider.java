public class Rider extends User{
    private double rating;
    private String paymentInfo;

    public Rider(double rating, String paymentInfo,
            String name, String id, String phoneNum) {
        super(name, id, phoneNum);
        this.rating = rating;
        this.paymentInfo = paymentInfo;
    }

    public double getRating() {
        return rating;
    }

    public void requestRide(Trip trip){
        System.out.println(super.getName() + "requested ride from " +trip.getPickup()
                + " to " + trip.getDropOff());
    }
    
    public void rateDriver(){
        System.out.println(super.getName() + " rated " + rating + " to the driver");
    }
    
    public void displayProfile(){
        System.out.println("Rider's Profile:" +
                "\nName: " + super.getName() + 
                "\nId: " + super.getId() +
                "\nPhone number: " + super.getPhoneNum());
    }
}
