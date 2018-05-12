package api;

/**
 * Created by spindle on 12.05.2018.
 */

public class ApiService {


    public static ApiClient getService(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl ("http://www.theaudiodb.com/api/v1/json/{APIKEY}/")
                .build();

        return retrofit.create(ApiClient)
    }
}
