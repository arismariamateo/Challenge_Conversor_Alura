
package com.conversor_alura.api;
import java.io.IOException;

import okhttp3.*;
import org.json.JSONObject;

/**
 * @version 1.0  
 * @author Aris Mateo
 * Clase ConexiónApi para conectar a la api "apilayer" y retorna el Object JSON a recibirValores().
 **/

public class ConexionApi {
        
        OkHttpClient client = new OkHttpClient();

        public JSONObject run(String url) throws IOException {
        Request request = new Request.Builder()
            .url(url)
            .addHeader("apikey", "kInX0Gmls6YLJhxO2LcNEJ7Y020OAFKX")
            .build();

        try (Response response = client.newCall(request).execute()) {            
             
            JSONObject dataJson =new JSONObject(response.body().string());
            return dataJson;
        }
   }
}

/* https://apilayer.com/marketplace/exchangerates_data-api?txn=free&live_demo=show
 * 
 * 
 * clave api kInX0Gmls6YLJhxO2LcNEJ7Y020OAFKX
import java.io.*;
import okhttp3.*;

public class main {
  public static void main(String []args) throws IOException{
    OkHttpClient client = new OkHttpClient().newBuilder().build();

    Request request = new Request.Builder()
      .url("https://api.apilayer.com/exchangerates_data/convert?to=to&from=from&amount=amount")
      .addHeader("apikey", "kInX0Gmls6YLJhxO2LcNEJ7Y020OAFKX")
      .method("GET", })
      .build();
    Response response = client.newCall(request).execute();
    System.out.println(response.body().string());
  }
}
*/

