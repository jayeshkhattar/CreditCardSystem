/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BankEmployeeWorkArea;

import Business.Bank.Bank;
import userinterface.SystemAdminWorkArea.*;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Bank.BankDirectory;
import Business.Card.CardDirectory;
import Business.CardType.CardTypeList;
import Business.Merchant.MerchantDirectory;
import Business.BankEmployee.BankEmployee;
import Business.BankEmployee.BankEmployeeDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import userinterface.CustomerWorkArea.ApplyCardJPanel;

/**
 *
 * @author somnathsolaskar
 */
public class BankEmployeeWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BankEmployeeWorkAreaJPanel
     */
     private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private CustomerDirectory customerDirectory;
    private BankDirectory bankDirectory;
    private CardTypeList cardTypeList;
    private MerchantDirectory merchantsDirectory;
    private CardDirectory cardDirectory;
    private UserAccount account;
    private Bank bank;
    private BankEmployee bankEmployee;
    private BankEmployeeDirectory bankEmployeeDirectory;
    private Customer customer;
    
    public BankEmployeeWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.account = account;
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.customerDirectory = ecosystem.getCustomerDirectory();
        this.cardTypeList = ecosystem.getCardTypeList();
        this.cardDirectory = ecosystem.getCardDirectory();
        this.bankEmployee = bankEmployee;
        this.bankEmployeeDirectory = ecosystem.getBankEmployeeDirectory();
        this.customer = customer;
        
        bank = ecosystem.getBankDirectory().getBank(account.getUsername());
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
        btnCustomer = new javax.swing.JButton();
        btnApplyCard = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(255, 255, 255));

        btnCustomer.setText("Manage Customer");
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        btnApplyCard.setText("Apply Card");
        btnApplyCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyCardActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/93634-2.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Welcome...!!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnApplyCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnApplyCard, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        // TODO add your handling code here:
        ManageCustomerBankEmployeeJPanel customer = new ManageCustomerBankEmployeeJPanel(userProcessContainer, account, ecosystem, customerDirectory, bank);
       userProcessContainer.add("CustomerManagement",customer);
       CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnApplyCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyCardActionPerformed
        // TODO add your handling code here:
        ApplyCardBankEmployeeJPanel applyCard = new ApplyCardBankEmployeeJPanel(userProcessContainer, account, ecosystem, cardTypeList, customer);
       userProcessContainer.add("BankManagement",applyCard);
       CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnApplyCardActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApplyCard;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
