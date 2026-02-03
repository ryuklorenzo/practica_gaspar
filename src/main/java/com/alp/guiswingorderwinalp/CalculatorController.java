package com.alp.guiswingorderwinalp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML private TextField display;
    private double num1 = 0;
    private String operator = "";
    private boolean start = true;

    @FXML
    private void onNumberClick(ActionEvent event) {
        if (start) {
            display.setText("");
            start = false;
        }
        String value = ((Button)event.getSource()).getText();
        display.setText(display.getText() + value);
    }

    @FXML
    private void onOperatorClick(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();
        if (!"=".equals(value)) {
            if (!operator.isEmpty()) return;
            operator = value;
            num1 = Double.parseDouble(display.getText());
            display.setText("");
        }
    }

    @FXML
    private void onEqualClick() {
        if (operator.isEmpty()) return;
        double num2 = Double.parseDouble(display.getText());
        double result = 0;
        switch (operator) {
            case "+": result = num1 + num2; break;
            case "-": result = num1 - num2; break;
            case "*": result = num1 * num2; break;
            case "/": result = num2 != 0 ? num1 / num2 : 0; break;
        }
        display.setText(String.valueOf(result));
        operator = "";
        start = true;
    }

    @FXML
    private void onClearClick() {
        display.setText("");
        operator = "";
        start = true;
    }
}