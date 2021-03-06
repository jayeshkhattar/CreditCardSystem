/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Card;

import Business.CardType.CardType;
import Business.Customer.Customer;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author achintyasingh
 */
public class CardDirectory {
    
    private ArrayList<Card> cardDirectory;
    
    public CardDirectory() {
        cardDirectory = new ArrayList();
    }

    public ArrayList<Card> getCardDirectory() {
        return cardDirectory;
    }

    public void setCardDirectory(ArrayList<Card> bankDirectory) {
        this.cardDirectory = cardDirectory;
    }
    
    public Card newCard(String cardNumber, String expiryDate, String cardHolderName, String cvv, float creditLimit, int expenditure, int totalPointsEarned, int pointsRemaining, CardType cardType, Customer customer, String status, float creditAvailable) {
        Card card = new Card(cardNumber, expiryDate, cardHolderName, cvv, creditLimit, expenditure, totalPointsEarned, pointsRemaining, cardType, customer, status, creditAvailable);
        cardDirectory.add(card);
        return card;
    }
    
    public void removeCard(Card card) {
        cardDirectory.remove(card);
    }
    
    public Card getCard(String cardNumber) {
        for(Card c : cardDirectory) {
            if(c.getCardNumber().equals(cardNumber))
                return c;
        }
        return null;
    }

    
}
