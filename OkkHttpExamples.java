package lesson6;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;

public class OkkHttpExamples {
    private static final String API_KEY="6ed59bf7-b699-4e67-9167-a64b1c89b069";
    private static final String PROTOKOL = "https";
    private static final String BASE_HOST = "api.weather.yandex.ru";
    private static final String API_V2 = "v2";
    private static final String FORECAST_ENDPOINT = "forecast";
    private  static  String terms="lat=59.9386300&lon=30.3141300&limit=1&extra=true";


    public static void main(String[] args) throws IOException {

        OkHttpClient okHttpClient = new OkHttpClient();
        ObjectMapper objectMapper = new ObjectMapper();

        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme (PROTOKOL)
                .host(BASE_HOST)
                .addPathSegment(API_V2)
                .addPathSegment(FORECAST_ENDPOINT)
                .query(terms)
                .build();

        System.out.println(httpUrl);

        Request request = new Request.Builder()
                .addHeader("X-Yandex-API-Key", API_KEY)
                .addHeader("accept", "application/json")
                .url(httpUrl)
                .build();

        Response response = okHttpClient.newCall(request).execute();
        String responseString = response.body().string();
        System.out.println(responseString);


        String localDate= objectMapper.readTree(responseString).at("/forecasts").get(0).at("/date").asText();
        String temperature = objectMapper.readTree(responseString).at("/forecasts").get(0).at("/parts/day/temp_avg").asText();
        String City=objectMapper.readTree(responseString).at("/geo_object/locality/name").asText();
        String weatherText=objectMapper.readTree(responseString).at("/fact/season").asText();
        System.out.println(localDate + "  температура воздуха в  городе  "+City +"  :  "+temperature+ "  градусов");



//        System.out.println("Код ответа:" + response.code());
//        System.out.println(response.headers());

    }
}
