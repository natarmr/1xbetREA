package org.xplatform.security.impl.presentation.email.send_code.model;

import a.swp0;
import android.os.Parcel;
import android.os.Parcelable;
import org.xplatform.security.api.presentation.models.SendEmailIntention;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new CheckEmailScreenParams.Registration((swp0) parcel.readSerializable(), parcel.readInt(), (SendEmailIntention) parcel.readParcelable(CheckEmailScreenParams.Registration.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CheckEmailScreenParams.Registration[i];
    }
}
