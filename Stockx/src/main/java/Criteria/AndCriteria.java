package Criteria;

import Item.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AndCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> criteria1 = criteria.checkCriteria(sneaker);
        List<Offer> criteria2 = criteria.checkCriteria(sneaker);
        List<Offer> sizeAndsales = new ArrayList<Offer>();

        return sizeAndsales = criteria1.stream().filter(c -> (criteria2.stream().filter(cc -> cc.equals(c)).count())>=1).collect(Collectors.toList());
    }

}
