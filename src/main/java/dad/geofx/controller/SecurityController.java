package dad.geofx.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class SecurityController implements Initializable {

    @FXML
    private CheckBox chackBoxTor;

    @FXML
    private CheckBox checkBoxCrawler;

    @FXML
    private CheckBox checkBoxProxy;

    @FXML
    private Label labelInfo;

    @FXML
    private Label labelPotentialThreat;

    @FXML
    private Label labelThreatLevel;

    @FXML
    private GridPane root;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	 public SecurityController() throws IOException {
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/SecurityView.fxml"));
			loader.setController(this);
			loader.load();
			}
		public GridPane getView() {
			return root;
		}
}
