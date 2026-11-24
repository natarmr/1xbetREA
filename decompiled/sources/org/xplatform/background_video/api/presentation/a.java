package org.xplatform.background_video.api.presentation;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new BackgroundVideoDownloadServiceParams$StartDestination$Preview.Large(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new BackgroundVideoDownloadServiceParams$StartDestination$Preview.Large[i];
    }
}
