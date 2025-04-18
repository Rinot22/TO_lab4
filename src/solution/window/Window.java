package solution.window;

import solution.constants.Constants;

import javax.swing.*;

public class Window implements Runnable {
    JFrame frame;
    Boundaries[][] bond;
    @Override
    public void run() {
        initFrame();
    }

    private void initFrame() {
        frame = new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("Symulacja");
    }

    private void initBoundaries() {
        bond = new Boundaries[Constants.WIDTH][Constants.HEIGHT];
    }
}
