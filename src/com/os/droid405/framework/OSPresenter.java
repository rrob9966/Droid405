package com.os.droid405.framework;

import android.content.Context;

public abstract class OSPresenter {
	private OSView mView;
	
	public OSPresenter(OSView view) {
		mView = view;
	}
	
	public Context getContext() {
		return mView.getContext();
	}
	
	public OSHandler getHandler() {
		return mView.getHandler();
	}
	
	public abstract <T> void update(int requestCode, int resultCode, T data);
	
	public <T> void notifyView(int requestCode, int resultCode, T data) {		
		mView.update(requestCode, resultCode, data);
	}
}