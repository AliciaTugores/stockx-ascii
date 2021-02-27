package Criteria;

import Item.Item;
import Item.Offer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Size implements Criteria{

    String size;

    public Size (String size) {
        this.size = size;
    }

    List<Offer> resultadoSize = new ArrayList<Offer>();

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return resultadoSize = sneaker.offers().stream().filter(r -> r.size().equals(this.size)).collect(Collectors.toList());
    }

}
