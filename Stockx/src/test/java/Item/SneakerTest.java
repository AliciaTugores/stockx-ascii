package Item;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SneakerTest{

    Sneaker sneaker = null;

    @Before
    public void producto(){
        this.sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
    }


    @Test
    public void toStringTest(){
        assertEquals("Jordan 1 Retro High Dark Mocha" + '\n' + "\t\t\t" + "555088-105" + '\'', sneaker.toString());
    }

    @Test
    public void addTest(){
        Sneaker sneaker = new Sneaker("Estilo", "Nombre");
        sneaker.add(new Bid("15", 995));
        sneaker.add(new Bid("6", 600));
        assertEquals(2, sneaker.offers().size());
    }

}