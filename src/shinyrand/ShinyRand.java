/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shinyrand;

import java.security.SecureRandom;
import java.util.ArrayList;

/**
 *
 * @author Wout
 */
public class ShinyRand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> sets = new ArrayList<>();
        for(int a=0; a<8; a++)
        {
            sets.add(new ArrayList<>());

            SecureRandom random = new SecureRandom();
            int shiny = random.nextInt(64);
            for(int i=1; i<=302; i++){
                if(shiny == random.nextInt(64))
                    sets.get(a).add("Alola dex number "+i);
            }
            for(int i=1; i<=28; i++){
                for(int j=1; j<=3; j++){
                    if(shiny == random.nextInt(64))
                        sets.get(a).add("Island scan number "+i+", evolution number "+j);
                }
            }
        }
        
        int biggestindex = 0;
        int value = 0;
        for(int i=0; i<sets.size(); i++)
        {
            if(sets.get(i).size() > value)
            {
                biggestindex = i;
                value = sets.get(i).size();
            }
        }
        
        for(int i=0; i<sets.get(biggestindex).size(); i++)
            System.out.println(sets.get(biggestindex).get(i));
    }
    
}
