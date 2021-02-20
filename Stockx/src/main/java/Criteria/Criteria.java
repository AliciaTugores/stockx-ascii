package Criteria;

import Item.Item;
import Item.Offer;

import java.util.List;

public interface Criteria {

    List<Offer> checkCriteria(Item sneaker);
}
