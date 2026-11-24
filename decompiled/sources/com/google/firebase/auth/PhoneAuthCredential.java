package com.google.firebase.auth;

import a.lgw0;
import a.q5x;
import a.s0x;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class PhoneAuthCredential extends AuthCredential implements Cloneable {
    public static final Parcelable.Creator<PhoneAuthCredential> CREATOR = new lgw0(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45647a;
    public final String b;
    public final String c;
    public boolean d;
    public final String e;

    public PhoneAuthCredential(String str, String str2, String str3, boolean z, String str4) {
        s0x.B("Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.", ((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) ? false : true);
        this.f45647a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
    }

    public final Object clone() {
        return new PhoneAuthCredential(this.f45647a, this.b, this.c, this.d, this.e);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String m() {
        return "phone";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 1, this.f45647a);
        q5x.k0(parcel, 2, this.b);
        q5x.k0(parcel, 4, this.c);
        boolean z = this.d;
        q5x.o0(parcel, 5, 4);
        parcel.writeInt(z ? 1 : 0);
        q5x.k0(parcel, 6, this.e);
        q5x.q0(parcel, iP0);
    }
}
