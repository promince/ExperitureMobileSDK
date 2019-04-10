package com.experiture.mobilesdk.interfaces;

import com.experiture.mobilesdk.modals.ResponseLogin;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface APIInterface {
    /**** API call for user login****/
    @POST("rest/v1/json/authenticateUserRestNew")
    Call<ResponseLogin> userLogin(@Body RequestBody bodyJSONData);
}