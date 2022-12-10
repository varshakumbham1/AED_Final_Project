/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import model.DB4OUtil.DB4OUtil;
import javax.swing.JOptionPane;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.Organization;
import model.Person.DonorsDirectory;
import model.Users.Users;
import ui.Donor.DonorRegistrationJPanel;

/**
 *
 * @author varshareddykumbham
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private DonorsDirectory donorDirectory;
    public MainJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        logoutJPanel = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        loginContainer = new javax.swing.JPanel();
        loginJPanel = new javax.swing.JPanel();
        tfUsername = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnDonorRegisteration = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logoutJPanel.setBackground(new java.awt.Color(214, 235, 255));
        logoutJPanel.setMinimumSize(new java.awt.Dimension(100, 200));
        logoutJPanel.setPreferredSize(new java.awt.Dimension(250, 1080));
        logoutJPanel.setLayout(null);

        btnLogout.setBackground(new java.awt.Color(51, 51, 255));
        btnLogout.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        logoutJPanel.add(btnLogout);
        btnLogout.setBounds(10, 20, 80, 30);

        jLabel3.setPreferredSize(new java.awt.Dimension(100, 200));
        logoutJPanel.add(jLabel3);
        jLabel3.setBounds(0, 0, 100, 140);

        jSplitPane.setLeftComponent(logoutJPanel);

        loginContainer.setBackground(new java.awt.Color(255, 255, 255));
        loginContainer.setPreferredSize(new java.awt.Dimension(1670, 1080));
        loginContainer.setLayout(new java.awt.CardLayout());

        loginJPanel.setBackground(new java.awt.Color(214, 235, 255));
        loginJPanel.setMaximumSize(new java.awt.Dimension(1200, 800));
        loginJPanel.setPreferredSize(new java.awt.Dimension(1200, 800));
        loginJPanel.setLayout(null);

        tfUsername.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        tfUsername.setToolTipText("Enter your username");
        tfUsername.setCaretColor(new java.awt.Color(204, 204, 204));
        tfUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfUsernameKeyTyped(evt);
            }
        });
        loginJPanel.add(tfUsername);
        tfUsername.setBounds(360, 230, 280, 40);

        lblUsername.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(51, 110, 208));
        lblUsername.setText("Username:");
        loginJPanel.add(lblUsername);
        lblUsername.setBounds(260, 230, 90, 30);

        lblPassword.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(51, 110, 208));
        lblPassword.setText("Password:");
        loginJPanel.add(lblPassword);
        lblPassword.setBounds(260, 290, 90, 30);

        tfPassword.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        loginJPanel.add(tfPassword);
        tfPassword.setBounds(360, 290, 280, 40);

        btnLogin.setBackground(new java.awt.Color(51, 51, 255));
        btnLogin.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        loginJPanel.add(btnLogin);
        btnLogin.setBounds(410, 350, 170, 40);

        btnDonorRegisteration.setBackground(new java.awt.Color(255, 0, 51));
        btnDonorRegisteration.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnDonorRegisteration.setText("Want to become a Donor?");
        btnDonorRegisteration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonorRegisterationRegisterationActionPerformed(evt);
            }
        });
        loginJPanel.add(btnDonorRegisteration);
        btnDonorRegisteration.setBounds(600, 620, 250, 23);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFocusable(false);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        loginJPanel.add(jLabel1);
        jLabel1.setBounds(0, 0, 1030, 690);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 110, 208));
        jLabel2.setText("Blood Management System");
        loginJPanel.add(jLabel2);
        jLabel2.setBounds(270, 0, 690, 120);

        loginContainer.add(loginJPanel, "card2");

        jSplitPane.setRightComponent(loginContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1103, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        //btn_logout.setEnabled(false);
        //btn_donorRegisteration.setEnabled(true);
        //txtusername.setEnabled(true);
        //txtpassword.setEnabled(true);
        //btn_login.setEnabled(true);

        tfUsername.setText("");
        tfPassword.setText("");

        loginContainer.removeAll();
        loginContainer.add("jpanel2",loginJPanel);
        CardLayout layout=(CardLayout)loginContainer.getLayout();
        layout.next(loginContainer);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void tfUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsernameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameKeyTyped

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Get user name

        String userName = tfUsername.getText();
        // Get Password
        char[] passwordCharArray = tfPassword.getPassword();
        String password = String.valueOf(passwordCharArray);

        Users userAccount=system.getListOfUsers().authenticateUser(userName, password);

        Enterprise inEnterprise=null;
        Organization inOrganization=null;
        Network inNetwork=null;

        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Network network:system.getNetworkList()){
                System.out.println(network.getListOfEnterprises().getEnterpriseList());
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getListOfEnterprises().getEnterpriseList()){
                    System.out.println(enterprise);
                    userAccount=enterprise.getListOfUsers().authenticateUser(userName, password);
                    inNetwork=network;
                    if(userAccount==null){
                        //Step 3:check against each organization for each enterprise
                        for(Organization organization:enterprise.getLisOfOrganizations().getOrganizationList()){
                            userAccount=organization.getListOfUsers().authenticateUser(userName, password);
                            if(userAccount!=null){
                                inNetwork=network;
                                inEnterprise=enterprise;
                                inOrganization=organization;
                                break;
                            }
                        }
                    }
                    else{
                        inEnterprise=enterprise;
                        break;
                    }
                    if(inOrganization!=null){
                        break;
                    }
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }

        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            CardLayout layout=(CardLayout)loginContainer.getLayout();
            loginContainer.add("workArea",userAccount.getUserRole().createWorkArea(loginContainer, userAccount, inOrganization, inEnterprise, system, inNetwork, donorDirectory));
            layout.next(loginContainer);
        }

        btnLogout.setEnabled(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnDonorRegisterationRegisterationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonorRegisterationRegisterationActionPerformed

        DonorRegistrationJPanel donorWorkAreaJPanel = new DonorRegistrationJPanel(loginContainer, system, donorDirectory, dB4OUtil);
        loginContainer.add("donorWorkAreaJPanel", donorWorkAreaJPanel);
        CardLayout layout=(CardLayout)loginContainer.getLayout();
        layout.next(loginContainer);
    }//GEN-LAST:event_btnDonorRegisterationRegisterationActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDonorRegisteration;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel loginContainer;
    private javax.swing.JPanel loginJPanel;
    private javax.swing.JPanel logoutJPanel;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
