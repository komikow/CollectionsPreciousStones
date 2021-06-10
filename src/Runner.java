import by.gsu.epamlab.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {
        ArrayList<Stones> stonesSet = new ArrayList<>();

        stonesSet.add(new Stones("Diamond", 1.0, 2158, "transparent"));
        stonesSet.add(new Stones("Emerald", 0.5, 850, "translucent"));
        stonesSet.add(new Stones("Sapphire", 0.8, 1800, "transparent"));
        stonesSet.add(new Stones("Ruby", 0.7, 1650, "translucent"));
        stonesSet.add(new Stones("Aquamarine", 0.8, 300, "opaque"));
        stonesSet.add(new Stones("Agate", 0.6, 380, "translucent"));
        stonesSet.add(new Stones("Chalcedony", 1.0, 690, "opaque"));

        ArrayList<Stones> stonesNecklace = new ArrayList<>();
        ArrayList<String> stonesForNecklace = new ArrayList<>();
        System.out.println("It's all stones:");
        for (Stones stones : stonesSet) {
            System.out.println(stones);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the stones what you want and the word \"end\" for the finish");

        while (scanner.hasNext()) {
            String next = scanner.next();
            if (next.equalsIgnoreCase("end")) {
                break;
            }

            if (StoneNames.contains(next)) {
                stonesForNecklace.add(next);
            }
        }

        System.out.println(stonesForNecklace);
        String[] strings = new String[stonesForNecklace.size()];
        stonesForNecklace.toArray(strings);

        for (int i = 0; i < stonesSet.size(); i++) {
            for (int y = 0; y < strings.length; y++) {
                if (strings[y].equalsIgnoreCase(stonesSet.get(i).getName())) {
                    stonesNecklace.add(stonesSet.get(i));
                }
            }
        }
        System.out.println(stonesSet.get(0).getCaratWeight());
        double totalWeight = 0;
        int totalCost = 0;
        for (int i = 0; i < stonesNecklace.size(); i++) {
            totalWeight += stonesNecklace.get(i).getCaratWeight();
            totalCost += stonesNecklace.get(i).getPrice();
        }
        System.out.println("Total weight = " + totalWeight);
        System.out.println("Total cost = " + totalCost);
        System.out.println("Sorted stones by cost");
        stonesNecklace.sort(new StonePriceComparator());
        for (Stones stones : stonesNecklace) {
            System.out.println(stones);
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        System.out.println("Enter the transparent what you want (transparent, translucent or opaque):");
        String transparentWithScanner = reader.readLine();
        for (int i = 0; i < stonesSet.size(); i++) {
            if (stonesSet.get(i).getTransparency().equalsIgnoreCase(transparentWithScanner)) {
                System.out.println(stonesSet.get(i));
            }
        }
        scanner.close();
        reader.close();
    }
}


