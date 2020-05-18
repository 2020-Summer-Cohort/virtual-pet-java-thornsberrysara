package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("                                __\n" +
                "                               (oo)\n" +
                "                                \\/\n" +
                "                                ||\n" +
                "                                ||\n" +
                "                                ||,-v-,_\n" +
                "                                ||\\ |   /\n" +
                "                            _,'\"  \"'-,-<\n" +
                "                           / :       /  \\\n" +
                "                          ( :       (   /,\n" +
                "                           \\_;       \\ __)\n" +
                "                              \\,_ ,   |\n" +
                "                              |  / \\  |\n" +
                "                              | /   \\ |\n" +
                "                              ()     ()\n" +
                "                              //     ||\n" +
                "                             //      ||\n" +
                "                            //       ||\n" +
                "              -- '' -'-'  ,//        /\\   -- '' -'-'   miK\n" +
                "                          ^^         '^^\n");
        System.out.println("Congratulations on your baby Emu! Please type in what you would like to name them.");
        String petName = input.nextLine();
        VirtualPet virtualPet = new VirtualPet(petName);

        System.out.println("Awww, " + petName + " is sooo cute!");
        System.out.println("It's super important for you to care for " + petName +
                "." + '\n' + "To keep them happy, you must try to keep all of their levels " +
                "above 0, but less than 100.");

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

            petAction(select, virtualPet);
            virtualPet.tick();
            virtualPet.petStatus();
            virtualPet.checkHealth();

        } while (select != 0);
    }

    public static void petAction(int select, VirtualPet virtualPet) {

        if (select == 1) {
            System.out.println("Thank you for the delicious meal!");
            int hunger = virtualPet.getHunger();
            virtualPet.setHunger(hunger + 15);
            if (virtualPet.getHunger() > 100) {
                System.out.println("Whoa, my belly hurts. I can't eat another bite.");
            }
        } else if (select == 2) {
            System.out.println("Thank you for my drink!");
            int thirst = virtualPet.getThirst();
            virtualPet.setThirst(thirst + 10);
            if (virtualPet.getThirst() > 100) {
                System.out.println("You're gonna make me have an accident!");
            }
        } else if (select == 3) {
            System.out.println("Yay! I love to play!");
            int boredom = virtualPet.getBoredom();
            virtualPet.setBoredom(boredom + 25);
            if (virtualPet.getBoredom() > 100) {
                System.out.println("Too...tired...to play. I need a good Emu nap!");
            }
        } else if (select == 4) {
            System.out.println("I'm whooped...goodnight!");
            int tiredness = virtualPet.getTiredness();
            virtualPet.setTiredness(tiredness + 30);
            if (virtualPet.getTiredness() > 100) {
                System.out.println("I'm ready to get up!");
            }
        } else if (select == 0) {
            System.out.println("You're leaving already? See you soon!");
        }
    }
}
