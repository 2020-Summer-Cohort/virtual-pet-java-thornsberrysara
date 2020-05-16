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
                            ". To keep them happy, you must try to keep their food, thirst, and boredom level " +
                            "above 60, but less than 100.");



        int select;

        do {
            System.out.println("What would you like to do with " + petName + "?");
            System.out.println("Press [1] to feed " + petName + ".");
            System.out.println("Press [2] to quench " + petName + "'s thirst.");
            System.out.println("Press [3] to play with " + petName + ".");
            System.out.println("Press [0] to break " + petName + "'s heart and exit the game.");

            //In the do/while loop, add the pet's current status to the [1]-[4].

            select = input.nextInt();

            if (select == 1) {
                System.out.println("Thank you for the delicious meal!");
                int hunger = virtualPet.getHunger();
                int addHunger = 15;
                virtualPet.setHunger(hunger + 15);
                System.out.println("Hunger: " + hunger);
                    if (virtualPet.getHunger() > 100) {
                        System.out.println("Whoa, my belly hurts. I can't eat another bite.");
                        continue;

                    }
            }
            else if (select == 2) {
                System.out.println("Thank you for my drink!");
                int thirst = virtualPet.getThirst();
                int addThirst = 10;
                virtualPet.setThirst(thirst + 10);
                System.out.println("Thirst: " + thirst);
                    if (virtualPet.getThirst() > 100) {
                        System.out.println("You're gonna make me have an accident!");
                        continue;
                    }
            }
            else if (select == 3) {
                System.out.println("Yay! I love to play!");
                int boredom = virtualPet.getBoredom();
                int addBoredom = 25;
                virtualPet.setBoredom(boredom + 25);
                System.out.println("Boredom: " + boredom);
                if (virtualPet.getBoredom() > 100) {
                    System.out.println("Too...tired...to play. I need a good Emu nap!");
                    continue;
                }
            }
            else if (select == 0) {
                System.out.println("You're leaving already? See you soon!");
                return;
            }

            } while (select != 0);


        virtualPet.tick();

    }



}
