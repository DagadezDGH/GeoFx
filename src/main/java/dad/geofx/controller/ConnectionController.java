package dad.geofx.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class ConnectionController implements Initializable {

	private StringProperty ipAddress = new SimpleStringProperty();
	private StringProperty isp = new SimpleStringProperty();
	private StringProperty type = new SimpleStringProperty();
	private StringProperty asn = new SimpleStringProperty();
	private StringProperty hostname = new SimpleStringProperty();
    @FXML
    private Label labelASN;

    @FXML
    private Label labelHostname;

    @FXML
    private Label labelISP;

    @FXML
    private Label labelIpAddress;

    @FXML
    private Label labelType;

    @FXML
    private GridPane root;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		labelASN.textProperty().bind(asn);
		labelHostname.textProperty().bind(hostname);
		labelIpAddress.textProperty().bind(ipAddress);
		labelISP.textProperty().bind(isp);
		labelType.textProperty().bind(type);
		
	}
	 public ConnectionController() throws IOException {
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/ConnectionView.fxml"));
			loader.setController(this);
			loader.load();
			}
		public GridPane getView() {
			return root;
		}
		public final StringProperty ipAddressProperty() {
			return this.ipAddress;
		}
		
		public final String getIpAddress() {
			return this.ipAddressProperty().get();
		}
		
		public final void setIpAddress(final String ipAddress) {
			this.ipAddressProperty().set(ipAddress);
		}
		
		public final StringProperty ispProperty() {
			return this.isp;
		}
		
		public final String getIsp() {
			return this.ispProperty().get();
		}
		
		public final void setIsp(final String isp) {
			this.ispProperty().set(isp);
		}
		
		public final StringProperty typeProperty() {
			return this.type;
		}
		
		public final String getType() {
			return this.typeProperty().get();
		}
		
		public final void setType(final String type) {
			this.typeProperty().set(type);
		}
		
		public final StringProperty asnProperty() {
			return this.asn;
		}
		
		public final String getAsn() {
			return this.asnProperty().get();
		}
		
		public final void setAsn(final String asn) {
			this.asnProperty().set(asn);
		}
		
		public final StringProperty hostnameProperty() {
			return this.hostname;
		}
		
		public final String getHostname() {
			return this.hostnameProperty().get();
		}
		
		public final void setHostname(final String hostname) {
			this.hostnameProperty().set(hostname);
		}
		
}