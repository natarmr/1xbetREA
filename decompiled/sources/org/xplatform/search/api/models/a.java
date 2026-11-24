package org.xplatform.search.api.models;

import a.bfo0;
import a.bhh0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new GlobalSearchContainerSettings.Default(bfo0.valueOf(parcel.readString()), bhh0.valueOf(parcel.readString()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new GlobalSearchContainerSettings.Default[i];
    }
}
