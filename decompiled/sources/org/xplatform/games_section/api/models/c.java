package org.xplatform.games_section.api.models;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        parcel.readInt();
        return GamesActionsFragmentResultModel.PreviewActionGamesUnderMaintenance.f46723a;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new GamesActionsFragmentResultModel.PreviewActionGamesUnderMaintenance[i];
    }
}
