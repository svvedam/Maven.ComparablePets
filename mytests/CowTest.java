package io.zipcoder;

import org.junit.Test;

import static org.junit.Assert.*;

public class CowTest extends Pet {
    @Test
    public void cowSpeakTest() {
        //Given
        Cow myCow = new Cow();

        //When
        String actual = myCow.speak();

        //Then
        String expected = "Moo!";
        assertEquals(expected,actual);
    }

}