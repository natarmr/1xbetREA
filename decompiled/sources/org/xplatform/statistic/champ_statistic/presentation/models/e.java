package org.xplatform.statistic.champ_statistic.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        parcel.readInt();
        return ChampMenuType.Undefined.c;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ChampMenuType.Undefined[i];
    }
}
