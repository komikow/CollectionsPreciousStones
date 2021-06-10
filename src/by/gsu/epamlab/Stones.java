package by.gsu.epamlab;

import java.util.Objects;

public class Stones {
    private String name;
    private double caratWeight;
    private int price;
    private String transparency;

    public Stones(String name, double caratWeight, int price, String transparency) {
        this.name = name;
        this.caratWeight = caratWeight;
        this.price = price;
        this.transparency = transparency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCaratWeight() {
        return caratWeight;
    }

    public void setCaratWeight(double caratWeight) {
        this.caratWeight = caratWeight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTransparency() {
        return transparency;
    }

    public void setTransparency(String transparency) {
        this.transparency = transparency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stones stones = (Stones) o;
        return Double.compare(stones.caratWeight, caratWeight) == 0 && price == stones.price && Objects.equals(name, stones.name) && Objects.equals(transparency, stones.transparency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, caratWeight, price, transparency);
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", caratWeight = " + caratWeight +
                ", price = " + price +
                ", transparency = " + transparency;
    }
}
