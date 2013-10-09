package com.os.droid405.framework;

import android.os.Parcel;
import android.os.Parcelable;

public class OSEntity implements Parcelable {
	public static final Parcelable.Creator<OSEntity>  CREATOR = new Parcelable.Creator<OSEntity>() {

		@Override
		public OSEntity createFromParcel(Parcel source) {
			return new OSEntity(source);
		}

		@Override
		public OSEntity[] newArray(int size) {
			return new OSEntity[size];
		}
	};
	
	public OSEntity(Parcel source) {
	}		
	
	@Override
	public int describeContents() {
		return this.hashCode();
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
	}
}
