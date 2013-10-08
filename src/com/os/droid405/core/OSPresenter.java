package com.os.droid405.core;

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
}