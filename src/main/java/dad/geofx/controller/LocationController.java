package dad.geofx.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class LocationController implements Initializable {

	private StringProperty latitude = new SimpleStringProperty();
	private StringProperty longitude = new SimpleStringProperty();
	private StringProperty countryFlag = new SimpleStringProperty();
	private StringProperty city = new SimpleStringProperty();
	private StringProperty zip = new SimpleStringProperty();
	private StringProperty language = new SimpleStringProperty();
	private StringProperty timeZone = new SimpleStringProperty();
	private StringProperty callingCode = new SimpleStringProperty();
	private StringProperty currency = new SimpleStringProperty();
	private ObjectProperty<Image> flagImage = new SimpleObjectProperty<Image>();
    @FXML
    private ImageView imageFlag;

    @FXML
    private Label labelFlag;

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

		labelCallingCode.textProperty().bind(callingCode);
		labelCityState.textProperty().bind(city);
		labelCurrency.textProperty().bind(currency);
		labelFlag.textProperty().bind(countryFlag);
		labelLanguage.textProperty().bind(language);
		labelLatitude.textProperty().bind(latitude);
		labelLongitude.textProperty().bind(longitude);
		labelTimeZone.textProperty().bind(timeZone);
		labelZipCode.textProperty().bind(zip);
		imageFlag.imageProperty().bind(flagImage);
//		datos.addListener((o, ov, nv) -> onDatosChanged(o, ov, nv));

	}
	
	
//	private void onDatosChanged(ObservableValue<? extends Datos> o, Datos ov, Datos nv) {
//		if (ov != null) {
//			imageFlag.setImage(null);
//			labelFlag.setText(null);
//			labelCallingCode.setText(null);
//			labelCityState.setText(null);
//			labelCurrency.setText(null);
//			labelLatitude.setText(null);
//			labelLongitude.setText(null);
//			labelTimeZone.setText(null);
//			labelZipCode.setText(null);
//		}
//		if (nv != null) {
//		imageFlag.setImage(null);
//		labelFlag.setText(nv.getCountryName());
//		labelCallingCode.setText(nv.getRegionCode());
//		labelCityState.setText(nv.getCity());
//		labelCurrency.setText(nv.getCurrency().toString());
//		labelLanguage.setText(nv.getLocation().getLanguages().get(0).getName());
//		labelLatitude.setText(nv.getLatitude().toString());
//		labelLongitude.setText(nv.getLongitude().toString());
//		labelTimeZone.setText(nv.getTimeZone().toString());
//		labelZipCode.setText(nv.getZip());
//		}
//
//	}
		
	
    public LocationController() throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/LocationView.fxml"));
		loader.setController(this);
		loader.load();
		}
	public GridPane getView() {
		return root;
	}


	public final StringProperty latitudeProperty() {
		return this.latitude;
	}
	


	public final String getLatitude() {
		return this.latitudeProperty().get();
	}
	


	public final void setLatitude(final String latitude) {
		this.latitudeProperty().set(latitude);
	}
	


	public final StringProperty longitudeProperty() {
		return this.longitude;
	}
	


	public final String getLongitude() {
		return this.longitudeProperty().get();
	}
	


	public final void setLongitude(final String longitude) {
		this.longitudeProperty().set(longitude);
	}
	


	public final StringProperty countryFlagProperty() {
		return this.countryFlag;
	}
	


	public final String getCountryFlag() {
		return this.countryFlagProperty().get();
	}
	


	public final void setCountryFlag(final String countryFlag) {
		this.countryFlagProperty().set(countryFlag);
	}
	


	public final StringProperty cityProperty() {
		return this.city;
	}
	


	public final String getCity() {
		return this.cityProperty().get();
	}
	


	public final void setCity(final String city) {
		this.cityProperty().set(city);
	}
	


	public final StringProperty zipProperty() {
		return this.zip;
	}
	


	public final String getZip() {
		return this.zipProperty().get();
	}
	


	public final void setZip(final String zip) {
		this.zipProperty().set(zip);
	}
	


	public final StringProperty languageProperty() {
		return this.language;
	}
	


	public final String getLanguage() {
		return this.languageProperty().get();
	}
	


	public final void setLanguage(final String language) {
		this.languageProperty().set(language);
	}
	


	public final StringProperty timeZoneProperty() {
		return this.timeZone;
	}
	


	public final String getTimeZone() {
		return this.timeZoneProperty().get();
	}
	


	public final void setTimeZone(final String timeZone) {
		this.timeZoneProperty().set(timeZone);
	}
	


	public final StringProperty callingCodeProperty() {
		return this.callingCode;
	}
	


	public final String getCallingCode() {
		return this.callingCodeProperty().get();
	}
	


	public final void setCallingCode(final String callingCode) {
		this.callingCodeProperty().set(callingCode);
	}
	


	public final StringProperty currencyProperty() {
		return this.currency;
	}
	


	public final String getCurrency() {
		return this.currencyProperty().get();
	}
	


	public final void setCurrency(final String currency) {
		this.currencyProperty().set(currency);
	}
	


	public final ObjectProperty<Image> flagImageProperty() {
		return this.flagImage;
	}
	


	public final Image getFlagImage() {
		return this.flagImageProperty().get();
	}
	


	public final void setFlagImage(final Image flagImage) {
		this.flagImageProperty().set(flagImage);
	}
	
	
}
