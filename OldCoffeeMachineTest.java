package CoffeeMachineProject;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class OldCoffeeMachineTest {


    @Test
    public void testFirstCoffeeType() {
        OldCoffeeMachine oldMachine = new OldCoffeeMachine();

        assertEquals("Coffee 1: Caramel", oldMachine.getFirstCoffeeType());
    }



    @Test
    void getSecondCoffeeType() {
        OldCoffeeMachine oldMachine2 = new OldCoffeeMachine();
        assertEquals("Coffee 2: French Vanilla", oldMachine2.getSecondCoffeeType());

    }
}