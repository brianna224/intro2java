package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**********************************************************************************************
 * Zodiac Sign
 **********************************************************************************************
 * Given a birth month and day, the application returns the zodiac sign for that month and day.
 *********************************************************************************************
 * Brianna Patrick
 * 255 003
 * 05/07/21
 **********************************************************************************************/


public class FindZodiac extends Application {
    /*************************************
     * Create a text area for the output *
     ************************************/
    TextArea outputMessage = new TextArea();

    public static void main(String[] args) {
        Application.launch(args);
    }

    /********************************************************************************************************
     * Create a keyboard shortcut for 'Calculate' button (users can press 'Enter' and the program will run) *
     ********************************************************************************************************/
    private void setGlobalEventHandler(VBox root, Button btn) {
        root.addEventHandler(KeyEvent.KEY_PRESSED, ev -> {
            if (ev.getCode() == KeyCode.ENTER) {
                btn.fire();
                ev.consume();
            }
        });
    }


    @Override
    public void start(Stage stage) {
        /*************************************
         * Create a text field for user input *
         * ***********************************/
        final TextField numInput = new TextField();
        numInput.setPromptText("Please input a valid day and month");

        /********************************
         * Set the size of the text area *
         * ******************************/
        outputMessage.setPromptText("Results");
        outputMessage.setPrefColumnCount(20);
        outputMessage.setPrefRowCount(10);

        /********************************
         * Create a 'Calculate' button   *
         * ******************************/
        Button ZodiacButton = new Button("Find Zodiac");
        // Add an EventHandler to the Button
        ZodiacButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

                /**********************************************************
                 * Sets up a loop that clears text field after user input *
                 **********************************************************/
                while (numInput.getText().length() > 0) {

                    /*************************************************************
                     * Initialize ZodiacSign object and set date with user input *
                     *************************************************************/
                    ZodiacSign zodiac = new ZodiacSign();


                    try {
                        int userInput = Integer.parseInt(numInput.getText());
                        zodiac.setDate(userInput);
                        String outputVal = zodiac.determineSign();
                        outputMessage.setText(outputVal);
                        }
                        catch (NumberFormatException ex) {
                        String errorStatement = "Error, you did not enter an integer with no space.\n";
                        outputMessage.setText(errorStatement);
                        }
                        finally {
                        numInput.setText("");
                    }
                }
            }
        });


        /***************************
         * Create a 'Reset' button  *
         * *************************/
        Button resetButton = new Button("Reset");

        resetButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                outputMessage.setText("");
            }
        });

        /*******************************
         * Create viewing window (root) *
         * *****************************/
        // Create window (VBox)
        VBox root = new VBox();
        // Add Labels, TextArea and TextField to the Window
        root.getChildren().addAll(new Label("Find your zodiac sign given your birth day and month:"), numInput, new Label("Your Zodiac Sign:"), outputMessage, ZodiacButton, resetButton);
        // Define size of window
        root.setMinSize(400, 200);
        // Set root to shortcut method
        setGlobalEventHandler(root, ZodiacButton);

        /**********************************
         * Configure window (root) design *
         *********************************/
        root.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: white;" +
                "-fx-background-color : #b0e0e6;");

        /********************
         * Create the Stage *
         *******************/
        Scene scene = new Scene(root);
        // Add the scene to the stage
        stage.setScene(scene);
        // Set the title of the Stage
        stage.setTitle("Zodiac Sign Finder");

        // Display the Stage
        stage.show();
    }
}