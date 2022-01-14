package dad.geofx.api;

import dad.geofx.map.Example;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

interface GeoInterface {

	@GET("ip_api.php")
	public Call<Example> ipCheck(@Query("ip") String ip);
	
}
