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
        zapas.add(new Ask("32", 282));

        Criteria LastSale = new LastSale();
        LastSale.checkCriteria(zapas);

        for (Offer offer : LastSale.checkCriteria(zapas)) {
            assertNotNull(offer);
            assertTrue(offer instanceof Sale);
            assertEquals(987, offer.value());
        }
    }

    @Test
    public void checkCriteriaTest2() {
        Item zapas = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        zapas.add(new Bid("15", 995));
        zapas.add(new Sale("9.5", 352));
        zapas.add(new Sale("9.5", 404));
        zapas.add(new Sale("13", 360));
        zapas.add(new Sale("13", 372));

        Criteria LastSale = new LastSale();
        LastSale.checkCriteria(zapas);

        for (Offer offer : LastSale.checkCriteria(zapas)) {
            assertNotNull(offer);
            assertTrue(offer instanceof Sale);
            assertEquals(372, offer.value());
        }
    }

    @Test
    public void checkCriteriaTest3(){
        Criteria lastSale = new LastSale();

        Item sneaker = new Sneaker("Estilo", "Nombre");
        sneaker.add(new Sale("13", 288));
        sneaker.add(new Sale("6", 200));
        sneaker.add(new Sale("9.5", 59));

        lastSale.checkCriteria(sneaker);

        assertNotNull(lastSale.checkCriteria(sneaker));
        assertFalse(lastSale.checkCriteria(sneaker).isEmpty());

        for (Offer offer : lastSale.checkCriteria(sneaker)) {
            assertNotNull(offer);
            assertTrue(offer instanceof Sale);
            assertEquals(59, offer.value());
            assertEquals("9.5", offer.size());
        }
    }
    }