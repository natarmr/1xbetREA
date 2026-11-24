package org.xplatform.top.impl.presentation.ui.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        parcel.readInt();
        return TopSectionKey.Header.BannerTape.f47138a;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new TopSectionKey.Header.BannerTape[i];
    }
}
