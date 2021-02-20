package Item;

import java.util.List;

public interface Item {

    int getBid();
    int getAsk();
    int getSale();
    void add(Offer sneaker);
    List<Offer> offers();
    void setBid(int bid);
    void setAsk(int ask);
    void setSale(int sale);
}
