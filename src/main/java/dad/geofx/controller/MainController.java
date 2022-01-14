package dad.geofx.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.geofx.api.GeoService;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;


public class MainController implements Initializable {
	private GeoService geoservice = new GeoService();
	private LocationController locationController = new LocationController();
	private ConnectionController connectionController = new ConnectionController();
	private SecurityController securityController = new SecurityController();
	private StringProperty ip = new SimpleStringProperty();
    @FXML
    private Button buttonIP;

    @FXML
    private BorderPane root;

    @FXML
    private Tab tabConnection;

    @FXML
    private Tab tabLocation;

    @FXML
    private Tab tabSecurity;

    @FXML
    private TextField textfieldIP;

    @FXML
    void onCheckIPAction(ActionEvent event) throws Exception {
    	System.out.println(geoservice.ConnectionData(ip.getValue()).getHostname());
    }
    public MainController() throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
		loader.setController(this);
		loader.load();
		}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		tabLocation.setContent(locationController.getView());
		tabConnection.setContent(connectionController.getView());
		tabSecurity.setContent(securityController.getView());
		ip.bind(textfieldIP.textProperty());
	}
	public BorderPane getView() {
		return root;
	}
}
