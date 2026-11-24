package org.xplatform.ui_core.viewcomponents.views.date;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new ScrollableSquaredDateView.SavedState(parcel.readParcelable(ScrollableSquaredDateView.SavedState.class.getClassLoader()), (Date) parcel.readSerializable(), parcel.readParcelable(ScrollableSquaredDateView.SavedState.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ScrollableSquaredDateView.SavedState[i];
    }
}
