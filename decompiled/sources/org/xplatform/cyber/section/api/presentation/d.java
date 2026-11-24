package org.xplatform.cyber.section.api.presentation;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new EsportsGamesScreenParams.SportGames(parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new EsportsGamesScreenParams.SportGames[i];
    }
}
