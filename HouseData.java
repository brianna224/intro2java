/*********************************************************************
 * HouseData
 * *******************************************************************
 * This program will perform analysis on certain houses
 * Brianna Patrick
 * 03/18/21
 * 255 003
 **********************************************************************/

import javax.swing.*;
import java.util.Scanner;

public class HouseData {
    public static void main(String[] args) {
        /**********************************************************************************************
         * declare, create, and initialize the arrays locations, sqFtValues,priceValues, distanceValues
         **********************************************************************************************/
        String[] locations = {"304 Oak Ave", "209 Main Dr", "27 River St", "65 Park Pl", "21 Yew Rd", "52 Franklin Dr", "100 Baltic Ave", "200 Maple Dr"};
        double[] sqFtValues = {2634.23, 2434.67, 2790.53, 5893.12, 3490, 2355.78, 7900, 4356.54};
        double[] priceValues = {90456.78, 345678.23, 892274.90, 804392.43, 784211.47, 823757.02, 1453897.44, 342190.65};
        double[] distanceValues = {6.4, 7.3, 1.9, 7.9, 1.2, 3.9, 7.5, 10.7};
        /********************************************************
         * call the method calcAvg and print the result returned
         ******************************************************/
        System.out.printf("The average square footage is: %.2f%n", calcAvg(sqFtValues));

        /*******************************************************
         * call the method calcAvg and print the result returned
         ******************************************************/
        System.out.printf("The average assessed price is: %.2f%n", calcAvg(priceValues));

        /***********************************************************
         * call the method findHighest and print the result returned
         **********************************************************/
        System.out.printf("The highest assessed price is: %.2f%n", findHighest(priceValues));

        /************************************************************
         * call the method findLowest and print the result returned
         **********************************************************/
        System.out.printf("The lowest distance is: %.2f%n", findLowest(distanceValues));

        /******************************************************************
         * call the method findHighestValues and print the result returned
         *****************************************************************/
        String[] locations1 = findHighestValues(locations, sqFtValues);
        System.out.printf("The highest three square footage houses are:%n    %s\t%n    %s\t%n    %s\t%n", locations1[0], locations1[1], locations1[2]);

        /*****************************************************************
         * call the method findLowestValues and print the result returned
         ****************************************************************/
        String[] locations2 = findLowestValues(locations, distanceValues);
        System.out.printf("The lowest three distances are:%n    %s%n    %s%n    %s%n", locations2[0], locations2[1], locations2[2]);

        /***************************************************************************
         * prompt user to enter an address and call the method verifyHouseLocation
         **************************************************************************/
        System.out.println("Enter the address:");
        Scanner input = new Scanner(System.in);
        String searchLocation = input.nextLine();
        boolean value = verifyHouseLocation(locations, searchLocation);

        /******************************************************************************************************************
         * if method returns true then print to user that the house is in the array. else print that house is not in array.
         *****************************************************************************************************************/
        if (value = true) {
            System.out.println(searchLocation + " is a house in the array.");
        }
        else if (value = false) {
            System.out.println(searchLocation + " is not a house in the array.");
        }
    }

    /*******************************************************************************
     * the method calcAvg passes in an array of values and returns the average
     *******************************************************************************/
    public static double calcAvg(double[] values) {
        double sum = 0;
        double average = 0;
        for (double e : values)
        {
            sum = sum + e;
        }
        return average = sum / values.length;
    }

    /****************************************************************************************************
     * the method findHighest passes in an array of values and returns the highest double assessed price
     **************************************************************************************************/
    public static double findHighest(double[] values) {
        double highest = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > highest)
                highest = values[i];
        }
        return highest;
    }

    /****************************************************************************************************
     * the method findLowest passes in an array of values and returns the lowest double distance value
     **************************************************************************************************/
    public static double findLowest(double[] values) {
        double lowest = values[0];
        for (int i = 1; i < values.length; i++) {
            if(values[i] < lowest)
                lowest = values[i];
        }
        return lowest;
    }

    /****************************************************************************************************
     * the method findHighestValues passes in an array of string locations and array of double values
     * and returns a string array containing the three locations associated with the highest double assessed prices
     **************************************************************************************************/
    public static String[] findHighestValues(String[] locations, double[] values) {
        String[] locations1 = {" ", " ", " "};
        double max1 = 0.0;
        double max2 = 0.0;
        double max3 = 0.0;
        for (int k = 0; k < values.length; k++) {
                if (values[k] > max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = values[k];
                    locations1[0] = locations[k];
                }
                else if (values[k] > max2) {
                    max3 = max2;
                    max2 = values[k];
                    locations1[1] = locations[k];
                }
                else if (values[k] > max3) {
                    max3 = values[k];
                    locations1[2] = locations[k];
                }
            }
        return locations1;
    }

    /***********************************************************************************************************
     *  the method findLowestValues passes in an array of string locations and array of double values
     *  and returns a string array containing the three locations associated with the lowest double distances
     ************************************************************************************************************/
    public static String[] findLowestValues(String[] locations, double[] values) {
        String[] locations2 = {" ", " ", " "};

        double min1 = values[0];
        double min2 = values[0];
        double min3 = values[0];
        int k = 0;
        for (k = 0; k < values.length; k++) {
            if (values[k] < min1) {
                min3 = min2;
                min2 = min1;
                min1 = values[k];
            }
            else if (values[k] < min2) {
                min3 = min2;
                min2 = values[k];
            }
            else if (values[k] < min3) {
                min3 = values[k];
            }
        }
        for (k = 0; k < values.length; k++) {
            if (values[k] == min1)
                locations2[0] = locations[k];
            else if (values[k] == min2)
                locations2[1] = locations[k];
            else if (values[k] == min3)
                locations2[2] = locations[k];
            }
        return locations2;
    }

    /********************************************************************************************************
     * the method verifyHouseLocation passes in an array of string locations and a string named searchLocation
     * and returns true or false based on whether or not searchLocation is found
     ********************************************************************************************************/
    public static boolean verifyHouseLocation(String[] locations, String searchLocation) {
        boolean value = false;
        for (String e : locations) {
            if (searchLocation.equals(e))
                return true;
            else
                return false;
        }
        return value;
    }
}
