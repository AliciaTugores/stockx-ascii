package Criteria;

import Item.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Max implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public Max(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {

    }
}
