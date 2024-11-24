package Examples;

public class ex3_client {

    private String name;
    private String address;
    private int lawnSize;
    private boolean hasDog;
    private double outstandingFees;

    //constructor method
    public ex3_client(String n, String a, int l, boolean d){ //on test and AP exam
        name= n;
        address = a;
        lawnSize =l;
        hasDog=d;
        outstandingFees= 0;

    }

    public ex3_client(String n, String a, int l, boolean d, double f){
        name= n;
        address = a;
        lawnSize =l;
        hasDog=d;
        outstandingFees= f;

    }

    public String toString() {
        return name + "  " + address + "  " + lawnSize + "  " + hasDog + "  " + outstandingFees;


    }

    public void printMe(){
        System.out.println();
        System.out.println(); //format data, readable printout
    }

    public void mowLawn(){
        double baseFee= 30;

        if(lawnSize > 200){
            baseFee += 0.1*(lawnSize-200);

        }

        if(hasDog){baseFee += 50;}

        outstandingFees+= baseFee;

        System.out.println("\n Hi bbg " + name + "! Your Lawn was mowed today for the charge of $" + baseFee +"\n Your outstandimg fees are $" + outstandingFees +"\n");

    }

    public void setHasDog(boolean hasDog) {
        this.hasDog = hasDog;
    }

    public void processPayment(double dollars){
        outstandingFees -= dollars;
        System.out.println(name + "you currently owe $" + outstandingFees);
    }

    public String getName() {
        return name;
    }//getName

    public void delinquent(){
        double interest = 5 + outstandingFees * 0.1;
        System.out.println(name + "your payment is overdue, you have been charged an interest of " + interest);
        outstandingFees += interest;

        if(outstandingFees > 500 && hasDog){
            hasDog = false;
        }
    }//delinquent

    public String getAddress() {
        return address;
    }

    public int getLawnSize() {
        return lawnSize;
    }
}