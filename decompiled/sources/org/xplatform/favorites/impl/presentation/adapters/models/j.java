package org.xplatform.favorites.impl.presentation.adapters.models;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new FavoriteGroupHeaderUiItem.XGames(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new FavoriteGroupHeaderUiItem.XGames[i];
    }
}
