package hammurabi;

import hammurabi.Hammurabi;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HammurabiTest {

    Hammurabi ham;

    boolean about(double expected, double actual) {
        return actual > 0.90 * expected && actual < 1.10 * expected;
    }

    @Before
    public void setUp() throws Exception {
        ham = new Hammurabi();
    }

    @Test
    public void testAskHowManyAcresToOrBuySell() {
        Hammurabi hammurabi = new Hammurabi();

        int expectedAcresOwned = 1000;
        int input = 10;


        int actualAcresOwned = hammurabi.howManyAcresToOrBuySell();

        assertEquals(expectedAcresOwned + input, actualAcresOwned);
    }


//    @Test
//    public void testAskHowManyAcresToOrBuySell() {
//        Hammurabi hammurabi = new Hammurabi();
//
//        int expectedAcresOwned = 1000;
//        int input = 10;
//
//
//        int actualAcresOwned = hammurabi.howManyAcresToSell();
//
//        assertEquals(expectedAcresOwned - input, actualAcresOwned);
//    }



    @Test
    public void plagueDeaths() {
    }

    @Test
    public void starvationDeaths() {
    }

    @Test
    public void uprising() {
    }

    @Test
    public void immigrants() {
    }

    @Test
    public void harvest() {
    }

    @Test
    public void grainEatenByRats() {
    }

    @Test
    public void buyAcres() {
    }

    @Test
    public void newCostOfLand() {
    }
}
