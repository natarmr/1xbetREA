package org.xplatform.sportgame.subgames.impl.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        parcel.readInt();
        return SelectedTabState.PositionHandled.f47017a;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SelectedTabState.PositionHandled[i];
    }
}
