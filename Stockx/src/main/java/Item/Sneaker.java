package Item;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item{

    private final String style;
    private final String name;
    private int sale;
    private int ask;
    private int bid;
    private List<Offer> ofertas = new ArrayList<Offer>();

    public Sneaker (String style, String name) {
        this.style = style;
        this.name = name;
    }

    String getStyle() {
        return this.style;
    }

    String getName() {
        return this.name;
    }

    @Override
    public int getSale() {
        return this.sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    @Override
    public int getBid(){
        return this.bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public int getAsk() {
        return this.ask;
    }

    public void setAsk(int ask){
        this.ask = ask;
    }

    @Override
    public void add(Offer oferta){
        this.ofertas.add(oferta);
    }

    @Override
    public List<Offer> offers(){
        return this.ofertas;
    }

    @Override
    public String toString() {
        return
                name + '\n' + "\t\t\t" + style + '\'';
    }

}

