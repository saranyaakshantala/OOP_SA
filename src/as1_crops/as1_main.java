package as1_crops;

import Examples.ex3_client;

import java.util.ArrayList;

public class as1_main {

    public static void run(){

        ArrayList<as1_crop>  allCrops = new ArrayList<>();

        allCrops.add(new as1_crop("Pulses", 38.9, "bu/acre", 4)  ); //change the values later to make it real data


        for(as1_crop cropTemp: allCrops ){
            System.out.println(cropTemp);
        };

    }//run





}
