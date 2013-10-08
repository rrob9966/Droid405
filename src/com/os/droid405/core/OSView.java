package com.os.droid405.core;

import android.content.Context;

public interface OSView {
	Context getContext();
	OSHandler getHandler();
	OSPresenter getPresenter();
}
