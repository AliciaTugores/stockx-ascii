package Criteria;

import Item.*;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class MaxTest{

    @Test
    public void checkCriteriaTest() {
        Item zapas = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        zapas.add(new Bid("9", 995));
        zapas.add(new Ask("6", 600));
        zapas.add(new Ask("8.4", 333));
        zapas.add(new Bid("4", 652));
        zapas.add(new Sale("12", 327));
        zapas.add(new Ask("9", 111));
        zapas.add(new Sale("9.5", 222));
        zapas.add(new Sale("10", 987));

        Criteria criteriaSales = new Sales();
        Criteria criteriaSize = new Size("12");
        Criteria criteriaMax = new Max(criteriaSales, criteriaSize);

        List<Offer> resultado = criteriaMax.checkCriteria(zapas);
        Offer hola = resultado.get(0);
        assertEquals(987, hola.value());

    }
}

