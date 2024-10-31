import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleRentalSystem {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String license_plate;
        String colour;
        String name;
        String address;
        int age;
        double price_per_day;

        void Availability () {


            vehicleInformation(license_plate, price_per_day);
            customersinformation(name, Address, age);


            public void VehicleRentalSystem (String license_plate, String colour, String name, String Address){
                this.license_plate = license_plate;
                this.colour = colour;


            }
        }

        private void customersinformation (String name, String address,int age){
            this.name = name;
            this.address = address;
            this.age = age;
        }

        private void vehicleInformation (cars, trucks, motorcycles) {
            System.out.println("Vehicle information");
            System.out.println("Vehicle Type");
            System.out.println("license plate: " + this.license);
            System.out.println("Color:" + color);

        }
    }
}


//You are tasked with designing a vehicle rental system. The system has to manage different types of vehicles (cars, trucks and motorcycles). It also needs to save information about customers who rent these vehicles.
//
//Vehicle information:
//
//license plate
//colour
//price per day
//Customer information:
//
//Name
//Address
//Age
//When designing this system, have in mind the features that the users will need:
//
//check if the vehicle is currently free or rented out
//calculate total rental price for the customer
//get a list of max last 5 rentals per vehicle
//To submit the exercise, please insert the link to the GitHub repository. The repository must be public.