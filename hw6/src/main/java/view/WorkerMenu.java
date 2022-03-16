package view;

import controller.GameController;
import model.Convertable;
//import model.MapObject;
//import model.TerrainTile;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;
//import model.Unit;
//import view.GridFX;

/**
 * Created by RuYiMarone on 11/11/2016.
 */
public class WorkerMenu extends AbstractMenu {
    /**
    * There should be a convert and move button
    * as well as the functions associated with those
    * buttons
    */
    private Button moveButton = new Button("Move");
    private Button convertButton = new Button("Convert");
    public WorkerMenu() {
        //TODO
        moveButton.setStyle("-fx-font: 30 arial; -fx-base: #ee2211;");
        convertButton.setStyle("-fx-font: 30 arial; -fx-base: #ee2211;");
        moveButton.setOnMousePressed(e -> {
                Alert newAlert = new Alert(Alert.AlertType.INFORMATION);
                newAlert.setHeaderText("Select tile to move to");
                newAlert.setTitle("Moving the unit");
                newAlert.showAndWait();
                GameController.moving();
                GameController.updateResourcesBar();
                GridFX.update();
            });

        convertButton.setOnAction(e -> {
                Convertable worker = (Convertable) GameController.
                    getLastClicked().getTile().getOccupant();
                if (worker.canConvert(GameController.getLastClicked().getTile().
                    getType())) {
                    GameController.getLastClicked().getTile().
                        setOccupant(worker.convert());
                    //Alert newAlert = new Alert(Alert.AlertType.INFORMATION);
                    //newAlert.setHeaderText("Building created!");
                    //newAlert.setTitle("Converting unit sucessful");
                    //newAlert.showAndWait();
                    String musicFiled = ("src/main/java/view/convert.wav");
                    Media soundd = new Media(new File(musicFiled)
                        .toURI().toString());
                    MediaPlayer mediaPlayerd = new MediaPlayer(soundd);
                    mediaPlayerd.play();
                } else {
                    Alert newAlert = new Alert(Alert.AlertType.INFORMATION);
                    newAlert.setHeaderText("The unit can't build there.");
                    newAlert.setTitle("Converting unit failed");
                    newAlert.showAndWait();
                }
                GameController.updateResourcesBar();
                GridFX.update();
            });
        addMenuItem(moveButton);
        addMenuItem(convertButton);
    }
}
