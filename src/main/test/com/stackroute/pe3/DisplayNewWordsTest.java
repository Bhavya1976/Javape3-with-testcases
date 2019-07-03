package main.test.com.stackroute.pe3;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import main.java.com.stackroute.pe3.DisplayNewWords;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DisplayNewWordsTest {

    DisplayNewWords display;

    @Before
    public void setUp() {
        display = new DisplayNewWords();
    }

    @After
    public void tearDown(){
        display = null;
    }

    @Test
    public void givenInputCountriesShouldReturnStringsRemovedVowelsMessage() {
        String []input={"India",
                "United States" ,
                "Germany",
                "Egypt" ,
                "czechoslovakia"};
        String []expected={"Ind","Untd Stts","Grmny","Egypt","czchslvk"};
        assertArrayEquals(expected,display.isVowelRemove(input));
    }
}
