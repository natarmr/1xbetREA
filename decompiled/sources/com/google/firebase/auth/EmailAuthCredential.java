package com.google.firebase.auth;

import a.erw0;
import a.jf4;
import a.q5x;
import a.s0x;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class EmailAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<EmailAuthCredential> CREATOR = new erw0((byte) 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45642a;
    public final String b;
    public final String c;
    public String d;
    public boolean e;

    public EmailAuthCredential(String str, String str2, String str3, boolean z, String str4) {
        s0x.E(str);
        this.f45642a = str;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            jf4.o("Cannot create an EmailAuthCredential without a password or emailLink.");
            throw null;
        }
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 1, this.f45642a);
        q5x.k0(parcel, 2, this.b);
        q5x.k0(parcel, 3, this.c);
        q5x.k0(parcel, 4, this.d);
        boolean z = this.e;
        q5x.o0(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        q5x.q0(parcel, iP0);
    }
}
