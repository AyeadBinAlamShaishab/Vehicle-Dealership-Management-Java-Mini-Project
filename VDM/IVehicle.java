public abstract class IVehicle {

    private String name;
    private int price;
    private String image;

    public IVehicle(String name, int price, String image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public abstract String displayDetails();
    
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }
}
