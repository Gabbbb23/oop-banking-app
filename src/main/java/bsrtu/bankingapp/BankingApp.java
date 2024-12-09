package bsrtu.bankingapp;
import javax.swing.JFrame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import javax.swing.JOptionPane;

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
    
    private boolean isLoggedIn() throws IOException {
        URL resource = getClass().getClassLoader().getResource("userLoggedIn.csv");
        if (resource == null) {
            throw new IOException("CSV file not found");
        }
        File file = new File(resource.getFile());
        return !isCSVFileEmpty(file);
    }

    private boolean isCSVFileEmpty(File file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            return br.readLine() == null;
        }
    }
    
    public static void main(String[] args) {
        try{
            URL resource = BankingApp.class.getClassLoader().getResource("userLoggedIn.csv");
            if (resource == null) {
                throw new IOException("CSV file not found");
            }
            File file = new File(resource.getFile());

            boolean isEmpty;
            String value = null;
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line = br.readLine();
                isEmpty = line == null;
                if (!isEmpty) {
                    value = line;
                }
            }
            if(isEmpty){
                showFrame(new LoginPage());
            }
            else{
                showFrame(new EnterPin("EnterPINAfterClosing", value));
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JOptionPane.showMessageDialog(frame, "Welcome " + value + ". Enter your PIN");
                frame.dispose();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
