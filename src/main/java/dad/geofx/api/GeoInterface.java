package dad.geofx.api;

import dad.geofx.map.Datos;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

interface GeoInterface {

	@GET("ip_api.php")
	public Call<Datos> ipCheck(@Query("ip") String ip);
	
}
