package bsrtu.bankingapp;

import java.awt.Color;
import java.awt.Insets;


public class LoginPage extends javax.swing.JFrame {
    
    public LoginPage() {
        initComponents();
        Header.requestFocus();
        Password.setMargin(new Insets(25,50,25,50));
        Username.setMargin(new Insets(25,50,25,50));
        Password.setEchoChar((char) 0);
        this.setBackground(new Color(0,0,0,0));

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Border1 = new javax.swing.JPanel();
        Border2 = new javax.swing.JPanel();
        MainPanel = new javax.swing.JPanel();
        CreateLabel = new javax.swing.JLabel();
        LogIn = new javax.swing.JButton();
        Username = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        Create = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        Header1 = new javax.swing.JLabel();
        Header2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(320, 480));

        Border1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Border2.setBackground(new java.awt.Color(255, 255, 255));
        Border2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        MainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        CreateLabel.setFont(new java.awt.Font("Product Sans", 0, 13)); // NOI18N
        CreateLabel.setForeground(new java.awt.Color(0, 51, 153));
        CreateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CreateLabel.setText("Don't have an account? ");
        CreateLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateLabelMouseClicked(evt);
            }
        });

        LogIn.setBackground(new java.awt.Color(204, 255, 255));
        LogIn.setFont(new java.awt.Font("Product Sans", 0, 16)); // NOI18N
        LogIn.setForeground(new java.awt.Color(0, 51, 51));
        LogIn.setText("Log In");
        LogIn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogInMouseClicked(evt);
            }
        });
        LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInActionPerformed(evt);
            }
        });

        Username.setFont(new java.awt.Font("Product Sans", 0, 13)); // NOI18N
        Username.setForeground(new java.awt.Color(153, 153, 153));
        Username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Username.setText("Enter Username");
        Username.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Username.setMargin(new java.awt.Insets(2, 20, 2, 20));
        Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameFocusLost(evt);
            }
        });
        Username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsernameMouseClicked(evt);
            }
        });
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });

        Password.setFont(new java.awt.Font("Product Sans", 0, 13)); // NOI18N
        Password.setForeground(new java.awt.Color(153, 153, 153));
        Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Password.setText("Password");
        Password.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFocusLost(evt);
            }
        });

        Create.setFont(new java.awt.Font("Product Sans", 0, 13)); // NOI18N
        Create.setForeground(new java.awt.Color(0, 51, 153));
        Create.setText("Create one.");
        Create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CreateMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Username)
                    .addComponent(Password, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CreateLabel)
                        .addGap(1, 1, 1)
                        .addComponent(Create)
                        .addGap(59, 59, 59)))
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateLabel)
                    .addComponent(Create))
                .addContainerGap())
        );

        Exit.setBackground(new java.awt.Color(255, 204, 204));
        Exit.setFont(new java.awt.Font("Product Sans", 0, 14)); // NOI18N
        Exit.setForeground(new java.awt.Color(51, 0, 0));
        Exit.setText("Exit");
        Exit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Header.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Header.setForeground(new java.awt.Color(255, 242, 16));

        Header1.setBackground(new java.awt.Color(153, 153, 153));
        Header1.setFont(new java.awt.Font("Product Sans", 2, 15)); // NOI18N
        Header1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header1.setText("Banko Sentral ng");

        Header2.setBackground(new java.awt.Color(153, 153, 153));
        Header2.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        Header2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header2.setText("Rizal Technological Philippines");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Header2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(Header1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(Header1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Header2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout Border2Layout = new javax.swing.GroupLayout(Border2);
        Border2.setLayout(Border2Layout);
        Border2Layout.setHorizontalGroup(
            Border2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Border2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(Border2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Border2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Border2Layout.setVerticalGroup(
            Border2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Border2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout Border1Layout = new javax.swing.GroupLayout(Border1);
        Border1.setLayout(Border1Layout);
        Border1Layout.setHorizontalGroup(
            Border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Border1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Border2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Border1Layout.setVerticalGroup(
            Border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Border1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Border2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Border1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Border1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateLabelMouseClicked

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void UsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsernameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusGained
        // TODO add your handling code here:
        if(Username.getText().equals("Enter Username")){
            Username.setForeground(Color.black);
            Username.setText("");
        }
    }//GEN-LAST:event_UsernameFocusGained

    private void PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusGained
        // TODO add your handling code here:
        if (new String(Password.getPassword()).equals("Password") && Password.getEchoChar() != '\u2022'){
                Password.setText("");
                Password.setForeground(new java.awt.Color(0, 0, 0));
                Password.setEchoChar('\u2022');
            }
    }//GEN-LAST:event_PasswordFocusGained

    private void LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogInActionPerformed

    private void LogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInMouseClicked
        // TODO add your handling code here:
        AccountPage accountPage = new AccountPage();
            accountPage.setVisible(true);
            accountPage.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_LogInMouseClicked

    private void UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusLost
        // TODO add your handling code here:
        if (Username.getText().isEmpty()) {
            Username.setText("Enter Username");
            Username.setForeground(new java.awt.Color(153, 153, 153));
        }
    }//GEN-LAST:event_UsernameFocusLost

    private void PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusLost
        // TODO add your handling code here:
        if (Password.getPassword().length == 0 && Password.getEchoChar() == '\u2022'){
                Password.setText("Password");
                Password.setForeground(new java.awt.Color(153, 153, 153));
                Password.setEchoChar((char) 0);
            }
    }//GEN-LAST:event_PasswordFocusLost

    private void CreateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateMouseEntered
        
    }//GEN-LAST:event_CreateMouseEntered

    private void CreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateMouseClicked
        CreateAccount createAccount = new CreateAccount();
                createAccount.setVisible(true);
                createAccount.setLocationRelativeTo(null);
                
        dispose();
    }//GEN-LAST:event_CreateMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Border1;
    private javax.swing.JPanel Border2;
    private javax.swing.JLabel Create;
    private javax.swing.JLabel CreateLabel;
    private javax.swing.JButton Exit;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel Header1;
    private javax.swing.JLabel Header2;
    private javax.swing.JButton LogIn;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Username;
    // End of variables declaration//GEN-END:variables
}
