package Classes;

import java.util.List;

public class Produto {
    private final String name;
    private final double price;


    public Produto(String productName,double price){
        this.name = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.getName() + " valor : " + this.getPrice();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


}
