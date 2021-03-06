package Criteria;

import Item.*;
import Item.Offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxBid implements Criteria{

    public MaxBid(){}

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> resultadoMaxBid = new ArrayList<Offer>();
        Criteria bids = new Bids();
        Offer elementoMaxBid = sneaker.offers().stream().filter(o -> o instanceof Bid).max(Comparator.comparing(o -> o.value())).orElse(null);
        resultadoMaxBid.add(elementoMaxBid);
        return resultadoMaxBid;
    }
}
