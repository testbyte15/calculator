package calculator.window;

import javax.swing.*;

public class SingletonFrame {
    private static SingletonFrame instance;

    private final JFrame frame;
    private final JMenuBar menuBar;

    private SingletonFrame() {
        frame = new JFrame();
        menuBar = new JMenuBar();
    }

    public static synchronized SingletonFrame getInstance() {
        if (instance == null) {
            instance = new SingletonFrame();
        }
        return instance;
    }

    public JFrame getFrame() {
        return frame;
    }

    public JMenuBar getMenuBar() {return menuBar;}
}
