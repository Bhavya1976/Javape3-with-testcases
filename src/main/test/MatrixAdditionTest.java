package main.test;

import org.junit.Before;


    import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import main.java.com.stackroute.pe3.MatrixAddition;

import static org.junit.Assert.*;

    public class MatrixAdditionTest {
        MatrixAddition add;

        @Before
        public void setUp() {

            add = new matrixAddition();
        }

        @After
        public void tearDown() {

            add = null;
        }


        @Test
        public void givenNumberShouldReturnSingleCharacterMessage() {
            //arrange


            //act
            String result = check.checkForConsonantsOrVowel(" a ");

            //assert
            assertEquals(" a  vowel", result);
        }

        @Test
        public void givenStringShouldReturnSingleConsonantMessage() {
            //arrange

            //act
            String result = check.matrixAddition(" c ");

            //assert
            assertEquals("c consonant", result);
        }

        @Test
        public void givenStringShouldReturnMoreConsonantVowelMessage() {
            //arrange

            //act
            String result = check.checkForConsonantsOrVowel(" ap ");

            //assert
            assertEquals(" a  vowel p consonant  ", result);


        }

        @Test
        public void givenStringShouldReturnNullMessage() {
            //Arrange
            //Act
            String result = check.checkForConsonantsOrVowel(" ");
            //Assert
            assertEquals(" ", result);
        }

        @Test
        public void givenStringShouldReturnErrorMessage() {
            //Arrange
            //Act
            String result = check.(" 5 ");
            //Assert
            assertEquals(" Digits are not allowed... ", result);


        }

    }
