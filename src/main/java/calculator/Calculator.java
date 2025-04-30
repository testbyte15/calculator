package calculator;

import calculator.window.Window;
import calculator.window.menu.BarMenu;

public class Calculator {

    private final Window window;

    public Calculator() {
        window = new Window();
    }

    public void start() {
        window.setDefaultWindowParameters();
        window.setupMenuBar();
        window.setupVersionMenu();
        window.setDefaultCalculatorVersion();
        window.show();
    }
}
