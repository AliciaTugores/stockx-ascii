package Criteria;

import Item.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AndCriteriaBids implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteriaBids(Criteria criteria, Criteria otherCriteria) {

        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> criteriaSize = criteria.checkCriteria(sneaker);
        List<Offer> criteriaBids = criteria.checkCriteria(sneaker);
        List<Offer> sizeAndbids = new ArrayList<Offer>();

        return sizeAndbids = criteriaSize.stream().filter(c -> (criteriaBids.stream().filter(cc -> cc.equals(c)).count())>=1).collect(Collectors.toList());
    }
}
