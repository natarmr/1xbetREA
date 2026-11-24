package org.xplatform.security.api.presentation.models;

import a.swp0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new ConfirmSendEmailScreenParams.Registration(SendEmailIntention.Registration.CREATOR.createFromParcel(parcel), (swp0) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ConfirmSendEmailScreenParams.Registration[i];
    }
}
