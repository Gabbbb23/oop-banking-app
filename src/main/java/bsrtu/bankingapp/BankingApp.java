package bsrtu.bankingapp;
import javax.swing.JFrame;


public class BankingApp {


    
    public static void switchFrame(JFrame currentFrame, JFrame nextFrame) {
    if (currentFrame != null) {
        currentFrame.dispose();  
    }
    showFrame(nextFrame);      
}
    
    public static void showFrame(JFrame frame) {
        if (frame != null) {
            frame.setVisible(true);  
            frame.setLocationRelativeTo(null);
        }
    }
    
    public static void main(String[] args) {
        showFrame(new LoginPage());
    }
}
