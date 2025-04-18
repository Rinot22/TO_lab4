package solution.state.symptoms;

import solution.person.Person;
import solution.state.IState;

public class NoSymptoms implements IState {
    private final String state = "NoSymptoms";
    private int counter = 0;

    public int getCounter() {
        return this.counter;
    }

    public int incrementCounter() {
        return this.counter++;
    }

    @Override
    public void handle(Person person) {
        // TODO: Что-то связанное с состоянием
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public NoSymptoms getCopy() {
        return null;
    }
}
