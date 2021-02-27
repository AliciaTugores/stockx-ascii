package Criteria;

import Item.*;
import Item.Offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LastSale implements Criteria{

    public LastSale(){}

    List<Offer> resultadoLastSale = new ArrayList<Offer>();

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> zapatilla = sneaker.offers();
        Criteria sales = new Sales();
        Offer sale = sales.checkCriteria(sneaker).stream().reduce((first, second) -> second).orElse(null);
        zapatilla.add(sale);
        return resultadoLastSale;
    }


}
