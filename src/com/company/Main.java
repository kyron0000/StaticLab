package com.company;

public class Main {

        public static void main(String[] args) throws Exception {
            System.out.println("Howdy Coder!");
            /**
             * Create 2-5 Objects with the Player Class, and initialize
             * the values via the constructor.
             */
            Player one = new Player("Kyron",100);
            Player two = new Player("Zean",97);
            Player three = new Player("Luffy", 101);
            Player four = new Player("Zoro",99);
            Player five = new Player("Sanji",98);


             // Display total Players
             //Display The largest level among the players

            System.out.println("Total Player/s: "+ Player.getPlayer_count());
            System.out.println("Largest Level For All Players: "+ Player.getMax_level());



    }
}
