/***************************************************************************************************
 * Apartment Buildings
 * *************************************************************************************************
 * This project is to create a program that will model apartment buildings and the apartments inside the building
 * Brianna Patrick
 * 04/22/21
 * 255 003
 *************************************************************************************************/
import java.util.ArrayList;

public class Building {
    /**  location of the building */
    private String location;

    /**  the owner of the building */
    private String owner;

    /**  the contact phone for the building */
    private String contactPhone;

    /**  maximum number of units for the building */
    private int maxNumberOfUnits;

    /**  An ArrayList of apartments in the building */
    private ArrayList<Apartment> apartments = new ArrayList<Apartment>();

    /**
     * default constructor for building
     * Creates an empty array list in the apartments attribute
     */
    public Building() {
        this(null, null, null, 100);
        apartments = new ArrayList<Apartment>();
    }

    /**
     * constructs a building with specified location, owner, contact phone, and maximum number of units.
     * Creates an empty array list in the apartments attribute
     */
    public Building(String location, String owner, String contactPhone, int maxNumberOfUnits) {
        this.location = location;
        this.owner = owner;
        this.contactPhone = contactPhone;
        this.maxNumberOfUnits = maxNumberOfUnits;
        apartments = new ArrayList<Apartment>();
    }

    /**
     * addApartment method adds an Apartment object to the Building object's array list.
     */
    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    /**
     * getNumApartments method will return how many Apartment objects are associated with a Building object
     */
    public int getNumApartments() {
        return apartments.size();
    }

    /**
     * getApartments method will return the array list of Apartment objects
     */
    public ArrayList<Apartment> getApartments() {
        return apartments;
    }

    /**
     * toString method will output the apartment building info and the apartments associated with it
     */
    public String toString() {
        String description = "";

        for (Apartment a : apartments) {
            description += a.toString() + "\n";
        }
        
            
            
            return location + "\n" + owner + "\n" + contactPhone + "\n" + maxNumberOfUnits + "\n" + "Apartments:\n" + description;
    }

    /**
     * the accessors and mutators for each attribute of building
     */
    public void setLocation(String location) {
        this.location = location;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public void setMaxNumberOfUnits(int maxNumberOfUnits) {
        this.maxNumberOfUnits = maxNumberOfUnits;
    }

    public String getLocation() {
        return location;
    }

    public String getOwner() {
        return owner;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public int getMaxNumberOfUnits() {
        return maxNumberOfUnits;
    }
}
