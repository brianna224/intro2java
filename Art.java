/*********************************************************************************************************************
 * Art Analysis
 * ******************************************************************************************************************
 * This project is to create a program that will read in an input file containing artworks with info, process the data,
 * and write to an output file the information about the artworks.
 * Brianna Patrick
 * 05/07/21
 * 255 003
 ****************************************************************************************************************/


public class Art {

    /**
     * name of the art
     */
    private String name;

    /**
     * creator of the art
     */
    private String creator;

    /**
     * value of the art
     */
    private double value;

    /**
     * location of the art
     */
    private String location;

    /**
     * default constructor for art that calls the parameterized constructor
     */
    public Art() {
        this(null, null, 0.0, null);
    }

    /**
     * Constructs an artwork with specified name, creator, value, and location
     */
    public Art(String name, String creator, double value, String location) {
        this.name = name;
        this.creator = creator;
        this.value = value;
        this.location = location;
    }

    /**
     * toString method will return the name, creator, value, and location of the art
     * @return
     */
    public String toString() {
        return String.format("%s %s %.2f %s", name, creator, value, location);
    }

    /**
     * equals method will return true or false depending on if the name and creator
     * is equal to the Art object's name and creator passed in
     * @param obj
     * @return
     */
    public boolean equals(Object obj) {
        if (obj instanceof Art) {

            Art a = (Art) obj;

            return name.equals(a.name) && creator.equals(a.creator);

        }
        return false;
    }

    /**
     * the accessors and mutators for each attribute of apartment
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreator() {
        return creator;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
