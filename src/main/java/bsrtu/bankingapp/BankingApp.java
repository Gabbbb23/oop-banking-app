package bsrtu.bankingapp;
import javax.swing.JFrame;


public class BankingApp {


    
    public static void switchFrame(JFrame currentFrame, JFrame nextFrame) {
    if (currentFrame != null) {
        currentFrame.dispose();  // Close the current frame
    }
    showFrame(nextFrame);         // Show the next frame
}
    
    public static void showFrame(JFrame frame) {
        if (frame != null) {
            frame.setVisible(true);               // Make the frame visible
            frame.setLocationRelativeTo(null);   // Center the frame on the screen
        }
    }
    
    public static void main(String[] args) {
        showFrame(new LoginPage());
    }
}
