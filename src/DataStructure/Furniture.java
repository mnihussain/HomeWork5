package DataStructure;

import java.util.*;

public class Furniture {
    public static void main(String[] args) {
        List <String> Chair = new ArrayList <String>();
        Chair.add("4 Legs");
        Chair.add("1 Seat");
        Chair.add("1 Back");

        List <String> Table = new ArrayList <String>();
        Chair.add("4 Legs");
        Table.add("1 Top");

        List <String> Bed = new ArrayList <String>();
        Chair.add("4 Legs");
        Bed.add("1 Bed");
        Chair.add("1 Back");

        Map<String, List<String>> furniture = new HashMap <String, List <String>>();
        furniture.put("Study Room",Chair);
        furniture.put("Bed Room",Bed);
        furniture.put("Dinning Room",Table);

        for (Map.Entry<String, List<String>> myHouse:furniture.entrySet()
             ) {
            System.out.println(myHouse);

        }
    }
    }

