/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HealthOfficer;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Enterprise.EnterpriseDirectory;
import model.Network.Network;
import model.Organization.MedicalAwarnessCampaign;
import model.Organization.PoliciesFinance;
import model.Person.Donors;
import model.Users.Users;
import model.WorkQueue.EventWorkRequest;
import model.WorkQueue.WorkRequest;

/**
 *
 * @author Admin
 */
public class HealthOfficerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HealthOfficerJPanel
     */
    private Enterprise enterprise;
    private Users userAccount;
    private EnterpriseDirectory enterpriseDirectory;
    private JPanel userProcessContainer;
    private MedicalAwarnessCampaign awarnesscamp;
    private PoliciesFinance organization;
    private EcoSystem ecosystem;
    /**
     * Creates new form HealthOfficerJPanel
     */
    public HealthOfficerJPanel(JPanel userProcessContainer, Users account, PoliciesFinance organization, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
          this.userAccount=account;
          this.organization = organization;
          this.ecosystem = business;
      
          populateReqTbl();
          populate_list();
    }
    
    private void populate_list() {
        DefaultTableModel model = (DefaultTableModel) tbl_list_of_donors.getModel();
        
        model.setRowCount(0);
        for (Donors donr : ecosystem.getListOfDonors()){
            Object[] row = new Object[3];
            row[0] = donr.getDonorName();
            row[1] = donr.getContact();
            
            model.addRow(row);
        }
    }
    
    private void populateReqTbl() {
        DefaultTableModel model = (DefaultTableModel) tbl_list_of_events.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){

            if(request instanceof EventWorkRequest){
            Object[] row = new Object[7];
            row[0] = request;
            row[1] = ((EventWorkRequest) request).getEventVenue();
            row[2] = ((EventWorkRequest) request).getEventDate();
            row[3] =((EventWorkRequest) request).getEventTime();
            row[4] = ((EventWorkRequest) request).getAmount();
            row[5] = ((EventWorkRequest) request).getComment();
            row[6] = ((EventWorkRequest) request).getStatus();
            
            model.addRow(row);}
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_ngo_title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_list_of_events = new javax.swing.JTable();
        lbl_list_of_donors = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_list_of_donors = new javax.swing.JTable();
        btn_accept = new javax.swing.JButton();
        btn_decline = new javax.swing.JButton();

        lbl_ngo_title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_ngo_title.setForeground(new java.awt.Color(0, 183, 210));
        lbl_ngo_title.setText("Event Fund Requests ");

        tbl_list_of_events.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbl_list_of_events.setForeground(new java.awt.Color(153, 0, 0));
        tbl_list_of_events.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Venue", "Date", "Time", "Status", "Amount", "Comments"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_list_of_events.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tbl_list_of_events.setSelectionForeground(new java.awt.Color(255, 255, 51));
        jScrollPane1.setViewportView(tbl_list_of_events);

        lbl_list_of_donors.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_list_of_donors.setForeground(new java.awt.Color(0, 183, 210));
        lbl_list_of_donors.setText("List of Donors ");

        tbl_list_of_donors.setForeground(new java.awt.Color(153, 0, 0));
        tbl_list_of_donors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Donor Name", "Contact"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_list_of_donors.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tbl_list_of_donors.setSelectionForeground(new java.awt.Color(255, 255, 51));
        jScrollPane2.setViewportView(tbl_list_of_donors);

        btn_accept.setBackground(new java.awt.Color(0, 183, 210));
        btn_accept.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btn_accept.setForeground(new java.awt.Color(255, 255, 255));
        btn_accept.setText("ACCEPT");
        btn_accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acceptActionPerformed(evt);
            }
        });

        btn_decline.setBackground(new java.awt.Color(0, 183, 210));
        btn_decline.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        btn_decline.setForeground(new java.awt.Color(255, 255, 255));
        btn_decline.setText("DECLINE");
        btn_decline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_declineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_ngo_title, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(491, 491, 491))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(btn_accept, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btn_decline))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addComponent(lbl_list_of_donors, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbl_ngo_title)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_accept)
                    .addComponent(btn_decline))
                .addGap(32, 32, 32)
                .addComponent(lbl_list_of_donors)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acceptActionPerformed
        // TODO add your handling code here:

        int selectedRow = tbl_list_of_events.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"No row selected, please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        System.out.println(tbl_list_of_events.getValueAt(selectedRow, 0));
        EventWorkRequest ewr = (EventWorkRequest)tbl_list_of_events.getValueAt(selectedRow,0);
        ewr.setStatus("Approved");
        populateReqTbl();
    }//GEN-LAST:event_btn_acceptActionPerformed

    private void btn_declineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_declineActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbl_list_of_events.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        System.out.println(tbl_list_of_events.getValueAt(selectedRow, 0));
        EventWorkRequest ewr = (EventWorkRequest)tbl_list_of_events.getValueAt(selectedRow,0);
        ewr.setStatus("Declined");
        populateReqTbl();
    }//GEN-LAST:event_btn_declineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_accept;
    private javax.swing.JButton btn_decline;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_list_of_donors;
    private javax.swing.JLabel lbl_ngo_title;
    private javax.swing.JTable tbl_list_of_donors;
    private javax.swing.JTable tbl_list_of_events;
    // End of variables declaration//GEN-END:variables
}
