package com.os.droid405.framework;

import android.content.Context;

public interface OSView {
	Context getContext();
	OSHandler getHandler();
	OSPresenter getPresenter();
	<T> void update(int requestCode, int resultCode, T data);
}
