package Criteria;

import Item.*;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BidsTest{

    @Test
    public void checkCriteriaBidsTest() {
        Item zapas = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        Bid bid1 = new Bid("15", 995);
        Ask ask1 = new Ask("6", 600);
        Ask ask2 = new Ask("9.5", 333);
        Bid bid2 = new Bid("34", 652);
        Ask ask3 = new Ask("86", 327);
        zapas.add(bid1);
        zapas.add(ask1);
        zapas.add(ask2);
        zapas.add(bid2);
        zapas.add(ask3);
        Bids test = new Bids();
        List<Offer> listBids = test.checkCriteria(zapas);
        assertEquals(2, listBids.size());

    }

}