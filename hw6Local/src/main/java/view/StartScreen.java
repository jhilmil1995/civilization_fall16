package view;

//import model.Civilization;
////////////////////////////
import javafx.scene.layout.StackPane;
import javafx.scene.control.ListView;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.collections.FXCollections;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.control.SelectionMode;
//
//import javafx.application.Application;

/**
 * Created by Tian-Yo Yang on 11/11/2016.
 * This class represents the Start Screen for the Civ applicatios. This is the
 * layout that should be displayed upon running the Civ application.
 *
 * This class should have and display
 * 1. a background
 * 2. a list of Civilizations
 * 3. a Start button
 */
public class StartScreen extends StackPane {
//public class StartScreen extends Application {


    /**
    * constuctor of the start screen. Should set the background
    * image and display a list of civilizations and a start button
    */
    //public Civilization civilization;
    private final Button startButton;
    private final ListView<CivEnum> list;
    //private static Civilization playerCivilization;

    public StartScreen() {
        //TODO
        Image img = new Image("File:./src/main/java/view/civ_background.png");
        ImageView imgView = new ImageView(img);
        getChildren().add(imgView);

        GridPane gridPane = new GridPane();
        gridPane.setHgap(20);
        gridPane.setVgap(20);

        Label label = new Label("Select a Civilization to Begin");
        label.setFont(Font.font("Arial", 30));
        label.setTextFill(Color.web("#FF4500"));
        VBox vbox = new VBox(2);

        startButton = new Button("Start");

        list = new ListView<CivEnum>();
        list.setPrefWidth(200);
        list.setPrefHeight(150);
        ObservableList<CivEnum> items = FXCollections.observableArrayList(
            CivEnum.ANCIENT_EGYPT, CivEnum.QIN_DYNASTY, CivEnum.ROMAN_EMPIRE,
            CivEnum.INCAN_EMPIRE, CivEnum.GREEK_EMPIRE, CivEnum.HAN_DYNASTY);
        list.setItems(items);
        list.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        vbox.getChildren().addAll(label, getCivList(), getStartButton());
        gridPane.add(vbox, 25, 20);
        getChildren().add(gridPane);
    }

    /*public Civilization getCivilization() {
        return civilization;
    }
    */
    /*public void chooseCivilization(Civilization c) {
        playerCivilization = c;
    }*/

    /**
    * gets the start button
    * @return the start button
    */

    public Button getStartButton() {

        return startButton;
    }
    /**
    * return a ListView of CivEnums representing the list of
    * available civilizations to choose from
    * @return listview of CivEnum
    */

    public ListView<CivEnum> getCivList() {
        return list;
    }

}