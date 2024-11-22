package Examples;
import java.util.ArrayList;
import java.io.*;

public class Ex3_lawnMain {

    public static void run(){

        ArrayList<ex3_client> allClients = new ArrayList<>();

         //loadFile("data/ClientData.csv");

        allClients.add(new ex3_client("McDavid", "100 Maple Dr", 1000, true));
        allClients.add(new ex3_client("Luigi", "101 Maple Dr", 200, false));
        allClients.add(new ex3_client("Sally", "102 Maple Dr", 500, false));
        allClients.add(new ex3_client("McQueen", "103 Maple Dr", 1000, false));
        allClients.add(new ex3_client("Mater", "104 Maple Dr", 5000, false));

//        for (int i = 0; i < allClients.size(); i++) {
//            allClients.get(i).mowLawn();
//        }

//        for(ex3_client clientTemp: allClients ){
//            System.out.println(clientTemp);
            //System.out.println(allClients.get(i));


System.out.println("Welcome to Moe's Mowing");
        while (true) {
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println("1.  Print all Clients");
        System.out.println("2.  Mow all lawns");
        System.out.println("3.  Receive Payment");
        System.out.println("4.  Add new client");
        System.out.println("5.  Delinquent Payments");
        System.out.println("6.  Save and Exit");

        int choice = Library.input.nextInt();
        Library.input.nextLine();
        if (choice == 1) {

            for (int i = 0; i < allClients.size(); i++) {
                System.out.println(allClients.get(i));

            }

        } else if (choice == 2) {
            for (int i = 0; i < allClients.size(); i++) {
                allClients.get(i).mowLawn();

            }
        } else if (choice == 3) {
            System.out.println("Who is paying?");
            String name = Library.input.nextLine();
            System.out.println("How much?");
            double amount = Library.input.nextDouble();
            Library.input.nextLine();

            int foundClient = searchByName(allClients, name);
            allClients.get(foundClient).processPayment(amount);


        } else if (choice == 4) {

        } else if (choice == 5) {
//delinquent payment
            for(ex3_client clientTemp: allClients){
                clientTemp.delinquent();
        }
        } else {

            break;
        }
    } // while
        System.out.println("There is no use moanin as there is no mow like Moe's mowin.  \nGood bye.");

    }//run

    public static int searchByName( ArrayList<ex3_client> list, String searchTerm ){
        for (int i = 0; i < list.size(); i++) {
            if(searchTerm.equalsIgnoreCase( list.get(i).getName() )){
                return i;
            }
        }
        return -1;
    }


    public static void loadFile(String filename, ArrayList<ex3_client> list ) {

        try {
            BufferedReader file = new BufferedReader(new FileReader(filename));

            String dataToRead;
            while( file.ready()){
                dataToRead = file.readLine();

                String tempArray[] = dataToRead.split(",");

                list.add( new ex3_client(  tempArray[0],tempArray[1], Integer.parseInt(tempArray[4]),Boolean.parseBoolean(tempArray[5]), Double.parseDouble(tempArray[2])   ));

            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }//end loadFile



}