package com.os.droid405.framework;

public abstract class OSModel {
	private OSPresenter mPresenter;
	
	public OSModel(OSPresenter presenter) {
		mPresenter = presenter;
	}
	
	public OSPresenter getPresenter() {
		return mPresenter;
	}
		
	public <T> void notifyPresenter(int requestCode, int resultCode, T data) {		
		getPresenter().update(requestCode, resultCode, data);
	}
}
