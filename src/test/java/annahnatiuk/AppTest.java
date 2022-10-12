package annahnatiuk;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void twentySixShouldReturnZero()
    {
        assertEquals('0', App.determineGrade(26));
    }

    @Test
    public void fourtyNineShouldReturnTwo()
    {
        assertEquals('2', App.determineGrade(49));
    }

    @Test
    public void sixtyNineShouldReturnThree()
    {
        assertEquals('3', App.determineGrade(69));
    }

    @Test
    public void eightySevenShouldReturnFour()
    {
        assertEquals('4', App.determineGrade(87));
    }

    @Test
    public void ninetyShouldReturnFive()
    {
        assertEquals('5', App.determineGrade(90));
    }

    @Test
    public void zeroShouldReturnZero()
    {
        assertEquals('0', App.determineGrade(0));
    }

    @Test
    public void twentySevenShouldReturnTwo()
    {
        assertEquals('2', App.determineGrade(27));
    }

    @Test
    public void fiftyShouldReturnThree()
    {
        assertEquals('3', App.determineGrade(50));
    }

    @Test
    public void seventyShouldReturnFour()
    {
        assertEquals('4', App.determineGrade(70));
    }

    @Test
    public void eightyEightShouldReturnFive()
    {
        assertEquals('5', App.determineGrade(88));
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test(expected = Exception.class)
    public void negativeOneShouldReturnExeption() throws Exception {
	    //App app = new App();
	    App.determineGrade(-1);
    }
}
