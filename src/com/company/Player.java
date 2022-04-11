package com.company;

public class Player {
      //Instance Variable Requirements
    private String name;
    private int lvl;

     //Static Variable Requirement
    private static int max_level=0;
    private static int player_count=0;

    Player(String playerName,int playerLevel){
        name = playerName;
        lvl = playerLevel;
        //displaying players name and lvl
        System.out.print(playerName);
        System.out.println( " lvl:"  +playerLevel);
        // Update the counter here.
        player_count++;
        //Find the Largest lvl among the players
        if(player_count == 1){
            max_level = playerLevel;
        }
        else if ( playerLevel > max_level){
            max_level = playerLevel;
        }

    }

    //Create static methods - getters for max_level, and counter

    public static int getMax_level(){
        return max_level;
    }
    public static int getPlayer_count(){
        return player_count;
    }

}
