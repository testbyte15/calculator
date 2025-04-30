package calculator.window;

import calculator.versions.CalculatorVersionFactory;
import calculator.versions.v1.CalculatorController;
import calculator.versions.v1.CalculatorVersionOneFactory;
import calculator.versions.v1.CalculatorView;
import calculator.versions.v1.operations.CalculatorModel;
import calculator.window.menu.BarMenu;
import calculator.window.menu.commands.ClickItemMenuVersionOne;
import calculator.window.menu.commands.ClickItemMenuVersionTwo;
import calculator.window.menu.items.VersionMenu;

import javax.swing.*;

public class Window {
    private final JFrame frame;
    private final BarMenu barMenu;

    public Window() {
        frame = SingletonFrame.getInstance().getFrame();
        barMenu = new BarMenu();
    }

    public void show(){
        frame.setVisible(true);
    }

    public void setDefaultCalculatorVersion(){
        new CalculatorVersionOneFactory().createController();
    };

    public void setupMenuBar(){
        barMenu.setBarMenu();
    }

    public void setupVersionMenu(){
        barMenu.setMenu(new VersionMenu());
        barMenu.addItemToMenu("v1", new ClickItemMenuVersionOne());
        barMenu.addItemToMenu("v2", new ClickItemMenuVersionTwo());
    }

    public void setDefaultWindowParameters(){
        frame.setSize(240, 320);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }
}
