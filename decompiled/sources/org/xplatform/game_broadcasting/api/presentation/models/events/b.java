package org.xplatform.game_broadcasting.api.presentation.models.events;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        parcel.readInt();
        return BroadcastingLandscapeVideoEvent.Stop.f46694a;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new BroadcastingLandscapeVideoEvent.Stop[i];
    }
}
