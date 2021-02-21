package Criteria;

import Item.Item;
import Item.Offer;
import Item.Ask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Asks implements Criteria{

    public Asks(){}

    List<Offer> resultadoAsks = new ArrayList<Offer>();

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return this.resultadoAsks = sneaker.offers().stream().filter(o -> o instanceof Ask).collect(Collectors.toList());
    }


}
