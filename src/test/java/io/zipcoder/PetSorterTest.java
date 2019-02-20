package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

public class PetSorterTest{

    @Test
    public void petSorterTest(){
        // given
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

        Pet[] petsToSort = {dog, cat, cow};
        Pet[] expected = {cow, cat, dog};
        PetSorter petSorter = new PetSorter(petsToSort);
        Comparator<Pet> comparator = (Comparator<Pet>) new NameComparator();

        // when
        Pet[] actual = petSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

}