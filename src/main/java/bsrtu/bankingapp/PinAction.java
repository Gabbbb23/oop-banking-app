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
        
        public abstract void onPinValidated();

        public static class SettingsPinAction extends PinAction {
            @Override
            public void onPinValidated() {
                Settings settings = new Settings();
                settings.setVisible(true);
                settings.setLocationRelativeTo(null);
            }
        }

        public static class LoginPinAction extends PinAction {
            @Override
            public void onPinValidated() {
                AccountPage accountPage = new AccountPage();
                accountPage.setVisible(true);
                accountPage.setLocationRelativeTo(null);
            }
        }
    }


