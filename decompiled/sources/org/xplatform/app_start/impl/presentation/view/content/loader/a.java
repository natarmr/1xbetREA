package org.xplatform.app_start.impl.presentation.view.content.loader;

import a.wg3;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new AppStartLoaderView$SavedState(parcel.readParcelable(AppStartLoaderView$SavedState.class.getClassLoader()), wg3.valueOf(parcel.readString()), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new AppStartLoaderView$SavedState[i];
    }
}
