public class Main {
    public static void main(String[] args){
       Trip t1 = new Trip("Saddar", "DHA");
       Trip t2 = new Trip("Bahria", "Malir");
        
       Rider r1= new Rider(4.5, "JazzCash", "Abeeha", "Ab-2345", "033-987654");
       Rider r2 = new Rider(4.7, "EasyPaisa", "Areeba", "Ar-4567", "034-987612");
       Rider r3 = new Rider(4.2, "JazzCash", "Ilhaam", "Il-6543", "032-145632");
       
       Driver d1 = new Driver("Toyyota", "Corolla", "XYZ-023", true, "Ali", "A-4563", "0333-214765");
       Driver d2 = new Driver("Suzuki", "ALto", "GFS-786", false, "Amjad", "Am-0987", "0333-765432");
       
       d1.driverRating(4.2);
       d1.driverRating(3.9);
       d1.driverRating(4.5);
       
       d2.driverRating(3.8);
       d2.driverRating(4.7);
       d2.driverRating(4.1);
       
       r1.displayProfile();
       r1.requestRide(t1);
       
       System.out.println();
       
       d1.displayProfile();
       d1.acceptRide(t1);
       
       System.out.println();
       
       r1.rateDriver();
       d1.driverRating(r1.getRating());
       
       System.out.println();
       
       r2.displayProfile();
       r2.requestRide(t2);
       
       System.out.println();
       
       d1.displayProfile();
       d1.acceptRide(t2);
       
       System.out.println();
       
       r2.rateDriver();
       d1.driverRating(r2.getRating());
       
       System.out.println();
       
       r3.displayProfile();
       r3.requestRide(t1);
       
       System.out.println();
       
       d2.displayProfile();
       d2.acceptRide(t1);
    }
}
