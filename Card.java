/********************************************************************************************
 * Brianna Patrick
 * Lab12
 * This program models a card
 * 04/14/21
 * 255 003
 *******************************************************************************************/

package Labs.Lab12;

public class Card {
    /** The name of the Card Holder */
    private String name;

    /**
     * default constructor for Card that calls the parameterized constructor
     */
    public Card() {
        this("");
    }

    /**
     * Constructs a card with specified name
     */
    public Card(String name) {
        this.name = name;
    }

    /**
     *This method returns a string description of the Card Holder Name
     */
    public String toString() {
        return "Card Holder: " + name;
    }
}
