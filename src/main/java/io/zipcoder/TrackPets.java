package io.zipcoder;

import java.util.ArrayList;
import java.util.List;
import io.zipcoder.IOConsole;

public class TrackPets {
    List<Pet> petList = new ArrayList<Pet>();

    public void addPet(Pet pet) {
        petList.add(pet);
    }


    public void removePet(Pet pet) {
        petList.remove(pet);
    }

    public void printPetList(){
        IOConsole ioConsole = new IOConsole();
        for(Pet p: petList){
            ioConsole.println(p.getName() +":"+ p.speak());
        }

    }
}
