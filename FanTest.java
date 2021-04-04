package Labs.Lab10;

public class FanTest {
    /** Main method */
    public static void main(String[] args) {
        /** create first fan object */
        Fan myFan1 = new Fan(3, false, 10, "yellow");
        myFan1.setSpeed(3);
        myFan1.setRadius(10);
        myFan1.setOn(false);
        myFan1.setColor("yellow");

        /** invoke toString() method */
        System.out.println(myFan1.toString());

        /** create second fan object */
        Fan myFan2 = new Fan(2, true, 20, "blue");
        myFan2.setSpeed(2);
        myFan2.setRadius(20);
        myFan1.setOn(true);
        myFan2.setColor("blue");

        /** invoke toString() method */
        System.out.println(myFan2.toString());
    }
}
