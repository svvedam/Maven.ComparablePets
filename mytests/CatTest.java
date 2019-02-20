package io.zipcoder;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {
    @Test
    public void catSpeakTest() {
        //Given
        Cat myCat = new Cat();

        //When
        String actual = myCat.speak();

        //Then
        String expected = "Meow!";
        assertEquals(expected,actual);
    }
}