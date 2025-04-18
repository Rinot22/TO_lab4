package solution.state;

import solution.person.Person;

public interface IState {
    void handle(Person person);
    String getState();
    IState getCopy();
}
