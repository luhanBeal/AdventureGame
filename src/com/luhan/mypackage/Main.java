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


    }
}

