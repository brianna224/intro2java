import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*********************************************************************************************************************
 * Art Analysis
 * ******************************************************************************************************************
 * This project is to create a program that will read in an input file containing artworks with info, process the data,
 * and write to an output file the information about the artworks.
 * Brianna Patrick
 * 05/07/21
 * 255 003
 ****************************************************************************************************************/

public class ArtAnalysis {
    public static void main(String[] args) {
        File inputFile = new File("");
        File outputFile = new File("");

        /*******************************************************************************************************
         * file paths for input and output files are read in as command line arguments
         * if no command line arguments are provided then prompt user to enter both the input and output files
         ********************************************************************************************************/
        if (args.length == 0) {
            System.out.println("Enter an input file");
            Scanner input = new Scanner(System.in);
            String inputFileName = input.next();
            inputFile = new File(inputFileName);

            System.out.println("Enter an output file");
            String outputFileName = input.next();
            outputFile = new File(outputFileName);

        } else if (args.length == 2) {
            inputFile = new File(args[0]);
            outputFile = new File(args[1]);

        }

        ArrayList<String> artworks = new ArrayList<String>();

        /****************************************************************************************
         * wrap the call to readFile in a try catch block.
         * If no exception is caught then the message input file correct will be printed to console.
         * If an exception is caught then incorrect input file will be printed to the console.
         **************************************************************************************/
        try {
            artworks = readFile(inputFile);
            System.out.println("Input file correct");
        } catch (FileNotFoundException ex) {
            System.out.println("Incorrect input filename");
        }

        /*******************************************************************************
         * call parseData method passing in an arraylist of strings containing artworks
         * and assign the return value to artObjects
         *******************************************************************************/
        ArrayList<Art> artObjects = new ArrayList<>();
        artObjects = parseData(artworks);

        /*****************************************************************
         * call calcValueAvg method passing in an arraylist of Art objects
         * and assign the return value to avgValue
         *****************************************************************/
        double avgValue = calcValueAvg(artObjects);

        /*****************************************************************
         * call findHighValue method passing in an arraylist of Art objects
         * and assign the return value to highValue
         *****************************************************************/
        double highValue = findHighValue(artObjects);

        /********************************************************************************************
         * call findHighestArtByValue method passing in an arraylist of Art objects and average value
         * then assign return value to array list of Art objects called highestArt
         ********************************************************************************************/
        ArrayList<Art> highestArt = findHighestArtByValue(artObjects, avgValue);

        /************************************************************************************************************
         * call findArt method passing in an arraylist of Art objects and a specific Art object to be found or not
         ************************************************************************************************************/
        boolean findArt = findArt(artObjects, artObjects.get(4));


        PrintWriter out = null;

        String outputMessage = "";

        /************************************************************************************
         * wrap the call to writeOutData methods in a try catch block.
         * if an exception is caught print to console that it is an incorrect output filename.
         * if no exception is caught print to console output file correct.
         ************************************************************************************/
        String outputMessage1 = "The average value is: ";
        String outputMessage2 = "The highest value is: ";
        String outputMessage3 = "The art above the average value are: ";
        String outputMessage4 = "Is David by Donatello in the data? ";

        try {
            out = new PrintWriter(outputFile);

            writeOutData(outputMessage1, avgValue, out);

            writeOutData(outputMessage2, highValue, out);

            writeOutData(outputMessage3 ,highestArt, out);

            writeOutData(outputMessage4, findArt, out);

            System.out.println("Output file correct");
        } catch (FileNotFoundException e) {
            System.out.println("Incorrect output filename");
        }
        finally {
            out.close();
        }

    }

    /*************************************************************
     * readFile method will read in the file passed in,
     * add the data to an array list of strings called artworks,
     * and return artworks
     * @param inputFile
     * @return
     * @throws FileNotFoundException
     ************************************************************/
    public static ArrayList<String> readFile(File inputFile) throws FileNotFoundException {
        ArrayList<String> artworks = new ArrayList<>();

        Scanner input = new Scanner(inputFile);

        while(input.hasNextLine()) {
            artworks.add(input.nextLine());
        }

        return artworks;

    }

