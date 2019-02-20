package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CowTest {

    @Test
    public void speakTest() {
        // Given
        Cow cat = new Cow();
        String expected = "Moo!";

        // When
        String actual = cat.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
