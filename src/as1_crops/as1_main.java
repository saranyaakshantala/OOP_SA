package as1_crops;


import Examples.ex3_client;

import java.util.ArrayList;

public class as1_main {

    public static void run(){

        ArrayList<as1_crop>  allCrops = new ArrayList<>();

        allCrops.add(new as1_crop("Soybean", 53.2, "bu/acre", 9.91)  );// $USD
        allCrops.add(new as1_crop("Corn", 183.6 , "bu/acre", 4.27)  );
        allCrops.add(new as1_crop("Sugarcane", 38.2, "tons/acre", 0.80)  );
        allCrops.add(new as1_crop("Rice", 5925, "bu/acre", 0.47)  );
        allCrops.add(new as1_crop("Pulses", 38.9, "bu/acre", 4)  );
        allCrops.add(new as1_crop("Wheat", 48.4, "bu/acre", 6.30)  );
        allCrops.add(new as1_crop("Apple", 30.5, " MILLION bu", 45)  );
        allCrops.add(new as1_crop("Cotton", 573, "pounds/acre", 1.48)  );


        allCrops.get(0).setAcres(125);
        allCrops.get(1).setAcres(125);
        allCrops.get(2).setAcres(125);
        allCrops.get(3).setAcres(125);
        allCrops.get(4).setAcres(125);
        allCrops.get(5).setAcres(125);
        allCrops.get(6).setAcres(125);
        allCrops.get(7).setAcres(125);


        System.out.println();//delete this later

        for(as1_crop cropTemp: allCrops ){
            System.out.println(cropTemp);
        };



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

                System.out.println("Not Yet Implemented!");


                for (int i = 0; i < allCrops.size(); i++) {
                    allCrops.get(i).printMe();
                }

            } else if (choice == 2) {

                System.out.println("Not Yet Implemented");

                System.out.println("Provide the name of a crop you would like to search for.");
                String crop = Library.input.nextLine();

                int foundCrop = searchByName(allCrops, crop);

                allCrops.get(foundCrop).printMe();

                System.out.println("Would you like to harvest a crop?");
                String harvest = Library.input.nextLine();

                if(harvest.equalsIgnoreCase("yes")){

                }else if(harvest.equalsIgnoreCase("no")){
                    System.out.println("ugh lame");
                }else{
                    System.out.println("invalid input try again >:(");
                }

            } else if (choice == 3) {

                System.out.println("Not Yet Implemented");

            } else if (choice == 4) {

                System.out.println();


            } else {

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
