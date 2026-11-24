package com.google.android.gms.auth.api.signin;

import a.equ0;
import a.q5x;
import a.s0x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new equ0((byte) 19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45474a;
    public final GoogleSignInAccount b;
    public final String c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.b = googleSignInAccount;
        s0x.F(str, "8.3 and 8.4 SDKs require non-null email");
        this.f45474a = str;
        s0x.F(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 4, this.f45474a);
        q5x.j0(parcel, 7, this.b, i);
        q5x.k0(parcel, 8, this.c);
        q5x.q0(parcel, iP0);
    }
}
