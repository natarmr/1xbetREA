package org.xplatform.security.impl.presentation.email.send_code.model;

import a.swp0;
import android.os.Parcel;
import android.os.Parcelable;
import org.xplatform.security.api.navigation.SecurityNavigationScreen;
import org.xplatform.security.api.presentation.models.SendEmailIntention;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new CheckEmailScreenParams.BindEmail((swp0) parcel.readSerializable(), parcel.readInt(), (SendEmailIntention) parcel.readParcelable(CheckEmailScreenParams.BindEmail.class.getClassLoader()), (SecurityNavigationScreen) parcel.readParcelable(CheckEmailScreenParams.BindEmail.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CheckEmailScreenParams.BindEmail[i];
    }
}
