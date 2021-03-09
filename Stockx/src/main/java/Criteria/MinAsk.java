package Criteria;

import Item.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinAsk implements Criteria{

    public MinAsk(){}

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> resultadoMinAsks = new ArrayList<Offer>();
        Offer elementoMinAsk = sneaker.offers().stream().filter(o -> o instanceof Ask).min(Comparator.comparing(o -> o.value())).orElse(null);
        resultadoMinAsks.add(elementoMinAsk);
        return resultadoMinAsks;
    }


}
