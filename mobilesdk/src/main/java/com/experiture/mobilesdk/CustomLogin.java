package com.experiture.mobilesdk;

import android.content.Context;
import android.widget.Toast;

import com.experiture.mobilesdk.interfaces.APIClient;
import com.experiture.mobilesdk.interfaces.APIInterface;
import com.experiture.mobilesdk.modals.ResponseLogin;

import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CustomLogin {
    private OnLoginResponse mOnLoginResponse;
    private int retryCount = 0;

    public static CustomLogin getInstance(){
        return new CustomLogin();
    }

    public void login(String api_key, String user_id, String password, String device_id,
                      String device_token, String os_type, String app_id,
                      final OnLoginResponse listener){

        JSONObject paramBody = new JSONObject();
        try {
            paramBody.put("UserAPIKey", api_key);
            paramBody.put("AppId", app_id);
            paramBody.put("Userid", user_id);
            paramBody.put("Password", password);
            paramBody.put("DeviceId", device_id);
            paramBody.put("DeviceToken", device_token);
            paramBody.put("OSType", os_type);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"),paramBody.toString());

        APIInterface apiInterface = APIClient.getInsance().getApi();
        Call<ResponseLogin> apiCall = apiInterface.userLogin(body);

        apiCall.enqueue(new Callback<ResponseLogin>() {
            @Override
            public void onResponse(Call<ResponseLogin> call, Response<ResponseLogin> response) {
                assert response.body() != null;
                listener.onSuccess(response.body().toString());
            }

            @Override
            public void onFailure(Call<ResponseLogin> call, Throwable t) {
                //Try again for 3-times
                if (retryCount++ < 3) {
                    call.clone().enqueue(this);
                } else {
                    call.cancel();
                }
                listener.onError(t.getMessage());
            }
        });
    }

    public void addNumbers(Context context, int a, int b){
        Toast.makeText(context, "Sum = "+(a+b), Toast.LENGTH_SHORT).show();
    }


    public void SetOnLoginResponseListener(OnLoginResponse onLoginResponse){
        this.mOnLoginResponse = onLoginResponse;
    }

    public interface OnLoginResponse{
        void onSuccess(String response);
        void onError(String error);
    }

}
