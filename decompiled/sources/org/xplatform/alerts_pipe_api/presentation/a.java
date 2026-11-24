package org.xplatform.alerts_pipe_api.presentation;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        parcel.readInt();
        return AlertsPipeType.IdentificationAlertKzAlert.f46312a;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new AlertsPipeType.IdentificationAlertKzAlert[i];
    }
}
