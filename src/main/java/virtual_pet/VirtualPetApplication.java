package virtual_pet;

import java.util.Scanner;

<<<<<<< Updated upstream
=======
/*
 * I love the emu theme!!!  There is a couple things I would like to see improved in this app though.
 * Clean Code:
 * 1 - Remove the setter methods in the VirtualPet class and replace them with methods like feed() or drink().  This will
 *     allow you to put the logic of how the pets fields are changed back into the VirtualPet class and out of the
 *     VirtualPetApplication's petAction() method.
 * 2 - In the VirtualPet class you have a couple methods at the top of the class.  It's almost a universal practice to
 *     have the fields on the top of the class and the methods after the field declarations.  I would move those methods
 *     to comply with this practice.
 * Good job on the Working Software part, the only change I would ask for on how the app works is that when you feed or
 * take an action to meet a need that you consider what direction the attribute moves.  If you feed an emu his hunger
 * should probably go down and not up.  If you are up for changing that please do so, but the clean code is what we will
 * be looking to be addressed.
 */
>>>>>>> Stashed changes
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
                "as low as possible. If any of their levels go above 100, they will run away.");

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

            virtualPet.tick();
            virtualPet.checkHealth();
            petAction(select, virtualPet);
            virtualPet.petStatus();


        } while (select != 0);
    }

    public static void petAction(int select, VirtualPet virtualPet) {

        if (select == 1) {
            virtualPet.feed();
            System.out.println("Thank you for the delicious meal!");
        } else if (select == 2) {
            virtualPet.drink();
            System.out.println("Thank you for my drink!");
        } else if (select == 3) {
            virtualPet.play();
            System.out.println("Yay! I love to play!");
        } else if (select == 4) {
            virtualPet.sleep();
            System.out.println("I'm whooped...goodnight!");
        } else if (select == 0) {
            System.out.println("You're leaving already? See you soon!");
        }
    }
}

