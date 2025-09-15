public class Vehicle extends IVehicle {

    public Vehicle(String name, int price, String image) {
        super(name, price, image); 
    }

   
    public String displayDetails() {
        return "Vehicle Name: " + getName() + "\nPrice: " + getPrice() + " BDT\nImage: " + getImage();
    }
}
