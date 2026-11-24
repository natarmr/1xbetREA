package org.xplatform.support.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        parcel.readInt();
        return SupportMenuScreenParams.AdditionalParams.None.f47112a;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SupportMenuScreenParams.AdditionalParams.None[i];
    }
}
