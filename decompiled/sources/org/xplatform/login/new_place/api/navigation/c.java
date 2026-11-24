package org.xplatform.login.new_place.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new ConfirmationNewPlaceScreenType.SmsCode(parcel.readString(), parcel.readString(), parcel.readString(), (SmsCodeExtras) parcel.readParcelable(ConfirmationNewPlaceScreenType.SmsCode.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ConfirmationNewPlaceScreenType.SmsCode[i];
    }
}
