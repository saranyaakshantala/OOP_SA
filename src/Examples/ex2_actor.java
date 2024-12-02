package Examples;

public class ex2_actor {
    private String name;
    private String role;
    private double sales;
    private boolean isPro;

    public ex2_actor( String n, String r ){
        name = n;
        role = r;
        sales = 0;
        isPro = false;
    }//constructor

    public ex2_actor( String n, String r, boolean p ){
        name = n;
        role = r;
        sales = 0;
        isPro = p;
    }//constructor 2

    public String toString(){
        return name + ", " + role + ", " + sales + ", " + isPro;
    }//toString



    public void sellTix(int n){
        sales += n;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double getSales() {
        return sales;
    }

    public boolean isPro() {
        return isPro;
    }

    public void setName(String name) {
        this.name = name;
    }
}
