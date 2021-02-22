package Item;

public class Sale implements Offer{

    private String size;
    private Integer price;

    public Sale(String size, Integer price){
        this.size = size;
        this.price = price;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.price;
    }

    public String toString(){
        return "\n\t\t" + size() + "\t\t" + value();
    }


}
