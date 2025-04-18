package solution.state.resistance;

import solution.person.Person;
import solution.state.IState;

public class Unstable implements IState {
    private String state = "Unstable";

    @Override
    public void handle(Person person) {
        //
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public IState getCopy() {
        return null;
    }
}
