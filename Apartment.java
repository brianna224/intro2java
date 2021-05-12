/******************************************************************************************************************
 * Apartment Buildings
 * ***************************************************************************************************************
 * This project is to create a program that will model apartment buildings and the apartments inside the building
 * Brianna Patrick
 * 04/22/21
 * 255 003
 ****************************************************************************************************************/

public class Apartment {
    /** the location number of apartment */
    private int locationNumber;

    /** the square footage of apartment */
    private double squareFootage;

    /** the price of apartment */
    private double price;

    /** the number of bedrooms in apartment */
    private Bedrooms bedrooms;

    /** the number of baths in apartment */
    private Baths baths;

    /** the status of the apartment */
    private Status status;

    /**
     * default constructor for apartment that calls the parameterized constructor
     */
    public Apartment() {
        this(1, 500.00, 400.00, Bedrooms.ONE_BEDROOM, Baths.ONE, Status.VACANT);
    }

    /**
     * Constructs an apartment with specified location number, square Footage, price, number of bedrooms, number of baths, and status
     */
    public Apartment(int locationNumber, double squareFootage, double price, Bedrooms bedrooms, Baths baths, Status status) {
        this.locationNumber = locationNumber;
        this.squareFootage = squareFootage;
        this.price = price;
        this.bedrooms = bedrooms;
        this.baths = baths;
        this.status = status;
    }

    /**
     * toString method will output the apartment info
     */
    public String toString() {
        String squareFootageString = String.format("%.2f", squareFootage);
        String priceString = String.format("%.2f", price);
        return "\n\t" + locationNumber + "\n\t" + squareFootageString +"\n\t" + priceString + "\n\t" + bedrooms + "\n\t" + baths + "\n\t" + status;
    }

    /**
     * the accessors and mutators for each attribute of apartment
     */
    public void setLocationNumber(int locationNumber) {
        this.locationNumber = locationNumber;
    }

    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBedrooms(Bedrooms bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setBaths(Baths baths) {
        this.baths = baths;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getLocationNumber() {
        return locationNumber;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public double getPrice() {
        return price;
    }

    public Bedrooms getBedrooms() {
        return bedrooms;
    }

    public Baths getBaths() {
        return baths;
    }

    public Status getStatus() {
        return status;
    }
}
