package dad.geofx.api;


import java.util.concurrent.TimeUnit;

import com.google.gson.Gson;


import dad.geofx.map.Datos;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GeoService {

	private static final String BASE_URL = "https://ipapi.com/";


	private GeoInterface service;

	public GeoService() {

		ConnectionPool pool = new ConnectionPool(1, 5, TimeUnit.SECONDS);

		OkHttpClient client = new OkHttpClient.Builder().connectionPool(pool).build();

		Retrofit retrofit = new Retrofit.Builder()
							.baseUrl(BASE_URL).client(client)
							.addConverterFactory(GsonConverterFactory
							.create())
							.build();

		service = retrofit.create(GeoInterface.class);
	}

	public Datos ConnectionData(String ip) throws Exception {
		Response<Datos> response = service.ipCheck(ip).execute();
		assertResponse(response);
		Datos message = response.body();
		return message;

	}

	private void assertResponse(Response<?> response) throws Exception {
		if (!response.isSuccessful()) {
			Gson gson = new Gson();
			ErrorMessage error = gson.fromJson(response.errorBody().string(), ErrorMessage.class);
			throw new Exception(error.getError().getInfo());

		}

	}

}
