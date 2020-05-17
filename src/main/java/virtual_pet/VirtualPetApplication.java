package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Congratulations on your baby Emu! Please type in what you would like to name them.");
        String petName = input.nextLine();
        VirtualPet virtualPet = new VirtualPet(petName);

        System.out.println("Awww, " + petName + " is sooo cute!");
        System.out.println("It's super important for you to care for " + petName +
                "." + '\n' + "To keep them happy, you must try to keep all of their levels " +
                "above 50, but less than 100.");


        int select;
        virtualPet.petStatus();


        do {
            System.out.println("What would you like to do with " + petName + "?");
            System.out.println("Press [1] to feed " + petName + ".");
            System.out.println("Press [2] to quench " + petName + "'s thirst.");
            System.out.println("Press [3] to play with " + petName + ".");
            System.out.println("Press [4] to get some sleep.");
            System.out.println("Press [0] to break " + petName + "'s heart and exit the game.");

            select = input.nextInt();


            if (select == 1) {
                System.out.println("Thank you for the delicious meal!");
                int hunger = virtualPet.getHunger();
                int thirst = virtualPet.getThirst();
                virtualPet.setHunger(hunger + 15);
                virtualPet.setThirst(thirst - 5);
                if (virtualPet.getHunger() > 100) {
                    System.out.println("Whoa, my belly hurts. I can't eat another bite.");
                    continue;
                }
            } else if (select == 2) {
                System.out.println("Thank you for my drink!");
                int thirst = virtualPet.getThirst();
                int hunger = virtualPet.getHunger();
                virtualPet.setThirst(thirst + 10);
                virtualPet.setHunger(hunger - 3);
                if (virtualPet.getThirst() > 100) {
                    System.out.println("You're gonna make me have an accident!");
                    continue;
                }
            } else if (select == 3) {
                System.out.println("Yay! I love to play!");
                int boredom = virtualPet.getBoredom();
                int hunger = virtualPet.getHunger();
                int thirst = virtualPet.getThirst();
                virtualPet.setBoredom(boredom + 25);
                virtualPet.setHunger(hunger - 5);
                virtualPet.setThirst(thirst - 7);
                if (virtualPet.getBoredom() > 100) {
                    System.out.println("Too...tired...to play. I need a good Emu nap!");
                    continue;
                }
            } else if (select == 4) {
                System.out.println("I'm whooped...goodnight!");
                int tiredness = virtualPet.getTiredness();
                int boredom = virtualPet.getBoredom();
                virtualPet.setTiredness(tiredness + 30);
                virtualPet.setBoredom(boredom - 8);
                if (virtualPet.getTiredness() > 100) {
                    System.out.println("I'm ready to get up!");
                    continue;
                }
            } else if (select == 0) {
                System.out.println("You're leaving already? See you soon!");
                return;
            }

            virtualPet.petStatus();

        } while (select != 0);


    }
}
