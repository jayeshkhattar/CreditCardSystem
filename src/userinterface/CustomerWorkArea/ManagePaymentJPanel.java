/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerWorkArea;

import Business.Card.Card;
import Business.PaymentMethod.PaymentMethod;
import Business.PaymentMethod.PaymentMethodDirectory;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;

import javax.swing.JPanel;
import Business.EcoSystem;
import Business.Organization;
import Business.Transaction.Transaction;
import Business.Transaction.TransactionDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author somnathsolaskar
 */
public class ManagePaymentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePaymentJPanel
     */
    
     private JPanel userProcessContainer; 
    private EcoSystem ecoSystem; 
    private CustomerDirectory customerDirectory;
    private PaymentMethodDirectory paymentMethodDirectory;
    private UserAccount account;
    private Customer customer;
    private Transaction transaction;
    private TransactionDirectory transactionDirectory;
    private ArrayList<String> paymentCardList;
    public ManagePaymentJPanel(JPanel userProcessContainer,  UserAccount account, EcoSystem ecoSystem, PaymentMethodDirectory paymentMethodDirectory, Customer customer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.account = account;
        this.paymentMethodDirectory = paymentMethodDirectory;
        this.customer = customer;
        this.transaction = transaction;
        this.transactionDirectory = transactionDirectory;
        paymentCardList = new ArrayList<String>();
         combo.removeAllItems();
            ArrayList<String> list = new ArrayList<String>();
        for (PaymentMethod payment: paymentMethodDirectory.getPaymentMethodDirectory()) {
            list.add(payment.getName());
        }
        ArrayList<String> unique = removeDuplicates(list);
        for (String item: unique) {
            
           combo.addItem(item);
        
        }
        
        
        ArrayList<String> payList = new ArrayList<String>();
        payList.add("Select");
        for(Card ct : ecoSystem.getCardDirectory().getCardDirectory()) {
            if(ct.getCardOwner() == customer && ct.getStatus().equals(Card.statusActive) == true) {
                paymentCardList.add(ct.getCardNumber());
                payList.add(ct.getCardType().getName()+"-"+ct.getCardType().getCardPlatinumType()+": "+ct.getCardNumber());
            }
        }
        String[] cardLstArray = new String[payList.size()];
        cardLstArray = payList.toArray(cardLstArray);
        combo2.setModel(new javax.swing.DefaultComboBoxModel(cardLstArray));
        
        populateTable();
    }
    
    public static <String> ArrayList<String> removeDuplicates(ArrayList<String> list)
    {
  
        Set<String> set = new LinkedHashSet<>();

        set.addAll(list);

        list.clear();

        list.addAll(set);
  
        return list;
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
        jLabel2 = new javax.swing.JLabel();
        amount1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransaction = new javax.swing.JTable();
        combo2 = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Payment");

        jLabel2.setText("Enter amount  :");

        jLabel3.setText("Card :");

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Payment gateway :");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        tblTransaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Gateway", "Method", "Amount", "Status"
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

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(amount1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnSubmit))))
                        .addContainerGap(62, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(amount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnSubmit))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(318, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if(amount1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, Organization.markedFields);
            return;
        }
        Card card;
          int selectedRow =  combo2.getSelectedIndex();
        
        if(selectedRow <= 0) {
            JOptionPane.showMessageDialog(null,"Please Select a payment method to continue", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else {
            String cardNum  = paymentCardList.get(selectedRow - 1);
            card = ecoSystem.getCardDirectory().getCard(cardNum);
        }
        System.out.println(ecoSystem.toString());
        ecoSystem.getTransactionDirectory().newTransaction(customer,Long.parseLong(amount1.getText()),card, combo.getSelectedItem().toString(),"In-progress");
       
        JOptionPane.showMessageDialog(null, "Payment in progress...");
        populateTable();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed
 
    public void populateTable() {
        DefaultTableModel cc = (DefaultTableModel) tblTransaction.getModel();
        cc.setRowCount(0);
       
           for(Transaction cardCompany : ecoSystem.getTransactionDirectory().getTransactionDirectory()){
               if(customer == cardCompany.getCustomer()){
                Object [] row = new Object[5];
                row[0] = cardCompany.getGateway();
                row[1] = cardCompany.getCard().getCardNumber();
                row[2] = cardCompany.getAmount();
                row[3] = cardCompany.getStatus();
                cc.addRow(row);
            }            
           }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount1;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTransaction;
    // End of variables declaration//GEN-END:variables
}
