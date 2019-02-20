package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void speakTest() {
        // Given
        Dog cat = new Dog();
        String expected = "Bark!";

        // When
        String actual = cat.speak();

        // Then
        Assert.assertEquals(expected, actual);

    }
}
