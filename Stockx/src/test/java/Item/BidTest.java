package Item;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BidTest{


    Bid bid = null;

    @Test
    public void toStringTest() {
        Bid bid = new Bid("13", 550);
        assertEquals("\n\t\t" + "13" + "\t\t" + 550, bid.toString());
    }

}