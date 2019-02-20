package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void testInheritance() {
        Pet p = new Dog();
        Assert.assertTrue(p instanceof Pet);
    }

    @Test
    public void setNamePetTest() {
        // Given
        Pet pet = new Pet();
        String expected = "MyPet";

        // When
        pet.setName(expected);

        // Then
        String actual = pet.getName();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void dogSpeakTest(){
        // Given
        Pet pet = new Dog();
        String expected = "Bark!";

        // When
        String actual = pet.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catSpeakTest(){
        // Given
        Pet pet = new Cat();
        String expected = "Meow!";

        // When
        String actual = pet.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }
}
