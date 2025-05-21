package calculator.mvc.versions.v3;

import calculator.mvc.versions.v3.models.CalculateExpressionFromTheResultField;
import calculator.mvc.versions.v3.models.CleanSymbolsFromTheResultField;
import calculator.mvc.versions.v3.models.PrintSymbolToTheResultField;

import javax.swing.*;

public class ControllerV3 {
    private ViewV3 view;

    public ControllerV3(ViewV3 view) {
        this.view = view;

        view.getButtons();
        for(JButton button : view.getButtons()){
            if(button.getText().equals("=")){
//                System.out.println(view.getResultField().getText());
//                System.out.println((new Expression(view.getResultField().getText())).calculate());
//                view.getResultField().setText(model.setExpression(view.getResultField().getText()).evaluateExpression());
                button.addActionListener(new CalculateExpressionFromTheResultField(view.getResultField()));
            }else if(button.getText().equals("C")){
                button.addActionListener(new CleanSymbolsFromTheResultField(view.getResultField()));
            }else{
                button.addActionListener(new PrintSymbolToTheResultField(view.getResultField()));
            }
        }
    }
}
