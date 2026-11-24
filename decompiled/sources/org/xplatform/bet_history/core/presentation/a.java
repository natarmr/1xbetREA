package org.xplatform.bet_history.core.presentation;

import a.k77;
import android.os.Parcel;
import android.os.Parcelable;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new BetHistoryScreenModel.BetChampHistory(parcel.readLong(), HistoryTypeModel.CREATOR.createFromParcel(parcel), k77.valueOf(parcel.readString()), parcel.readLong(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new BetHistoryScreenModel.BetChampHistory[i];
    }
}
