/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bsrtu.bankingapp;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;

/**
 *
 * @author Gab
 */

public class PlaceholderFocusListener extends FocusAdapter {
    private final String placeholder;
    private final Color placeholderColor;
    private final Color textColor;

    public PlaceholderFocusListener(String placeholder, Color placeholderColor, Color textColor) {
        this.placeholder = placeholder;
        this.placeholderColor = placeholderColor;
        this.textColor = textColor;
    }

    @Override
    public void focusGained(FocusEvent e) {
        JTextField textField = (JTextField) e.getComponent();
        if (textField.getText().equals(placeholder)) {
            textField.setText("");
            textField.setForeground(textColor);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        JTextField textField = (JTextField) e.getComponent();
        if (textField.getText().isEmpty()) {
            textField.setText(placeholder);
            textField.setForeground(placeholderColor);
        }
    }
}