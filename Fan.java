package Labs.Lab10;

/********************************************************************************************
 * Brianna Patrick
 * Lab10
 * 3/31/21
 *******************************************************************************************/

public class Fan {
    /** Constants that determine speed of fan are declared */
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    /** The speed of the fan */
    private int speed = SLOW;

    /** The status of the fan whether it is on or off */
    private boolean on = false;

    /** The radius of the fan */
    private double radius = 5;

    /** The color of the fan */
    private String color = "blue";

    /**
     * A no-arg constructor creates a default fan using this() constructor
     */
    public Fan() {
        this(SLOW, false, 5, "blue");
    }

    /**
     * Constructs a fan with specified speed, on, radius, and color and assigns values to the instance variables
     */
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    /**
     * This method will return a String description of the fan
     */
    public String toString() {
        if (on == true)
            return "fan is " + speed + ", " + color + ", and size " + radius;
        else
            return "fan is off";
    }

    /**
     * This setter will set speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * This getter will return speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * This setter will set radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * This getter will return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * This setter will set color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * This getter will return color
     */
    public String getColor() {
        return color;
    }

    /**
     * This getter will return the status of whether the fan is on or off
     */
    public boolean isOn() {
        return on;
    }

    /**
     * This setter will set the status of whether the fan is on or off
     */
    public void setOn(boolean on) {
        this.on = on;
    }

}
