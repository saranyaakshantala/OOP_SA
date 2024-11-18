package Examples; //folder, affects when we use private instead of public

import java.util.ArrayList;
public class ex2_main {
    public static void run(){

        ArrayList <ex2_actor> allActors = new ArrayList<>();
        allActors.add(new ex2_actor ("Mr. Hempel", "Othello") );
        allActors.add(new ex2_actor ("Ms. Bone", "Iago") );
        allActors.add(new ex2_actor ("Ms Smith", "Desdemona", true) );
        allActors.add(new ex2_actor ("Mr. Vetch", "Cassio", true) );
        allActors.add(new ex2_actor ("Mr. Van Ginhoven", "Emilia", false) );

//        allActors.get(1).sales = 125;

        allActors.get(1).sellTix(125);

        String seller = "Mr Vetch";
        int sold = 75;

        int foundIndex = searchByName(allActors, seller);
        allActors.get(foundIndex).sellTix(sold);




        for (int i = 0; i < allActors.size(); i++) {
 System.out.println(allActors.get(i));
//            allActors.get(i).printMe();
//            System.out.println( allActors.get(i).getRole() + " is played by "  + allActors.get(i).getName());


        }

        //calculate revenue at $15 per ticket

        int total = 0;
        for (int i = 0; i < allActors.size(); i++) {
            total += allActors.get(i).getSales();
        }

    }//run
    

    public static int searchByName( ArrayList<ex2_actor> list, String searchTerm){
        for (int i = 0; i < list.size(); i++) {
            if(searchTerm.equalsIgnoreCase(list.get(i).getName() )){
                return i;
            }
        }

        return -1;
    }

}
