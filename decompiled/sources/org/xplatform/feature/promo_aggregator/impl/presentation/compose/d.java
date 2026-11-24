package org.xplatform.feature.promo_aggregator.impl.presentation.compose;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        parcel.readInt();
        return PromoCodeCacheContentState.Empty.f46657a;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new PromoCodeCacheContentState.Empty[i];
    }
}
