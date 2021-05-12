/********************************************************************************************
 * Brianna Patrick
 * Lab12
 * This program models a drivers license
 * 04/14/21
 * 255 003
 *******************************************************************************************/

package Labs.Lab12;

public class DriversLicense extends IDCard {
    /** The expiration year of DriversLicense */
    private int expirationYear;

    /** The enum expiration month of type Month of the DriversLicense */
    private Month expirationMonth;

    /**
     * default constructor for DriversLicense that calls the parameterized constructor
     */
    public DriversLicense() {
        this(1969, Month.JANUARY);
    }

    /**
     * Constructs a DriversLicense with specified expiration year and expiration month
     */
    public DriversLicense(int expirationYear, Month expirationMonth) {
        this.expirationYear = expirationYear;
        this.expirationMonth = expirationMonth;
    }

    /**
     * Constructs a DriversLicense with specified name, id number, expiration year, and expiration month
     */
    public DriversLicense(String name, int idNumber, int expirationYear, Month expirationMonth) {
        super(name, idNumber);
        this.expirationYear = expirationYear;
        this.expirationMonth = expirationMonth;
    }

    /**
     *This method returns a string description of the Card Holder Name, ID Number, expiration month and year
     */
    public String toString() {
        return super.toString() + " Expiration Month & Year: " + expirationMonth + " " + expirationYear;
    }
}
