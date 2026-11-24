package com.google.android.gms.auth.api.identity;

import a.b5x;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iI0 = b5x.i0(parcel);
        boolean zT = false;
        boolean zT2 = false;
        boolean zT3 = false;
        String strD = null;
        String strD2 = null;
        String strD3 = null;
        ArrayList arrayListE = null;
        while (parcel.dataPosition() < iI0) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    zT = b5x.T(parcel, i);
                    break;
                case 2:
                    strD = b5x.D(parcel, i);
                    break;
                case 3:
                    strD2 = b5x.D(parcel, i);
                    break;
                case 4:
                    zT2 = b5x.T(parcel, i);
                    break;
                case 5:
                    strD3 = b5x.D(parcel, i);
                    break;
                case 6:
                    arrayListE = b5x.E(parcel, i);
                    break;
                case 7:
                    zT3 = b5x.T(parcel, i);
                    break;
                default:
                    b5x.b0(parcel, i);
                    break;
            }
        }
        b5x.H(parcel, iI0);
        return new BeginSignInRequest.GoogleIdTokenRequestOptions(zT, strD, strD2, zT2, strD3, arrayListE, zT3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInRequest.GoogleIdTokenRequestOptions[i];
    }
}
