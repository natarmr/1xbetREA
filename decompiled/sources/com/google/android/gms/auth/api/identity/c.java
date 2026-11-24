package com.google.android.gms.auth.api.identity;

import a.b5x;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iI0 = b5x.i0(parcel);
        String strD = null;
        boolean zT = false;
        while (parcel.dataPosition() < iI0) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                zT = b5x.T(parcel, i);
            } else if (c != 2) {
                b5x.b0(parcel, i);
            } else {
                strD = b5x.D(parcel, i);
            }
        }
        b5x.H(parcel, iI0);
        return new BeginSignInRequest.PasskeyJsonRequestOptions(strD, zT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInRequest.PasskeyJsonRequestOptions[i];
    }
}
