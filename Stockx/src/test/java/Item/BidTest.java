package Item;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BidTest{


    Bid bid = null;

    @Test
    public void toStringTest() {
        Bid bid = new Bid("13", 550);
        assertEquals("size='" + "13" + '\'' +
                ", bid=" + 550, bid.toString());
    }

}