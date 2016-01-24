package com.example.plugin;

import org.apache.cordova.*;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;

public class CheckInstalledServices extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("check")) {
			JSONObject jo = new JSONObject();
			int val = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this.cordova.getActivity().getApplicationContext());
			callbackContext.success(jo.put("isGooglePlayServicesAvailable", val == ConnectionResult.SUCCESS));

            return true;

        } else {
            
            return false;

        }
    }
}
