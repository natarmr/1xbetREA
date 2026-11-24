package org.xplatform.cyber.section.api.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        int i = parcel.readInt();
        boolean z = parcel.readInt() != 0;
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 != i2; i3++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        return new EsportsGamesScreenParams.ChampsGames(i, arrayList, z);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new EsportsGamesScreenParams.ChampsGames[i];
    }
}
