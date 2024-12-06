
package as1_crops;


import java.sql.SQLOutput;
import java.util.ArrayList;

public class as1_main {

    public static void run(){

        ArrayList <as1_crop>  allCrops = new ArrayList<>();

        allCrops.add(new as1_crop("Soybean", 53.2, "bu/acre", 9.91)  );// $USD
        allCrops.add(new as1_crop("Corn", 183.6 , "bu/acre", 4.27)  );
        allCrops.add(new as1_crop("Rice", 5925, "bu/acre", 0.47)  );
        allCrops.add(new as1_crop("Pulses", 38.9, "bu/acre", 4)  );
        allCrops.add(new as1_crop("Wheat", 48.4, "bu/acre", 6.30)  );


        allCrops.get(0).setAcres(100);
        allCrops.get(1).setAcres(300);
        allCrops.get(2).setAcres(200);
        allCrops.get(3).setAcres(150);
        allCrops.get(4).setAcres(250);

        System.out.println();//delete this later

        //for(as1_crop cropTemp: allCrops ){
        //    System.out.println(cropTemp);
       // };


        double totalRevenue = 0;



        while (true) {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("1. Print Farm Summary");
            System.out.println("2. Search and harvest a crop");
            System.out.println("3. Get total revenue");
            System.out.println("4.  Plant a crop");
            System.out.println("5.  Exit");

            int choice = Library.input.nextInt();
            Library.input.nextLine();
            if (choice == 1) {

                for (int i = 0; i < allCrops.size(); i++) {
                    allCrops.get(i).printMe();
                }

            } else if (choice == 2) {


                System.out.println("Provide the name of a crop you would like to search for.");
                String crop = Library.input.nextLine();

                int foundCrop = searchByName(allCrops, crop);

                if (foundCrop != -1) {
                    allCrops.get(foundCrop).printMe();

                    System.out.println("Would you like to harvest a crop?");
                    String harvest = Library.input.nextLine();

                    if (harvest.equalsIgnoreCase("yes")) {

                        totalRevenue += allCrops.get(foundCrop).harvest();

                    } else if (harvest.equalsIgnoreCase("no")) {
                        System.out.println("ugh lame");
                    } else {
                        System.out.println("invalid input try again >:(");
                    }
                }else{
                    System.out.println("Crop not found.");
                }

            } else if (choice == 3) {

                System.out.println("Not Yet Implemented");



                System.out.println("Total revenue from all harvested crops: $" + totalRevenue);

            } else if (choice == 4) {

                System.out.println();
                System.out.println("Which crop would you like to plant?");
                String cropName = Library.input.nextLine();

                int cropIndex = searchByName(allCrops, cropName);

                if (cropIndex != -1) {
                    System.out.println("How many acres would you like to plant?");
                    int acres = Library.input.nextInt();
                    Library.input.nextLine();

                    allCrops.get(cropIndex).addAcres(acres);
                    System.out.println("Planted " + acres + " acres of " + cropName);
                } else {

                    System.out.println("This crop does not exist. Please provide the following details.");
                    System.out.println("Enter the yield per acre:");
                    double yield = Library.input.nextDouble();
                    Library.input.nextLine();
                    System.out.println("Enter the units for the yield:");
                    String units = Library.input.nextLine();
                    System.out.println("Enter the price per unit:");
                    double price = Library.input.nextDouble();
                    Library.input.nextLine();


                    allCrops.add(new as1_crop(cropName, yield, units, price));
                    System.out.println("New crop planted: " + cropName + ", " + yield + ", " + units + ", " + price);
                }

            } else {

                System.out.println("See ya! ");

                break;
            }
        } // while





    }//run

    public static int searchByName( ArrayList<as1_crop> list, String searchTerm ){
        for (int i = 0; i < list.size(); i++) {
            if(searchTerm.equalsIgnoreCase( list.get(i).getName() )){
                return i;
            }
        }
        return -1;
    }




}