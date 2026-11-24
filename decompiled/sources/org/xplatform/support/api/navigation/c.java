package org.xplatform.support.api.navigation;

import a.pjn0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new SupportMenuScreenParams(parcel.readInt() != 0, pjn0.valueOf(parcel.readString()), (SupportMenuScreenParams.AdditionalParams) parcel.readParcelable(SupportMenuScreenParams.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SupportMenuScreenParams[i];
    }
}
