package hearsilent.asynchttpclient;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class GeneralCallback {
	public void onSuccess() {
	}

	public void onSuccess(ArrayList<NotifyModule> modules) {
	}

	public void onSuccess(String data) {
	}

	public void onSuccess(JSONObject jsonObject) {
	}

	public void onSuccess(JSONArray jsonArray) {
	}

	public void onFail(String errorMessage) {
	}

	public void onTokenExpired() {
	}

	public void onTimeOut() {
	}
}
