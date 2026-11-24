package org.xplatform.app_update.impl.presentation.update_screen.views.content.download.value;

import a.fcl;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new DownloadValue$SavedState(parcel.readParcelable(DownloadValue$SavedState.class.getClassLoader()), parcel.readInt() == 0 ? null : fcl.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DownloadValue$SavedState[i];
    }
}
