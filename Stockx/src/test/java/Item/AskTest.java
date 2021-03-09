package Item;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AskTest{

    Ask ask = null;

    @Test
    public void toStringTest() {
        Ask ask = new Ask("13", 288);
        assertEquals("\n\t\t" + "13" + "\t\t" + 288, ask.toString());
    }

}