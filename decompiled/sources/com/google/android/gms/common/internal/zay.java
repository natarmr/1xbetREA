package com.google.android.gms.common.internal;

import a.equ0;
import a.q5x;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zay> CREATOR = new equ0((byte) 18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45495a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public zay(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f45495a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 4);
        parcel.writeInt(this.f45495a);
        q5x.j0(parcel, 2, this.b, i);
        q5x.o0(parcel, 3, 4);
        parcel.writeInt(this.c);
        q5x.j0(parcel, 4, this.d, i);
        q5x.q0(parcel, iP0);
    }
}
