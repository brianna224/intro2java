/********************************************************************************************
 * Brianna Patrick
 * Lab13
 * This program models a Team with a name, goal count, and shot count.
 * 04/21/21
 * 255 003
 *******************************************************************************************/
package Labs.Lab13;

public class Team {

    /* the team's name, number of goals, and number of shots **/
    private String name;
    private int numGoals;
    private double numShots;

    /* default constructor for Team **/
    public Team() {
        this("", 0, 0);
    }

    /* constructs a Team with name, number of goals, and number of shots **/
    public Team(String name, int numGoals, double numShots) {
        this.name = name;
        this.numGoals = numGoals;
        this.numShots = numShots;
    }

    public double getNumShots() {
        return numShots;
    }

    public String getName() {
        return name;
    }

    public int getNumGoals() {
        return numGoals;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumGoals(int numGoals) {
        this.numGoals = numGoals;
    }

    public void setNumShots(double numShots) {
        this.numShots = numShots;
    }
}
