package org.xplatform.login.core.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        String string = parcel.readString();
        string.getClass();
        return new AuthDataModel.Qr(string);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new AuthDataModel.Qr[i];
    }
}
