    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package bsrtu.bankingapp;

    /**
     *
     * @author Temporary User
     */
    public abstract class PinAction {

        // Interface method to be overridden
        public abstract void onPinValidated();

        // Static nested class for Settings action
        public static class SettingsPinAction extends PinAction {
            @Override
            public void onPinValidated() {
                Settings settings = new Settings(); // Replace with your actual JFrame
                settings.setVisible(true);
                settings.setLocationRelativeTo(null); // Center the window
            }
        }

        // Static nested class for Login action
        public static class LoginPinAction extends PinAction {
            @Override
            public void onPinValidated() {
                AccountPage accountPage = new AccountPage(); // Replace with your actual JFrame
                accountPage.setVisible(true);
                accountPage.setLocationRelativeTo(null); // Center the window
            }
        }
    }


