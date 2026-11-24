package org.xplatform.background_video.api.presentation;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new BackgroundVideoDownloadServiceParams$UpdateDestination$Preview.Medium(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new BackgroundVideoDownloadServiceParams$UpdateDestination$Preview.Medium[i];
    }
}
