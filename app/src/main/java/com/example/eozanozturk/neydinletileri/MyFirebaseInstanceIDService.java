package com.example.eozanozturk.neydinletileri;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by ibokan on 28.12.2016.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    private static final String TAG = "MyFirebaseIIDService";

    @Override
    public void onTokenRefresh() {
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Token: " + token);
        sendRegistrationToServer(token);

    }
    private void sendRegistrationToServer(String token) {
        // token'ı servise gönderme işlemlerini bu methodda yapmalısınız
    }
}