    /****************************************************************************************************
     * parseData method will separate the array list of strings passed in and turn them into Art objects.
     * these art objects are then added to an array list called artObjects.
     * artObjects is returned.
     * @param lines
     * @return
     **********************************************************************************************/
    public static ArrayList<Art> parseData(ArrayList<String> lines) {

        String[] artworkArr = null;
        ArrayList<Art> artObjects = new ArrayList<Art>();
        Art artwork = new Art();

        for (int i = 0; i < lines.size(); i++) {
            artworkArr[i] = lines.split("\t");


        }
            for (int i = 0; i < artworkArr.length; i++) {
                artwork.setName(artworkArr[0]);

                artwork.setCreator(artworkArr[1]);

                double newValue = 0.0;
                try {
                    String value = artworkArr[2];

                    newValue = Double.parseDouble(value);

                    if ( newValue < 0) {
                        throw new IllegalArgumentException();
                    }

                    artwork.setValue(newValue);
                } catch(NumberFormatException ex) {
                    artwork.setValue(0.0);
                } catch(IllegalArgumentException e) {
                    artwork.setValue(0.0);
                }

                artwork.setLocation(artworkArr[3]);

                artObjects.add(artwork);

        }

        return artObjects;
    }

    /*********************************************************
     * calcValueAvg method will calculate the value average from
     * all the arraylist of Art objects passed in.
     * the average is returned.
     * @param artworks
     * @return
     ********************************************************/
    public static double calcValueAvg(ArrayList<Art> artworks) {

        double sum = 0.0;

        for (Art artwork : artworks) {

            sum += artwork.getValue();

        }
        return sum / artworks.size();
    }

    /****************************************************
     * findHighValue method finds the highest value from the
     * array list of Art objects passed in.
     * The highest value is returned.
     * @param artworks
     * @return
     */
    public static double findHighValue(ArrayList<Art> artworks) {

        double highValue = 0.0;

        for (Art artwork : artworks) {

            if(artwork.getValue() > highValue) {
                highValue = artwork.getValue();
            }

        }

        return highValue;
    }

    /**********************************************************************************
     * findHighestArtByValue method will find all the Art objects
     * containing values above the average value.
     * an array list of the art objects called artworksAboveAvg is returned.
     * @param artworks
     * @param avg
     * @return
     ***********************************************************************************/
    public static ArrayList<Art> findHighestArtByValue(ArrayList<Art> artworks, double avg) {

        ArrayList<Art> artworksAboveAvg = new ArrayList<>();

        for (Art artwork : artworks) {
            if(artwork.getValue() > avg) {
                artworksAboveAvg.add(artwork);
            }
        }

        return artworksAboveAvg;
    }

    /*****************************************************
     * findArt method will return true if the Art object
     * passed in is found in the array list passed in.
     * If the Art object is not found it will return false.
     * @param artworks
     * @param art
     * @return
     *****************************************************/
    public static boolean findArt(ArrayList<Art> artworks, Art art) {

        for (Art artwork : artworks) {
            if(artwork.equals(art) == true) {
                return true;
            }
        }
        return false;
    }

    /***************************************************************
     * writeOutData will write to the output file an output message
     * with the arraylist passed in.
     * @param outputMessage
     * @param artworks
     * @param out
     * @throws FileNotFoundException
     ****************************************************************/
    public static void writeOutData(String outputMessage, ArrayList<Art> artworks, PrintWriter out) throws FileNotFoundException {

        out.print(outputMessage);
        for (Art a: artworks) {
            out.print(a + " ");
        }
        out.println();
        out.println();

    }

    /*********************************************************************
     * writeOutData method will write to the output file an output message
     * with a double value that is passed in.
     * @param outputMessage
     * @param value
     * @param out
     * @throws FileNotFoundException
     ***********************************************************************/
    public static void writeOutData(String outputMessage, double value, PrintWriter out) throws FileNotFoundException {

        out.print(outputMessage);
        out.printf("%.2f%n%n", value);

    }

    /**********************************************************************
     * writeOutData method will write to the output file an output message
     * with a boolean value that is passed in.
     * @param outputMessage
     * @param value
     * @param out
     * @throws FileNotFoundException
     ***********************************************************************/
    public static void writeOutData(String outputMessage, boolean value, PrintWriter out)throws FileNotFoundException{

        out.println(outputMessage + value);
        out.println();

    }
}
