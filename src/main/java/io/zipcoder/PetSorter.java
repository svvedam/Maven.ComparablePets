package io.zipcoder;

import java.util.*;

public class PetSorter {
    List<Pet> myPetList = new ArrayList<Pet>();

    private Comparator<Pet> comparator;

    public PetSorter(Pet[] pets) {
        this.myPetList = Arrays.asList(pets);
    }

    public Pet[] sort(Comparator<Pet> comparator) {
        this.comparator = comparator;
        Collections.sort(myPetList, comparator);
        Pet[] resultList = new Pet[myPetList.size()];
        resultList = myPetList.toArray(resultList);
        return resultList;
    }
}
