/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PaymentMethodWorkArea;

import Business.Transaction.Transaction;
import Business.Transaction.TransactionDirectory;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import javax.swing.JPanel;
import Business.EcoSystem;
import Business.Organization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author somnathsolaskar
 */


public class ManageTransactionsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePaymentJPanel
     */
    
     private JPanel userProcessContainer; 
    private EcoSystem ecoSystem; 
    private Customer customer;
    private Transaction transaction;
    private TransactionDirectory transactionDirectory;
    public ManageTransactionsJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, TransactionDirectory transactionDirectory, Customer customer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.customer = customer;
        this.transaction = transaction;
        this.transactionDirectory= ecoSystem.getTransactionDirectory();
        populateTable();
    }

     public void populateTable() {
        DefaultTableModel cc = (DefaultTableModel) tblTransaction.getModel();
        cc.setRowCount(0);
      
           for(Transaction cardCompany : ecoSystem.getTransactionDirectory().getTransactionDirectory()){
               //if(customer == cardCompany.getCustomer()){
                Object [] row = new Object[4];
                row[0] = cardCompany;
                row[1] = cardCompany.getAmount();
                row[2] = cardCompany.getCard().getCardNumber();
                row[3] = cardCompany.getStatus();
                cc.addRow(row);
               }
          //  }            
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransaction = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnStatus = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Transaction Management");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 14, 839, 31));

        tblTransaction.setBackground(new java.awt.Color(204, 255, 204));
        tblTransaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer Name", "Amount", "Payment Method", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTransaction);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 147, 636, 216));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/93634-2.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 72, 68, 61));

        btnStatus.setBackground(new java.awt.Color(255, 255, 255));
        btnStatus.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnStatus.setText("Change Status");
        btnStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusActionPerformed(evt);
            }
        });
        add(btnStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 405, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusActionPerformed
        // TODO add your handling code here:
          int selectedRow = tblTransaction.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,Organization.selectRow, "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Transaction tra = (Transaction)tblTransaction.getValueAt(selectedRow,0);
        UpdateTransactionJPanel modifyStatus= new UpdateTransactionJPanel(userProcessContainer, ecoSystem, transactionDirectory, tra);
        userProcessContainer.add("UpdateTransactionJPanel",modifyStatus);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTransaction;
    // End of variables declaration//GEN-END:variables
}
