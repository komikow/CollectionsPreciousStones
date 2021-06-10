package by.gsu.epamlab;

public enum StoneNames {
    DIAMOND, EMERALD, SAPPHIRE, RUBY, AGATE, AQUAMARINE, CHALCEDONY;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

    public static boolean contains(String s) {
        for (StoneNames stoneNames : values()) {
            if (stoneNames.name().equalsIgnoreCase(s)) {
                return true;
            }
        }
        return false;
    }
}
