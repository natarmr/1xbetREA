package org.xplatform.bet_history.history.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        parcel.readInt();
        return DatePeriodState.Full.f46401a;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DatePeriodState.Full[i];
    }
}
