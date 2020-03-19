package CoffeeMachineProject;

public class CoffeeTouchScreenAdapter implements CoffeeMachineInterface {

    OldCoffeeMachine oldCoffeeMachine;// = new OldCoffeeMachine();

    public CoffeeTouchScreenAdapter(OldCoffeeMachine theMachine){
        OldCoffeeMachine newMachine = new OldCoffeeMachine();
        this.oldCoffeeMachine = theMachine;

    }
    @Override
    public void chooseFirstSelection() {
        oldCoffeeMachine.getFirstCoffeeType();
    }

    @Override
    public void chooseSecondSelection() {
        oldCoffeeMachine.getSecondCoffeeType();
    }
}
