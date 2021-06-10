package by.gsu.epamlab;

import java.util.Comparator;

public class StonePriceComparator implements Comparator<Stones> {
    public static void necklace() {
    }

    @Override
    public int compare(Stones o1, Stones o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
