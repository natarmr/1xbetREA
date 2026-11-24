package org.xplatform.search.api.models;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        parcel.readInt();
        return GlobalSearchContainerSettings.FavoriteTeam.f46914a;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new GlobalSearchContainerSettings.FavoriteTeam[i];
    }
}
