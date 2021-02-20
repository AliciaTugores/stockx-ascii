package Item;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SneakerTest{

    Sneaker sneaker = null;

    @Test
    public void toStringTest(){
        this.sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        assertEquals("Jordan 1 Retro High Dark Mocha" + '\n' + "\t\t\t" + "555088-105" + '\'', sneaker.toString());
    }

}