/********************************************************************************************
 * Brianna Patrick
 * Lab12
 * This program models a debit card
 * 04/14/21
 * 255 003
 *******************************************************************************************/

package Labs.Lab12;

public class DebitCard extends Card {
    /** The card number DebitCard */
    private int cardNumber;

    /** The pin number DebitCard */
    private int pin;

    /**
     * default constructor for DebitCard that calls the parameterized constructor
     */
    public DebitCard() {
        this("Jane Doe",00000000, 0);
    }

    /**
     * Constructs a DebitCard with specified cardNumber, pin, and name
     */
    public DebitCard(String name, int cardNumber, int pin) {
        super(name);
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    /**
     *This method returns a string description of the Card Holder Name and Card Number
     */
    public String toString() {
        return super.toString() + " Card Number: " + cardNumber;
    }
}
