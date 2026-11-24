package org.xplatform.special_event.impl.alleventsgames.presentation;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new AllEventGamesScreenParams.ParticipantGames(parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new AllEventGamesScreenParams.ParticipantGames[i];
    }
}
