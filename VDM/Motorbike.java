public class Motorbike extends Vehicle {

    private int engineCC;   

    public Motorbike(String name, int price, String image, int engineCC) {
        super(name, price, image);  
        this.engineCC = engineCC;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    public String displayDetails() {
        return "Motorbike Name: " + getName() +
               "\nPrice: " + getPrice() + " BDT" +
               "\nEngine: " + engineCC + "cc" +
               "\nImage: " + getImage();
    }
}
