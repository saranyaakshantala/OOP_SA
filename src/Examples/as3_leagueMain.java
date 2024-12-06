package Examples;


import as1_crops.as1_crop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class as3_leagueMain {

    public static void run() {
        ArrayList<as3_team> allTeams = new ArrayList<>();
//        loadFile("data/data.csv", allTeams);

        allTeams.add(new as3_team("nickname", "city", "division", "10" ,"10","1-0")  );// $USD


while(true) {
    System.out.println();
    System.out.println("What would you like to do?");
    System.out.println("1. Print List of Teams");
    System.out.println("2. Find averages OR Find the Highest/Lowest");
    System.out.println("3. View Division");
    System.out.println("4.  Sort by __?__");
    System.out.println("5.   Update Stats");
    System.out.println("6.   Exit and Save");

    int choice = Library.input.nextInt();
    Library.input.nextLine();
    if (choice == 1) {

    } else if (choice == 2) {


    } else if (choice == 3) {

    } else if (choice == 4) {

    } else if (choice == 5) {

    } else {
        break;
    }//choices

}//while
    }//run

//    public static void loadFile(String filename, ArrayList<as3_team> list ) {
//
//        try {
//            BufferedReader file = new BufferedReader(new FileReader(filename));
//
//            String dataToRead;
//            while( file.ready()){
//                dataToRead = file.readLine();
//
//                String tempArray[] = dataToRead.split(",");
//
//                list.add( new as3_team(  tempArray[0],tempArray[1], Integer.parseInt(tempArray[2]),Boolean.parseBoolean(tempArray[3]), Double.parseDouble(tempArray[4])   ));
//            }
//        }
//        catch (IOException e) {
//            System.out.println(e);
//        }
//    }//end loadFile




}
