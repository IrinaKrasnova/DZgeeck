package lesson6;

import java.io.IOException;

import okhttp3.*;

public class OkkHttpExamples {
    private static final String API_KEY="X-Yandex-API-Key:6ed59bf7-b699-4e67-9167-a64b1c89b069";
    private static final String PROTOKOL = "https";
    private static final String BASE_HOST = "api.weather.yandex.ru";
    private static final String API_V2 = "v2/forecast?";
    private  static  String terms="lat=59.9386300&lon=30.3141300&limit=5&extra=true";


    public static void main(String[] args) throws IOException {

        OkHttpClient okHttpClient = new OkHttpClient();
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme (PROTOKOL)
                .host(BASE_HOST)
                .addPathSegment(API_V2)
                .addPathSegment(terms)
                .addQueryParameter("apikey", API_KEY)
                .build();


        Request request = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(httpUrl)
                .build();

        Response response = okHttpClient.newCall(request).execute();
        String responseString = response.body().string();
        System.out.println(responseString);


        System.out.println("Код ответа:" + response.code());
        System.out.println(response.headers());

    }
}
