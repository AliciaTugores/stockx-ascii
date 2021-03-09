package Criteria;

import Item.Item;
import Item.Offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Min implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public Min(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Criteria andCriteria = new AndCriteria(criteria, otherCriteria);
        List<Offer> minAndCriteria = new ArrayList<Offer>();
        Offer offer = andCriteria.checkCriteria(sneaker).stream().min(Comparator.comparing(c -> c.value())).orElse(null);
        minAndCriteria.add(offer);
        return minAndCriteria;
    }
}
