package org.xplatform.cyber.cyberstatistic.impl.presentation.dota;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        Parcelable parcelable = parcel.readParcelable(StickyHeaderLayoutManager.SavedState.class.getClassLoader());
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 != i; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        return new StickyHeaderLayoutManager.SavedState(parcelable, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new StickyHeaderLayoutManager.SavedState[i];
    }
}
