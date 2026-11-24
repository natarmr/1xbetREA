package org.xplatform.background_video.api.presentation;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new BackgroundVideoDownloadServiceParams$StartDestination$Video.Medium(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new BackgroundVideoDownloadServiceParams$StartDestination$Video.Medium[i];
    }
}
