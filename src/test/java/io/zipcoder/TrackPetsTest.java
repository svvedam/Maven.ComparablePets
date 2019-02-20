package io.zipcoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class TrackPetsTest extends Pet {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void addPet() {
        //Given
        Pet dog = new Dog();
        dog.setName("Peaches");
        TrackPets trackPets = new TrackPets();

        //When
        trackPets.addPet(dog);

        //Then
        trackPets.printPetList();
        Assert.assertEquals(String.format("Peaches:Bark!"),
                outContent.toString().trim());
    }

    @Test
    public void removePet() {
        //Given
        Pet dog = new Dog();
        dog.setName("Peaches");
        TrackPets trackPets = new TrackPets();
        trackPets.addPet(dog);
        int beforeCount = trackPets.petList.size();

        //When
        trackPets.removePet(dog);

        //Then
        int afterCount = trackPets.petList.size();

        Assert.assertEquals(0,afterCount);
    }

    @Test
    public void printPetList() {
        //Given
        Pet dog = new Dog();
        dog.setName("Peaches");
        Pet cat = new Cat();
        cat.setName("Kitty");
        Pet cow = new Cow();
        cow.setName("Daisy");
        TrackPets trackPets = new TrackPets();
        trackPets.addPet(dog);
        trackPets.addPet(cat);
        trackPets.addPet(cow);

        //When
        trackPets.printPetList();
        //Then
        Assert.assertEquals(String.format("Peaches:Bark!\n" +
                "Kitty:Meow!\n" +
                "Daisy:Moo!"), outContent.toString().trim());
    }
}