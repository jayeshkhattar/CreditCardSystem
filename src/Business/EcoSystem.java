/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.CustomerDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;
import Business.Bank.BankDirectory;
import Business.Card.CardDirectory;
import Business.CardType.CardTypeList;
import Business.Merchant.MerchantDirectory;
import Business.Product.ProductDirectory;
import Business.Voucher.VoucherList;
import Business.BankEmployee.BankEmployeeDirectory;
import Business.MerchantEmployee.MerchantEmployeeDirectory;
import Business.Order.OrderHistory;
import Business.PaymentMethod.PaymentMethodDirectory;
import Business.Transaction.TransactionDirectory;

/**
 *
 * @author jayesh
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private CustomerDirectory customerDirectory;
    private BankDirectory bankDirectory;
    private CardTypeList cardTypeList;
    private MerchantDirectory merchantDirectory;
    private ProductDirectory productDirectory;
    private CardDirectory cardDirectory;
    private VoucherList voucherList;
    private BankEmployeeDirectory bankEmployeeDirectory;
    private MerchantEmployeeDirectory merchantEmployeeDirectory;
    private OrderHistory orderHistory;
    private PaymentMethodDirectory paymentMethodDirectory;
    private TransactionDirectory transactionDirectory;

    public EcoSystem() {
        super(null);
        customerDirectory = new CustomerDirectory();
        bankDirectory = new BankDirectory();
        cardTypeList = new CardTypeList();
        merchantDirectory = new MerchantDirectory();
        cardDirectory = new CardDirectory();
        productDirectory = new ProductDirectory();
        voucherList = new VoucherList();
        bankEmployeeDirectory = new BankEmployeeDirectory();
        orderHistory = new OrderHistory();
        paymentMethodDirectory = new PaymentMethodDirectory();
        transactionDirectory = new TransactionDirectory();
        merchantEmployeeDirectory = new MerchantEmployeeDirectory();
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

      public BankDirectory getBankDirectory() {
        return bankDirectory;
    }

    public void setBankDirectory(BankDirectory bankDirectory) {
        this.bankDirectory = bankDirectory;
    }

    public CardTypeList getCardTypeList() {
        return cardTypeList;
    }

    public void setCardTypeList(CardTypeList cardTypeList) {
        this.cardTypeList = cardTypeList;
    }
    
    

    public MerchantDirectory getMerchantDirectory() {
        return merchantDirectory;
    }

    public void setMerchantDirectory(MerchantDirectory merchantDirectory) {
        this.merchantDirectory = merchantDirectory;
    }
    
    public CardDirectory getCardDirectory() {
        return cardDirectory;
    }

    public void setCardDirectory(CardDirectory cardDirectory) {
        this.cardDirectory = cardDirectory;
    }

    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }

    public ProductDirectory getProductDirectory() {
        return productDirectory;
    }

    public void setProductDirectory(ProductDirectory productDirectory) {
        this.productDirectory = productDirectory;
    }
    
     public VoucherList getVoucherList() {
        return voucherList;
    }

    public void setVoucherList(VoucherList voucherList) {
        this.voucherList = voucherList;
    }
    
     public BankEmployeeDirectory getBankEmployeeDirectory() {
        return bankEmployeeDirectory;
    }

    public void setBankEmployeeDirectory(BankEmployeeDirectory bankEmployeeDirectory) {
        this.bankEmployeeDirectory = bankEmployeeDirectory;
    }

    public OrderHistory getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(OrderHistory orderHistory) {
        this.orderHistory = orderHistory;
    }
     public PaymentMethodDirectory getPaymentMethodDirectory() {
        return paymentMethodDirectory;
    }

    public void setPaymentMethodDirectory(PaymentMethodDirectory paymentMethodDirectory) {
        this.paymentMethodDirectory = paymentMethodDirectory;
    }
    public TransactionDirectory getTransactionDirectory() {
        return transactionDirectory;
    }

    public void setTransactionDirectory(TransactionDirectory transactionDirectory) {
        this.transactionDirectory = transactionDirectory;
    }
    
   
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public MerchantEmployeeDirectory getMerchantEmployeeDirectory() {
        return merchantEmployeeDirectory;
    }

    public void setMerchantEmployeeDirectory(MerchantEmployeeDirectory merchantEmployeeDirectory) {
        this.merchantEmployeeDirectory = merchantEmployeeDirectory;
    }

    
    public boolean checkIfUserIsUnique(String userName){
        //
       return false;
    }

    
}