package Item;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SaleTest{

    Sale sale = null;

    @Test
    public void toStringTest() {
        Sale sale = new Sale("16", 641);
        assertEquals("\n\t\t" + "16" + "\t\t" + 641, sale.toString());
    }

}