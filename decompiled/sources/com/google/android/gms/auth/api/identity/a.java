package com.google.android.gms.auth.api.identity;

import a.b5x;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iI0 = b5x.i0(parcel);
        boolean zT = false;
        int iW = 0;
        boolean zT2 = false;
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = null;
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = null;
        String strD = null;
        BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = null;
        BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = null;
        while (parcel.dataPosition() < iI0) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    passwordRequestOptions = (BeginSignInRequest.PasswordRequestOptions) b5x.C(parcel, i, BeginSignInRequest.PasswordRequestOptions.CREATOR);
                    break;
                case 2:
                    googleIdTokenRequestOptions = (BeginSignInRequest.GoogleIdTokenRequestOptions) b5x.C(parcel, i, BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR);
                    break;
                case 3:
                    strD = b5x.D(parcel, i);
                    break;
                case 4:
                    zT = b5x.T(parcel, i);
                    break;
                case 5:
                    iW = b5x.W(parcel, i);
                    break;
                case 6:
                    passkeysRequestOptions = (BeginSignInRequest.PasskeysRequestOptions) b5x.C(parcel, i, BeginSignInRequest.PasskeysRequestOptions.CREATOR);
                    break;
                case 7:
                    passkeyJsonRequestOptions = (BeginSignInRequest.PasskeyJsonRequestOptions) b5x.C(parcel, i, BeginSignInRequest.PasskeyJsonRequestOptions.CREATOR);
                    break;
                case '\b':
                    zT2 = b5x.T(parcel, i);
                    break;
                default:
                    b5x.b0(parcel, i);
                    break;
            }
        }
        b5x.H(parcel, iI0);
        return new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, strD, zT, iW, passkeysRequestOptions, passkeyJsonRequestOptions, zT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BeginSignInRequest[i];
    }
}
