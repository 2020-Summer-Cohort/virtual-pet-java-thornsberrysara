package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static virtual_pet.VirtualPetApplication.petAction;

public class VirtualPetTest {
    VirtualPet virtualPet = new VirtualPet("Test Name");

    @Test
    public void press1ToIncreaseHunger() {
        int hungerBeforePetAction = virtualPet.getHunger();
        petAction(1, virtualPet);
        int hungerAfterPetAction = virtualPet.getHunger();
        assertEquals(hungerBeforePetAction, hungerAfterPetAction - 15);
    }

    @Test
    public void press2ToIncreaseThirst() {
        int thirstBeforePetAction = virtualPet.getThirst();
        petAction(2, virtualPet);
        int thirstAfterPetAction = virtualPet.getThirst();
        assertEquals(thirstBeforePetAction, thirstAfterPetAction - 10);
    }

    @Test
    public void press3ToIncreaseBoredom() {
        int boredomBeforePetAction = virtualPet.getBoredom();
        petAction(3, virtualPet);
        int boredomAfterPetAction = virtualPet.getBoredom();
        assertEquals(boredomBeforePetAction, boredomAfterPetAction - 25);
    }

    @Test
    public void press4ToIncreaseTiredness() {
        int tirednessBeforePetAction = virtualPet.getTiredness();
        petAction(4, virtualPet);
        int tirednessAfterPetAction = virtualPet.getTiredness();
        assertEquals(tirednessBeforePetAction, tirednessAfterPetAction - 30);
    }
}
