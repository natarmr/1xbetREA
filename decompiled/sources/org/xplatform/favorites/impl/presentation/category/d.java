package org.xplatform.favorites.impl.presentation.category;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new FavoriteCategoryUiState.Team(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new FavoriteCategoryUiState.Team[i];
    }
}
