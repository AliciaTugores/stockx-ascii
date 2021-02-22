package Criteria;

import Item.*;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class SalesTest{

    @Test
    public void checkCriteriaSalesTest() {
        Item zapas = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        zapas.add(new Bid("15", 995));
        zapas.add(new Ask("6", 600));
        zapas.add(new Ask("9.5", 333));
        zapas.add(new Bid("34", 652));
        zapas.add(new Sale("86", 327));
        zapas.add(new Ask("64", 111));
        zapas.add(new Sale("32", 222));
        zapas.add(new Sale("57", 987));
        Sales test = new Sales();
        List<Offer> listSales = test.checkCriteria(zapas);
        assertEquals(3, listSales.size());
    }

}