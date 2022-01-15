package dad.geofx.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class SecurityController implements Initializable {
	private BooleanProperty proxy = new SimpleBooleanProperty();
	private BooleanProperty tor = new SimpleBooleanProperty();
	private BooleanProperty crawler = new SimpleBooleanProperty();
	private StringProperty info = new SimpleStringProperty();
	private StringProperty threatLevel = new SimpleStringProperty();
	private StringProperty potentialThreat = new SimpleStringProperty();
    @FXML
    private CheckBox checkBoxTor;

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
		checkBoxTor.selectedProperty().bind(tor);
		checkBoxCrawler.selectedProperty().bind(crawler);
		checkBoxProxy.selectedProperty().bind(proxy);
		labelInfo.textProperty().bind(info);
		labelPotentialThreat.textProperty().bind(potentialThreat);
		labelThreatLevel.textProperty().bind(threatLevel);
		
	}
	 public SecurityController() throws IOException {
	    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/SecurityView.fxml"));
			loader.setController(this);
			loader.load();
			}
		public GridPane getView() {
			return root;
		}
		
		public final BooleanProperty proxyProperty() {
			return this.proxy;
		}
		
		public final boolean isProxy() {
			return this.proxyProperty().get();
		}
		
		public final void setProxy(final boolean proxy) {
			this.proxyProperty().set(proxy);
		}
		
		public final BooleanProperty torProperty() {
			return this.tor;
		}
		
		public final boolean isTor() {
			return this.torProperty().get();
		}
		
		public final void setTor(final boolean tor) {
			this.torProperty().set(tor);
		}
		
		public final BooleanProperty crawlerProperty() {
			return this.crawler;
		}
		
		public final boolean isCrawler() {
			return this.crawlerProperty().get();
		}
		
		public final void setCrawler(final boolean crawler) {
			this.crawlerProperty().set(crawler);
		}
		
		public final StringProperty infoProperty() {
			return this.info;
		}
		
		public final String getInfo() {
			return this.infoProperty().get();
		}
		
		public final void setInfo(final String info) {
			this.infoProperty().set(info);
		}
		
		public final StringProperty threatLevelProperty() {
			return this.threatLevel;
		}
		
		public final String getThreatLevel() {
			return this.threatLevelProperty().get();
		}
		
		public final void setThreatLevel(final String threatLevel) {
			this.threatLevelProperty().set(threatLevel);
		}
		
		public final StringProperty potentialThreatProperty() {
			return this.potentialThreat;
		}
		
		public final String getPotentialThreat() {
			return this.potentialThreatProperty().get();
		}
		
		public final void setPotentialThreat(final String potentialThreat) {
			this.potentialThreatProperty().set(potentialThreat);
		}
		
}
