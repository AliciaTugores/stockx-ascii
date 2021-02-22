package Criteria;

import Item.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sales implements Criteria{
    List<Offer> resultadoSales = new ArrayList<Offer>();

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return resultadoSales = sneaker.offers().stream().filter(o -> o instanceof Sale).collect(Collectors.toList());
    }

}
