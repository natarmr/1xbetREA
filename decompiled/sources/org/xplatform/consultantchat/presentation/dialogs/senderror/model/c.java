package org.xplatform.consultantchat.presentation.dialogs.senderror.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new MessageErrorState.RetryDownloading(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MessageErrorState.RetryDownloading[i];
    }
}
