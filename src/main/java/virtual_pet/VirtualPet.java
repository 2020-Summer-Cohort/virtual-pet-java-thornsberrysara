package virtual_pet;

import java.util.Random;

public class VirtualPet {
    public String name;
    public int hunger;
    public int thirst;
    public int boredom;

    Random rand = new Random();

    public VirtualPet(String defaultName) {
        name = defaultName;
        hunger = rand.nextInt(100);
        thirst = rand.nextInt(100);
        boredom = rand.nextInt(100);
    }

    //Getter
    public String getName() {
        return name;
    }
    public int getHunger() {
        return hunger;
    }
    public int getThirst() {
        return thirst;
    }
    public int getBoredom() {
        return boredom;
    }

    //Setter
    public void setName(String newName) {
        this.name = newName;
    }
    public int setHunger(int newHunger) {
        this.hunger = newHunger;
        return newHunger;
    }
    public void setThirst(int newThirst) {
        this.thirst = newThirst;
    }
    public void setBoredom(int newBoredom) {
        this.boredom = newBoredom;
    }

    //Tick to loop the game
    public void tick() {
        hunger += 15;
        thirst += 15;
        boredom += 30;
    }


}

