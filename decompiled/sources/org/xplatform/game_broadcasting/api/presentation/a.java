package org.xplatform.game_broadcasting.api.presentation;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        parcel.readInt();
        return GameVideoPlayerColorScheme.Static.f46687a;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new GameVideoPlayerColorScheme.Static[i];
    }
}
