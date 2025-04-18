package solution.state.health;

import solution.person.Person;
import solution.state.IState;

public class Healthy implements IState {
    private final String state = "Healthy";

    @Override
    public void handle(Person person) {
        // TODO: Что-то связанное с состоянием
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public Healthy getCopy() {
        return new Healthy();
    }
}
