package calculator.window;

import calculator.mvc.versions.v1.ControllerV1;
import calculator.mvc.versions.v1.ModelV1;
import calculator.mvc.versions.v1.ViewV1;
import calculator.window.menu.BarMenu;
import calculator.window.menu.commands.ClickItemMenuVersionOne;
import calculator.window.menu.commands.ClickItemMenuVersionThree;
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
        new ControllerV1(new ModelV1(), new ViewV1());
    };

    public void setupMenuBar(){
        barMenu.setBarMenu();
    }

    public void setupVersionMenu(){
        barMenu.setMenu(new VersionMenu());
        barMenu.addItemToMenu("v1", new ClickItemMenuVersionOne());
        barMenu.addItemToMenu("v2", new ClickItemMenuVersionTwo());
        barMenu.addItemToMenu("v3", new ClickItemMenuVersionThree());
    }

    public void setDefaultWindowParameters(){
        frame.setSize(240, 320);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }
}
