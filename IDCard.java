/********************************************************************************************
 * Brianna Patrick
 * Lab12
 * This program models an ID Card
 * 04/14/21
 * 255 003
 *******************************************************************************************/

package Labs.Lab12;

public class IDCard extends Card {
    /** The id number of IDCard */
    private int idNumber;

    /**
     * default constructor for IDCard that calls the parameterized constructor
     */
    public IDCard() {
        this("Jane Smith", 0);
    }

    /**
     * Constructs an IDCard with specified name and id number
     */
    public IDCard(String name, int idNumber) {
        super(name);
        this.idNumber = idNumber;
    }

    /**
     *This method returns a string description of the Card Holder Name and ID Number
     */
    public String toString() {
        return super.toString() + " ID Number: " + idNumber;
    }
}
