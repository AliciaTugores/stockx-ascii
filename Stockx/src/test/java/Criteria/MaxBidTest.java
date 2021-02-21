package Criteria;

import Item.*;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MaxBidTest{

    @Test
    public void checkCriteriaMaxBid() {
        Criteria maxBid = new MaxBid();

        Item zapas = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        zapas.add(new Bid("15", 995));
        zapas.add(new Ask("6", 600));
        zapas.add(new Ask("9.5", 333));
        zapas.add(new Bid("34", 652));
        zapas.add(new Ask("86", 327));

        maxBid.checkCriteria(zapas);

        for (Offer offer : maxBid.checkCriteria(zapas)) {
            assertNotNull(offer);
            assertTrue(offer instanceof Bid);
            assertEquals(995, offer.value()); }
    }
}