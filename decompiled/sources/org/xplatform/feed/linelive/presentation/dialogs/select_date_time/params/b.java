package org.xplatform.feed.linelive.presentation.dialogs.select_date_time.params;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new ChoosenDate.SingleDate((Date) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ChoosenDate.SingleDate[i];
    }
}
