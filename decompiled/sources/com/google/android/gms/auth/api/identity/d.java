package com.google.android.gms.auth.api.identity;

import a.b5x;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iI0 = b5x.i0(parcel);
        byte[] bArrZ = null;
        boolean zT = false;
        String strD = null;
        while (parcel.dataPosition() < iI0) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                zT = b5x.T(parcel, i);
            } else if (c == 2) {
                bArrZ = b5x.z(parcel, i);
            } else if (c != 3) {
                b5x.b0(parcel, i);
            } else {
                strD = b5x.D(parcel, i);
            }
        }
        b5x.H(parcel, iI0);
        return new BeginSignInRequest.PasskeysRequestOptions(zT, bArrZ, strD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInRequest.PasskeysRequestOptions[i];
    }
}
