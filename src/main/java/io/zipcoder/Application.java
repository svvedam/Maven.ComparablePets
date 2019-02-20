package io.zipcoder;
import io.zipcoder.IOConsole;


public class Application {
    public void start() {

        IOConsole ioConsole = new IOConsole();
        TrackPets trackPets = new TrackPets();

        Integer numberOfPets = ioConsole.getIntegerInput("Enter number of pets ");
        for(int i =0; i< numberOfPets;i++) {
            Integer type = ioConsole.getIntegerInput("Enter 1 for dog 2 for cat 3 for cow ");
            String name = ioConsole.getStringInput("What is the name? ");
            if (type == 1) {
                Pet pet = new Dog();
                pet.setName(name);
                trackPets.petList.add(pet);
            } else if (type == 2) {
                Pet pet = new Cat();
                pet.setName(name);
                trackPets.petList.add(pet);
            } else if (type == 3) {
                Pet pet = new Cow();
                pet.setName(name);
                trackPets.petList.add(pet);
            }
        }
        ioConsole.println("Printing list of pets : ");
        for(Pet p: trackPets.petList){
            ioConsole.println(p.name);
        }
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.start();
    }
}
