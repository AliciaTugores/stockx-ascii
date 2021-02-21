package Criteria;

import Item.*;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class BidsTest{

    @Test
    public void checkCriteriaBidsTest() {
        Item zapas = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        zapas.add(new Bid("15", 995));
        zapas.add(new Ask("6", 600));
        zapas.add(new Ask("9.5", 333));
        zapas.add(new Bid("34", 652));
        zapas.add(new Ask("86", 327));
        Bids test = new Bids();
        List<Offer> listBids = test.checkCriteria(zapas);
        assertEquals(2, listBids.size());
    }

}