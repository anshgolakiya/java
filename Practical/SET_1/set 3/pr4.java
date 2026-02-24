 package pr4;
class Vehicle{
    String vehicleNumber ;
    String Brand ;
    String fuelType ;
    
    Vehicle(String Vnumber , String Vbrand , String Ftype){
        vehicleNumber = Vnumber ;
        Brand = Vbrand ;
        fuelType = Ftype ;
    }
    void displayDetails(){
        System.out.println("Vehicle number = : " + vehicleNumber );
        System.out.println("Vehical Brand name : " + Brand) ;
        System.out.println("Fuel type : " + fuelType);
    }
    class Car extends Vehicle{
        int numberOfSeats ;
        boolean ACavailable ;
        public Car(String Vnumber, String Vbrand, String Ftype , int numberOfSeats , boolean ACavailable) {
            super(Vnumber, Vbrand, Ftype);
            this.numberOfSeats = numberOfSeats ;
            this.ACavailable = ACavailable ;
        }
        void displayDetail(){
            System.out.println("Number of seats : " + numberOfSeats);
            System.out.println("AC availbles : " + ACavailble);
        } 
    }
}
public class pr1 {
    public static void main(String[] args){
         Vehicle v1 = new Vehicle("1256","tata","petrol");
         System.out.println("----------vehivle-----");
         v1.displayDetails() ;
         
    }
}
