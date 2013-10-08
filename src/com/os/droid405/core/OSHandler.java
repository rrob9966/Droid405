package com.os.droid405.core;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public abstract class OSHandler extends Handler {
	public static final int SUCCESS = 1;
	public static final int ERROR = 2;
	public static final int NETWORK_CONNECTION_UNAVAILABLE = 100;
	public static final int CONNECTION_TIMEOUT = 101;
	
	private Context mContext;
	
	public OSHandler(Context context) {
		mContext = context;
	}
	
	public OSHandler() {}
	
	@Override
	public void handleMessage(Message msg) {
		switch(msg.what) {
			case SUCCESS:
				handleSuccess(msg.getData());
				break;
			case ERROR:
				handleError(msg.getData());
				break;
			case NETWORK_CONNECTION_UNAVAILABLE:
				handleNetworkUnavailale();
				break;
			case CONNECTION_TIMEOUT:
				handleConnectionTimeout();
				break;
		}
	}
	
	public Context getContext() {
		return mContext;
	}
	
	public  void sendMessage(int what, Bundle data) {
		Message msg = new Message();
		msg.what = what;
		if(data != null)
			msg.setData(data);
		
		super.sendMessage(msg);
	}	
	
	public  void sendMessage(int what) {
		sendMessage(what, null);
	}
	
	public void sendSuccessMessage(Bundle data) {
		sendMessage(OSHandler.SUCCESS, data);
	}
	
	public void sendErrorMessage(Bundle data) {
		sendMessage(OSHandler.ERROR, data);
	}	
	
	public abstract void handleSuccess(Bundle data);
	
	public void handleError(Bundle data) {}
	public void handleNetworkUnavailale() {}
	public void handleConnectionTimeout() {}
}
