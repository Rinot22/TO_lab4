package solution.window;

import solution.constants.Constants;

import javax.swing.*;

public class Boundaries extends JPanel {

    public Boundaries(int x, int y) {
        super();
        setBounds(x * Constants.SIZE, y * Constants.SIZE, Constants.SIZE, Constants.SIZE);
    }
}
