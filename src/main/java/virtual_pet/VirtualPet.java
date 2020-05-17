package virtual_pet;

import java.util.Random;

public class VirtualPet {

    void petStatus() {
        System.out.println("Hunger: " + hunger);
        System.out.println("Thirst: " + thirst);
        System.out.println("Boredom: " + boredom);
        System.out.println("Tiredness: " + tiredness);
    }

    public String name;
    public int hunger;
    public int thirst;
    public int boredom;
    public int tiredness;

    Random rand = new Random();

    public VirtualPet(String defaultName) {
        name = defaultName;
        hunger = rand.nextInt(80);
        thirst = rand.nextInt(80);
        boredom = rand.nextInt(80);
        tiredness = rand.nextInt(80);
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

    public int getTiredness() {
        return tiredness;
    }

    //Setter
    public void setName(String newName) {
        this.name = newName;
    }

    public void setHunger(int newHunger) {
        this.hunger = newHunger;
    }

    public void setThirst(int newThirst) {
        this.thirst = newThirst;
    }

    public void setBoredom(int newBoredom) {
        this.boredom = newBoredom;
    }

    public void setTiredness(int newTiredness) {
        this.tiredness = newTiredness;
    }

    public void tick() {
        hunger = hunger - 7;
        thirst = thirst - 9;
        boredom = boredom - 4;
        tiredness = tiredness - 3;
    }


}

