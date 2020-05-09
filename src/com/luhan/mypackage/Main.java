package com.luhan.mypackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are in your room studying Java."));
        locations.put(1, new Location(1, "You are in the living room standing."));
        locations.put(2, new Location(2, "You are in the kitchen looking for something to eat."));
        locations.put(3, new Location(3, "You are in the bathroom looking at yourself in the mirror"));
        locations.put(4, new Location(4, "You are in the backyard stargazing."));
        locations.put(5, new Location(5, "You are in your parents bedroom looking at your phone."));

        //adding exits
        locations.get(1).addExit("w", 5);
        locations.get(1).addExit("S", 2);
        locations.get(1).addExit("N", 3);
        locations.get(1).addExit("Q", 0);

        locations.get(2).addExit("N", 1);
        locations.get(2).addExit("Q", 0);

        locations.get(3).addExit("N", 4);
        locations.get(3).addExit("S", 1);
        locations.get(3).addExit("Q", 0);

        locations.get(4).addExit("S", 3);
        locations.get(4).addExit("Q", 0);

        locations.get(5).addExit("E", 1);
        locations.get(5).addExit("Q", 0);

        int loc =1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("You can go: ");
            for (String exit: exits.keySet()) {
                System.out.println(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction.");

        }
    }
}

