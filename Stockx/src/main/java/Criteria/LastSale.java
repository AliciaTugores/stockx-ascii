package Criteria;

import Item.*;
import java.util.ArrayList;
import java.util.List;


public class LastSale implements Criteria{

    public LastSale(){}

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> resultadoLastSale = new ArrayList<Offer>();
        Criteria sales = new Sales();
        Offer sale = sales.checkCriteria(sneaker).stream().reduce((first, second) -> second).orElse(null);
        resultadoLastSale.add(sale);
        return resultadoLastSale;
    }


}
