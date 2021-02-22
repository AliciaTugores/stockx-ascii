package Criteria;


import Item.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinAskTest{


    @Test
    public void checkCriteriaTest(){
        Item zapas = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        zapas.add(new Bid("15", 995));
        zapas.add(new Ask("6", 600));
        zapas.add(new Ask("9.5", 333));
        zapas.add(new Bid("34", 652));
        zapas.add(new Ask("86", 327));

        Criteria minAsk = new MinAsk();
        minAsk.checkCriteria(zapas);

        for (Offer offer : minAsk.checkCriteria(zapas)) {
            assertNotNull(offer);
            assertTrue(offer instanceof Ask);
            assertEquals(327, offer.value()); }

    }

}