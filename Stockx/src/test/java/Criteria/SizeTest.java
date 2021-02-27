package Criteria;

import Item.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class SizeTest{

    @Test
    public void checkCriteriaTest() {
        Item zapas = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        zapas.add(new Bid("9", 995));
        zapas.add(new Ask("6", 600));
        zapas.add(new Ask("8.4", 333));
        zapas.add(new Bid("4", 652));
        zapas.add(new Sale("8", 327));
        zapas.add(new Ask("9", 111));
        zapas.add(new Sale("9.5", 222));
        zapas.add(new Sale("10", 987));
        Size size = new Size("9.5");

        size.checkCriteria(zapas);
        assertNotNull(size.checkCriteria(zapas));
        assertFalse(size.checkCriteria(zapas).isEmpty());

        for (Offer offer : size.checkCriteria(zapas)) {
            assertNotNull(offer);
            assertEquals(1, size.checkCriteria(zapas).size());
            assertEquals("9.5", offer.size());



        }
    }
}