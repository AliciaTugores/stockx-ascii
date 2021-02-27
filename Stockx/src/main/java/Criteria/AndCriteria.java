package Criteria;

import Item.Item;
import Item.Offer;

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
        List<Offer> criteriaSize = criteria.checkCriteria(sneaker);
        List<Offer> criteriaSales = criteria.checkCriteria(sneaker);
        List<Offer> sizeAndsales = new ArrayList<Offer>();

        return sizeAndsales = criteriaSize.stream().filter(c -> (criteriaSales.stream().filter(cc -> cc.equals(c)).count())>=1).collect(Collectors.toList());
    }

}
