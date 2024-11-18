package Examples;
import java.util.ArrayList;

public class Ex3_lawnMain {

    public static void run(){

        ArrayList<ex3_client> allClients = new ArrayList<>();

        allClients.add(new ex3_client("McDavid", "100 Maple Dr", 1000, true));
        allClients.add(new ex3_client("Luigi", "101 Maple Dr", 200, false));
        allClients.add(new ex3_client("Sally", "102 Maple Dr", 500, false));
        allClients.add(new ex3_client("McQueen", "103 Maple Dr", 1000, false));
        allClients.add(new ex3_client("Mater", "104 Maple Dr", 5000, false));

        for (int i = 0; i < allClients.size(); i++) {
            allClients.get(i).mowLawn();
        }

        for(ex3_client clientTemp: allClients ){
            System.out.println(clientTemp);
            //System.out.println(allClients.get(i));
        };



    }//run


}