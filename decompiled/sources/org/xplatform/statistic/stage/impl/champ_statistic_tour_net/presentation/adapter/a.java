package org.xplatform.statistic.stage.impl.champ_statistic_tour_net.presentation.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        Parcelable parcelable = parcel.readParcelable(LinearLayoutManagerWithAccurateOffset.InternalState.class.getClassLoader());
        int i = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        for (int i2 = 0; i2 != i; i2++) {
            linkedHashMap.put(Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()));
        }
        return new LinearLayoutManagerWithAccurateOffset.InternalState(parcelable, linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new LinearLayoutManagerWithAccurateOffset.InternalState[i];
    }
}
