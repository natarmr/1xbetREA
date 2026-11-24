package org.xplatform.app_update.impl.presentation.update_screen.views.content.download.description;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new DownloadDescription$SavedState(parcel.readParcelable(DownloadDescription$SavedState.class.getClassLoader()), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new DownloadDescription$SavedState[i];
    }
}
