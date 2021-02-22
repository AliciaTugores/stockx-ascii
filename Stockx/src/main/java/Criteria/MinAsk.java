package Criteria;

import Item.Item;
import Item.Offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinAsk implements Criteria{

    public MinAsk(){}

    List<Offer> resultadoMinAsks = new ArrayList<Offer>();

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Offer elementoMinAsk = sneaker.offers().stream().min(Comparator.comparing(o -> o.value())).orElse(null);
        resultadoMinAsks.add(elementoMinAsk);
        return resultadoMinAsks;
    }


}
