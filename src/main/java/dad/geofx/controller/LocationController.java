package dad.geofx.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class LocationController implements Initializable {

    @FXML
    private ImageView ivFlag;

    @FXML
    private Label labeFlag;

    @FXML
    private Label labelCallingCode;

    @FXML
    private Label labelCityState;

    @FXML
    private Label labelCurrency;

    @FXML
    private Label labelLanguage;

    @FXML
    private Label labelLatitude;

    @FXML
    private Label labelLongitude;

    @FXML
    private Label labelTimeZone;

    @FXML
    private Label labelZipCode;

    @FXML
    private GridPane root;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}
    public LocationController() throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/LocationView.fxml"));
		loader.setController(this);
		loader.load();
		}
	public GridPane getView() {
		return root;
	}
	
}
