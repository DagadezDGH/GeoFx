package dad.geofx.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.geofx.api.GeoService;
import dad.geofx.map.Datos;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;


public class MainController implements Initializable {
	private GeoService geoservice = new GeoService();
	private LocationController locationController = new LocationController();
	private ConnectionController connectionController = new ConnectionController();
	private SecurityController securityController = new SecurityController();
	private StringProperty ip = new SimpleStringProperty();
	private ObjectProperty<Datos> datos = new SimpleObjectProperty<Datos>();
	
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
    	locationController.setCallingCode(geoservice.ConnectionData(ip.getValue()).getLocation().getCallingCode());
    	locationController.setCity(geoservice.ConnectionData(ip.getValue()).getCity().toString());
    	locationController.setCountryFlag(geoservice.ConnectionData(ip.getValue()).getCountryName());
    	locationController.setCurrency(geoservice.ConnectionData(ip.getValue()).getCurrency().getName());
    	locationController.setFlagImage(new Image("/images/flags/64x42/"+ geoservice.ConnectionData(ip.getValue()).getCountryCode().concat(".png")));
    	locationController.setLanguage(geoservice.ConnectionData(ip.getValue()).getLocation().getLanguages().get(0).getName());
    	locationController.setLatitude(geoservice.ConnectionData(ip.getValue()).getLatitude().toString());
    	locationController.setLongitude(geoservice.ConnectionData(ip.getValue()).getLongitude().toString());
    	locationController.setTimeZone(geoservice.ConnectionData(ip.getValue()).getTimeZone().getCode());
    	locationController.setZip(geoservice.ConnectionData(ip.getValue()).getZip().toString());
    	
    	connectionController.setAsn(geoservice.ConnectionData(ip.getValue()).getConnection().getAsn().toString());
    	connectionController.setHostname(geoservice.ConnectionData(ip.getValue()).getHostname());
    	connectionController.setIpAddress(geoservice.ConnectionData(ip.getValue()).getIp());
    	connectionController.setIsp(geoservice.ConnectionData(ip.getValue()).getConnection().getIsp());
    	connectionController.setType(geoservice.ConnectionData(ip.getValue()).getType());
    	
    	securityController.setCrawler(geoservice.ConnectionData(ip.getValue()).getSecurity().getIsCrawler());
    	securityController.setProxy(geoservice.ConnectionData(ip.getValue()).getSecurity().getIsProxy());
    	securityController.setThreatLevel(geoservice.ConnectionData(ip.getValue()).getSecurity().getThreatLevel());
    	securityController.setTor(geoservice.ConnectionData(ip.getValue()).getSecurity().getIsTor());
    	switch (geoservice.ConnectionData(ip.getValue()).getSecurity().getThreatLevel()) {
		case "low":
			securityController.setInfo("This IP is safe. No threats have been detected.");
			securityController.setPotentialThreat("No threats have been detected for this IP address.");
			break;
		
		case "high":
			securityController.setInfo("Definitive threats detected. This IP is unsafe.");
			securityController.setPotentialThreat(geoservice.ConnectionData(ip.getValue()).getSecurity().getThreatTypes().toString());
			break;
			
		default:
			
			break;
		}
    	System.out.println(geoservice.ConnectionData(ip.getValue()).getLongitude().toString());
    	
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
//		datos.addListener((o, ov, nv) -> onDatosChanged(o, ov, nv));

		ip.bind(textfieldIP.textProperty());
	}
//	private void onDatosChanged(ObservableValue<? extends Datos> o, Datos ov, Datos nv) {
//	if(nv !=null){
//		tabLocation.setContent(locationController.getView());
//		tabConnection.setContent(connectionController.getView());
//		tabSecurity.setContent(securityController.getView());
//	}
//	}
	public BorderPane getView() {
		return root;
	}
}
