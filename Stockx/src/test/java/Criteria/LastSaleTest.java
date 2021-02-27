package Criteria;


import Item.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class LastSaleTest{


    @Test
    public void checkCriteriaTest() {
        Item zapas = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        zapas.add(new Bid("15", 995));
        zapas.add(new Ask("6", 600));
        zapas.add(new Ask("9.5", 333));
        zapas.add(new Bid("34", 652));
        zapas.add(new Sale("86", 327));
        zapas.add(new Ask("64", 111));
        zapas.add(new Sale("32", 222));
        zapas.add(new Sale("57", 987));

        Criteria LastSale = new LastSale();
        LastSale.checkCriteria(zapas);

        for (Offer offer : LastSale.checkCriteria(zapas)) {
            assertNotNull(offer);
            assertTrue(offer instanceof Sale);
            assertEquals(987, offer.value());
        }
    }
    }