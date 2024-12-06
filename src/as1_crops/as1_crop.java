package as1_crops;

public class as1_crop {

    private String name;
    private double yield;
    private String units;
    private double price;
    private int acres;

    public as1_crop(String n, double y, String u, double p){
        name = n;
        yield = y;
        units = u;
        price = p;
        acres = 0;
    }

    public String toString() {
        return name + "  " + yield + "  " + units + "  " + price + "  " + acres;


    }

    public void setAcres(int acres) {
        this.acres = acres;
    }

    public void addAcres(int additionalAcres) {
        this.acres += additionalAcres;
    }

    public void printMe(){
        System.out.println("crop: " + name + ", " + "yield: " + yield + units + ", " + "acres: " + acres + ", " + "price: $" + price);
    }

    public String getName() {
        return name;
    }

    public double harvest(){
        double hAmount = price * yield * acres;

        System.out.println("Harvest value: $" + hAmount);

        acres = 0;

        return hAmount;
    }
}