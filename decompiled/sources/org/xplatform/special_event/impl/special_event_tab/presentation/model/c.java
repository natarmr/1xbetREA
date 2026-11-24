package org.xplatform.special_event.impl.special_event_tab.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        parcel.readInt();
        return SpecialEventTab.Statistic.c;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SpecialEventTab.Statistic[i];
    }
}
