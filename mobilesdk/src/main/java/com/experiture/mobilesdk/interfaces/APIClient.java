package com.experiture.mobilesdk.interfaces;

import com.experiture.mobilesdk.utils.LibConstants;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {
    private static Retrofit retrofit = null;
    private static APIClient mInstance;

    public static Retrofit getClient() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();


        retrofit = new Retrofit.Builder()
                .baseUrl(LibConstants.BASE_URL.value().trim())
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

        return retrofit;
    }


    public static synchronized APIClient getInsance(){
        if(mInstance == null){
            mInstance = new APIClient();
        }
        return mInstance;
    }

    public APIInterface getApi(){
        if(retrofit==null){
            return getClient().create(APIInterface.class);
        }else {
            return retrofit.create(APIInterface.class);
        }
    }
}
