package solution.state.health;

import solution.person.Person;
import solution.state.IState;

import java.util.Objects;

public class Unhealthy implements IState {
    private String state = "NotHealthy";

    @Override
    public void handle(Person person) {
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public Unhealthy getCopy() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unhealthy unhealthy = (Unhealthy) o;
        return Objects.equals(state, unhealthy.state);
    }
}
