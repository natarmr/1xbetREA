package org.xplatform.security.api.presentation.models;

import android.os.Parcel;
import android.os.Parcelable;
import org.xplatform.security.api.navigation.EndFlowNavigation;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new SendEmailIntention.Bind(parcel.readString(), (EndFlowNavigation) parcel.readParcelable(SendEmailIntention.Bind.class.getClassLoader()), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SendEmailIntention.Bind[i];
    }
}
