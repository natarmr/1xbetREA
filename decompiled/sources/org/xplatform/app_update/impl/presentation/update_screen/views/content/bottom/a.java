package org.xplatform.app_update.impl.presentation.update_screen.views.content.bottom;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new AppUpdateBottomView.SavedState(parcel.readParcelable(AppUpdateBottomView.SavedState.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new AppUpdateBottomView.SavedState[i];
    }
}
