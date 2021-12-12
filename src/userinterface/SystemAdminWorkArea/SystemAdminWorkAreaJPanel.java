/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Bank.BankDirectory;
import Business.CardType.CardTypeList;
import Business.Merchant.MerchantDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author jayesh
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    CustomerDirectory customerDirectory;
    BankDirectory bankDirectory;
    CardTypeList cardCompanyDirectory;
    MerchantDirectory merchantsDirectory;
    
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.customerDirectory = ecosystem.getCustomerDirectory();
        this.cardCompanyDirectory = ecosystem.getCardTypeList();
        this.bankDirectory = ecosystem.getBankDirectory();
        this.merchantsDirectory = ecosystem.getMerchantDirectory();
        
        populateTree();
    }
    
    public void populateTree(){
        DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
        
       // Add the code for draw your system structure shown by JTree
       
        
        DefaultMutableTreeNode networks=new DefaultMutableTreeNode("System Admininstrator");
        DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);
        
        ArrayList<Customer> customerList=ecosystem.getCustomerDirectory().getCustomerDirectory();
        
        Customer customer;
        
        DefaultMutableTreeNode bankListNode = new DefaultMutableTreeNode("Bank");
        DefaultMutableTreeNode customerListNode = new DefaultMutableTreeNode("Person");
        DefaultMutableTreeNode cardCompanyListNode  = new DefaultMutableTreeNode("Card Company");
        //DefaultMutableTreeNode merchantListNode = new DefaultMutableTreeNode("Merchant");
        networks.insert(customerListNode, 0);
        networks.insert(bankListNode, 1);
        networks.insert(cardCompanyListNode, 2);
      //  networks.insert(merchantListNode, 3);
        
        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        
        for(int i=0;i<customerList.size();i++){
            customer=customerList.get(i);
            networkNode=new DefaultMutableTreeNode(customer.getName());
            customerListNode.insert(networkNode, i);
        }    

        model.reload();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSelectedNode = new javax.swing.JLabel();
        btnManageBank = new javax.swing.JButton();
        btnManageCardCompany = new javax.swing.JButton();
        btnManageMerchant = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setLayout(new java.awt.BorderLayout());

        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 118, Short.MAX_VALUE))
        );

        jSplitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Selected Node:");

        lblSelectedNode.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSelectedNode.setForeground(new java.awt.Color(0, 102, 204));

        btnManageBank.setText("Enterprise Manage Banks");
        btnManageBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageBankActionPerformed(evt);
            }
        });

        btnManageCardCompany.setText("Manage Card Types");
        btnManageCardCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCardCompanyActionPerformed(evt);
            }
        });

        btnManageMerchant.setText("Manage Merchants");
        btnManageMerchant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageMerchantActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/managerWork128x.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Card_Providers.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(lblSelectedNode))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(btnManageBank, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(jLabel2))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(btnManageCardCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(btnManageMerchant, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblSelectedNode))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageBank, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageCardCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(btnManageMerchant, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane.setRightComponent(jPanel2);

        add(jSplitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageBankActionPerformed
       ManageBankJPanel bank = new ManageBankJPanel(userProcessContainer, ecosystem, bankDirectory);
       userProcessContainer.add("BankManagement",bank);
       CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnManageBankActionPerformed

    private void btnManageCardCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCardCompanyActionPerformed
       ManageCardCompanyJPanel cardCompany = new ManageCardCompanyJPanel(userProcessContainer, ecosystem, cardCompanyDirectory);
       userProcessContainer.add("CardCompanyManagement",cardCompany);
       CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageCardCompanyActionPerformed

    private void btnManageMerchantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageMerchantActionPerformed
       ManageMerchantJPanel mer = new ManageMerchantJPanel(userProcessContainer, ecosystem, merchantsDirectory);
       userProcessContainer.add("MerchantManagement",mer);
       CardLayout layout=(CardLayout)userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageMerchantActionPerformed

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged
        
        DefaultMutableTreeNode selectedNode= (DefaultMutableTreeNode)jTree.getLastSelectedPathComponent();
        if(selectedNode!=null){
            lblSelectedNode.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_jTreeValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageBank;
    private javax.swing.JButton btnManageCardCompany;
    private javax.swing.JButton btnManageMerchant;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables
}
