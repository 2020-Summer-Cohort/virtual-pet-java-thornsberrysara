package virtual_pet;

import java.util.Random;

public class VirtualPet {

    public String name;
    public int hunger;
    public int thirst;
    public int boredom;
    public int tiredness;

    void petStatus() {
        System.out.println("Hunger: " + hunger);
        System.out.println("Thirst: " + thirst);
        System.out.println("Boredom: " + boredom);
        System.out.println("Tiredness: " + tiredness);
    }
    void checkHealth() {
        if (hunger > 100 || thirst > 100 || boredom > 100 || tiredness > 100) {
            System.out.println("I'm running away from home!");
            System.exit(0);
        }
    }

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


    public void feed() {
        hunger = hunger - 15;
        if (getHunger() < 0) {
            System.out.println("Whoa, my belly hurts. I can't eat another bite.");
        }
    }

    public void drink() {
        thirst = thirst - 10;
        if (getThirst() < 0) {
            System.out.println("You're gonna make me have an accident!");
        }
    }

    public void play() {
        boredom = boredom - 25;
        if (getBoredom() < 0) {
            System.out.println("Too...tired...to play. I need a good Emu nap!");
        }
    }

    public void sleep() {
        tiredness = tiredness - 30;
        if (getTiredness() < 0) {
            System.out.println("I'm ready to get up!");
        }
    }

    public void tick() {
        hunger = hunger + 7;
        thirst = thirst + 5;
        boredom = boredom + 4;
        tiredness = tiredness + 3;
    }
}


