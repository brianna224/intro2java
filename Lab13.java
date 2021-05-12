/********************************************************************************************
 * Brianna Patrick
 * Lab13
 * This program will read and write files.
 * 04/21/21
 * 255 003
 *******************************************************************************************/
package Labs.Lab13;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab13 {
    public static void main(String[] args) {
        try {

            File input = new File(args[0]);
            File output = new File(args[1]);

            processFile(input, output);
        }
        catch (FileNotFoundException ex) {
            System.out.println("Incorrect files");
        }
    }

    /* processFile method passes in an input and output file **/
    public static void processFile(File inputFile, File outputFile) throws FileNotFoundException {

        /* construct the Scanner and PrintWriter objects for reading and writing **/
        Scanner input = new Scanner(inputFile);
        PrintWriter out = new PrintWriter(outputFile);

        ArrayList<Team> teams = new ArrayList<Team>();

        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] tokens = line.split(",");
            int numGoals = Integer.parseInt(tokens[1]);
            double numShots = Double.parseDouble(tokens[2]);
            Team team = new Team(tokens[0], numGoals, numShots);
            teams.add(team);

        }

        /* determine the minimum number of goals scored by the teams **/
        int minNumGoals = teams.get(0).getNumGoals();
        int minNumGoalsIndex = -1;
        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).getNumGoals() < minNumGoals) {
                minNumGoals = teams.get(i).getNumGoals();
                minNumGoalsIndex = i;
            }
        }

        /* determine the maximum number of goals scored by the teams **/
        int maxNumGoals = teams.get(0).getNumGoals();
        int maxNumGoalsIndex = 0;
        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).getNumGoals() > maxNumGoals) {
                maxNumGoals = teams.get(i).getNumGoals();
                maxNumGoalsIndex = i;
            }
        }

        /* determine the average number of shots per game **/
        double avgShots = teams.get(0).getNumShots();
        double shotsSum = 0;
        for (int i = 0; i < teams.size(); i++) {
            shotsSum += teams.get(i).getNumShots();
        }
        avgShots = shotsSum / teams.size();

        /* write to output file the results **/
        out.println("Maximum goals Scored: " + teams.get(maxNumGoalsIndex).getName() + " " + teams.get(maxNumGoalsIndex).getNumGoals());
        out.println("Minimum goals Scored: " + teams.get(minNumGoalsIndex).getName() + " " + teams.get(minNumGoalsIndex).getNumGoals());
        out.printf("Average shots per game: %.3f", avgShots);
        out.close();
        input.close();
    }
}
