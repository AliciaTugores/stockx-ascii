package Criteria;

import Item.Item;
import Item.Offer;
import Item.Bid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Bids implements Criteria{

    public Bids(){}

    List<Offer> resultadoBids = new ArrayList<Offer>();

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return this.resultadoBids = sneaker.offers().stream().filter(o -> o instanceof Bid).collect(Collectors.toList());
    }

}
