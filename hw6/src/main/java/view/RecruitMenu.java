package view;

import controller.GameController;
//import model.Civilization;
import model.Unit;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

//import view.GridFX;
/**
 * Created by RuYiMarone on 11/11/2016.
 */
public class RecruitMenu extends AbstractMenu {
    /**
    * recuit menu should have a list of worker/units
    * to choose from. There should also be a select button
    * and the function of the button should be implemented
    *here
    */
    private ListView<String> listUnits;
    private Button selectButton = new Button("Select");

    private Unit newUnit;
    //private static GameController playerController;
    private int settlementNum = 1;

    public RecruitMenu() {
        //TODO
        //Unit newUnit = null;
        selectButton.setStyle("-fx-font: 30 arial; -fx-base: #ee2211;");
        listUnits = new ListView<String>();
        listUnits.setPrefWidth(200);
        listUnits.setPrefHeight(300);
        ObservableList<String> items = FXCollections.observableArrayList(
            "Melee Unit", "Ranged Unit", "Hybrid Unit", "Siege Unit", "Settler",
            "Farmer", "Coal Miners", "Anglers", "Master Builders");
        listUnits.setItems(items);

        selectButton.setOnMouseClicked(e -> {
                String unit = listUnits.getSelectionModel().getSelectedItem().
                    toString();
                switch (unit) {
                case "Melee Unit":
                    newUnit = GameController.getCivilization().getMeleeUnit();
                    break;
                case "Ranged Unit":
                    newUnit = GameController.getCivilization().getRangedUnit();
                    break;
                case "Hybrid Unit":
                    newUnit = GameController.getCivilization().getHybridUnit();
                    break;
                case "Siege Unit":
                    newUnit = GameController.getCivilization().getSiegeUnit();
                    break;
                case "Settler":
                    newUnit = GameController.getCivilization().
                        getSettlerUnit("Settlement" + settlementNum++);
                    break;
                case "Farmer":
                    newUnit = GameController.getCivilization().getFarmerUnit();
                    break;
                case "Coal Miners":
                    newUnit = GameController.getCivilization().
                        getCoalMinerUnit();
                    break;
                case "Anglers":
                    newUnit = GameController.getCivilization().getAnglerUnit();
                    break;
                case "Master Builders":
                    newUnit = GameController.getCivilization().
                        getMasterBuilderUnit();
                    break;
                default:
                    break;
                }
                if (newUnit != null && newUnit.isAffordable()) {
                    newUnit.applyInitialCosts();
                    GameController.getLastClicked().getTile().
                        setOccupant(newUnit);
                    String musicFile = ("src/main/java/view/wobble.wav");
                    Media sound = new Media(new File(musicFile)
                        .toURI().toString());
                    MediaPlayer mediaPlayer = new MediaPlayer(sound);
                    mediaPlayer.play();
                } else {
                    Alert newAlert = new Alert(Alert.AlertType.INFORMATION);
                    newAlert.setHeaderText("You do not have enough resources");
                    newAlert.setTitle("Recruting Unit Unsucessful");
                    newAlert.showAndWait();
                }
                GameController.updateResourcesBar();
                GridFX.update();
                //GameController.getLastClicked().updateTileView();
            });

        addMenuItem(listUnits);
        addMenuItem(selectButton);
    }
}
