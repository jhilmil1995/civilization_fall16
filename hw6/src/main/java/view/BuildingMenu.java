package view;

import controller.GameController;
import model.Building;
import model.Settlement;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;
//import view.GridFX;
/**
 * This class should represents the bulding menu
 */
public class BuildingMenu extends AbstractMenu {
    /**
    * there should be an invest and demolish button for this menu
    * as well as functions associated with the buttons
    */
    private Button investButton = new Button("Invest");
    private Button demolishButton = new Button("Demolish");
    public BuildingMenu() {
        //TODO
        investButton.setStyle("-fx-font: 30 arial; -fx-base: #ee2211;");
        demolishButton.setStyle("-fx-font: 30 arial; -fx-base: #ee2211;");
        investButton.setOnMousePressed(e -> {
                if (GameController.getCivilization().getTreasury().
                    getCoins() >= 25) {
                    ((Building) GameController.getLastClicked().getTile().
                        getOccupant()).invest();
                    GameController.getCivilization().getTreasury().spend(25);
                    String musicFilei = ("src/main/java/view/cash.wav");
                    Media soundi = new Media(new File(musicFilei).
                        toURI().toString());
                    MediaPlayer mediaPlayeri = new MediaPlayer(soundi);
                    mediaPlayeri.play();
                    //Alert newAlert = new Alert(Alert.AlertType.INFORMATION);
                    //newAlert.setHeaderText("Building upgraded!");
                    //newAlert.setTitle("Investing sucessful");
                    //newAlert.showAndWait();
                } else {
                    Alert newAlert = new Alert(Alert.AlertType.INFORMATION);
                    newAlert.setHeaderText("Your funds are insufficient "
                        + "to invest!");
                    newAlert.setTitle("Investing failed");
                    newAlert.showAndWait();
                }
                GameController.updateResourcesBar();
                GridFX.update();
            });
        addMenuItem(investButton);

        demolishButton.setOnMousePressed(e -> {
                //GameController.moving();
                if (GameController.getLastClicked().getTile().getOccupant()
                    instanceof Settlement && GameController.getCivilization().
                    getNumSettlements() <= 1) {
                    Alert newAlert = new Alert(Alert.AlertType.INFORMATION);
                    newAlert.setHeaderText("You cannot demolish your last "
                        + "settlement!");
                    newAlert.setTitle("Building can not be demolished");
                    newAlert.showAndWait();
                } else if (GameController.getLastClicked().getTile().
                    getOccupant().getOwner() == GameController.
                    getCivilization()) {
                    ((Building) GameController.getLastClicked().getTile().
                    getOccupant()).demolish();
                    GameController.getLastClicked().getTile().setOccupant(null);
                    GameController.getCivilization().decrementNumSettlements();
                    //Alert newAlert = new Alert(Alert.AlertType.INFORMATION);
                    //newAlert.setHeaderText("Building demolished for "
                    //    + "resources!");
                    //newAlert.setTitle("Building demolished");
                    //newAlert.showAndWait();
                    String musicFiled = ("src/main/java/view/demolish.wav");
                    Media soundd = new Media(new File(musicFiled)
                        .toURI().toString());
                    MediaPlayer mediaPlayerd = new MediaPlayer(soundd);
                    mediaPlayerd.play();
                }
                GameController.updateResourcesBar();
                GridFX.update();
            });
        addMenuItem(demolishButton);
    }
}
