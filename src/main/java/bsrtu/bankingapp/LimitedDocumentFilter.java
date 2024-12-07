/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bsrtu.bankingapp;
import javax.swing.text.*;
/**
 *
 * @author Gab
 */

// This code helps limits the digits to enter for the number in SendMoney
public class LimitedDocumentFilter extends DocumentFilter {
    private final int limit;

    public LimitedDocumentFilter(int limit) {
        this.limit = limit;
    }

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        if (string == null) {
            return;
        }

        if (isNumeric(string) && (fb.getDocument().getLength() + string.length()) <= limit) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        if (text == null) {
            return;
        }

        if (isNumeric(text) && (fb.getDocument().getLength() + text.length() - length) <= limit) {
            super.replace(fb, offset, length, text, attrs);
        }
    }
    
    private boolean isNumeric(String text){
        return text.matches("\\d*");
    }
}
