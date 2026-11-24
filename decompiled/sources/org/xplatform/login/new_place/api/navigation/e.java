package org.xplatform.login.new_place.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        parcel.readInt();
        return SmsCodeExtras.None.f46760a;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SmsCodeExtras.None[i];
    }
}
