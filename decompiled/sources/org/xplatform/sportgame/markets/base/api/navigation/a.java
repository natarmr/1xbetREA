package org.xplatform.sportgame.markets.base.api.navigation;

import a.ms2;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new MarketsParams.DuelSubGame(parcel.readLong(), parcel.readLong(), parcel.readLong(), (ms2) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MarketsParams.DuelSubGame[i];
    }
}
