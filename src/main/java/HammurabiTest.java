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
    public void testNumberOfPeopleSurvived() {
        Hammurabi hammurabi = new Hammurabi();

        int expectedNumberPeople = 10;
        int input = 200;


        int actualPeopleSurvived = hammurabi.feedPeople(input);

        assertEquals(expectedNumberPeople, actualPeopleSurvived);
    }

    @Test
    public void testNumberOfPeopleStarved() {
        Hammurabi hammurabi = new Hammurabi();
        int numberOfPeople = 100;
        int expectedNumberPeople = 90;
        int input = 200;


        int actualPeopleSurvived = hammurabi.feedPeople(input);

        assertEquals(expectedNumberPeople, numberOfPeople - actualPeopleSurvived);
    }

    @Test
    public void testBuyAcres() {
        Hammurabi hammurabi = new Hammurabi();

        int expectedAcres = 1002;
        int input = 2;


        int actualAcresOwned = hammurabi.howManyAcresToOrBuySell(input);

        assertEquals(expectedAcres, actualAcresOwned);
    }

    @Test
    public void testSellAcres() {
        Hammurabi hammurabi = new Hammurabi();

        int expectedAcres = 950;
        int input = -50;


        int actualAcresOwned = hammurabi.howManyAcresToOrBuySell(input);

        assertEquals(expectedAcres, actualAcresOwned);
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

