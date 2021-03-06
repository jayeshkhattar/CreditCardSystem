/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BankEmployee;

import Business.Bank.Bank;
import java.util.ArrayList;

/**
 *
 * @author somnathsolaskar
 */
public class BankEmployeeDirectory {
    private ArrayList<BankEmployee> bankEmployeeDirectory;
    
    public BankEmployeeDirectory() {
        bankEmployeeDirectory = new ArrayList();
    }

    public ArrayList<BankEmployee> getBankEmployeeDirectory() {
        return bankEmployeeDirectory;
    }

    public void setBankEmployeeDirectory(ArrayList<BankEmployee> bankEmployeeDirectory) {
        this.bankEmployeeDirectory = bankEmployeeDirectory;
    }
    
    public BankEmployee newBankEmployee(String name, String address, String code, String phoneNumber, String role, Bank bank) {
        BankEmployee be = new BankEmployee(name, address, code, phoneNumber, role, bank);
        bankEmployeeDirectory.add(be);
        return be;
    }
    
    public void removeBankEmployee(BankEmployee be) {
        bankEmployeeDirectory.remove(be);
        
    }
    
    public BankEmployee getBankEmployee(String cpde){
        for(BankEmployee be: bankEmployeeDirectory){
            if(be.getCode().equalsIgnoreCase(cpde)){
                return be;
            }
        }
        return null;
    }
    
}
