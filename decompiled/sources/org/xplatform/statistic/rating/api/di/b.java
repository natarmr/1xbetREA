package org.xplatform.statistic.rating.api.di;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new RatingStatisticScreenParams.GameParamsStatistic(parcel.readString(), parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new RatingStatisticScreenParams.GameParamsStatistic[i];
    }
}
