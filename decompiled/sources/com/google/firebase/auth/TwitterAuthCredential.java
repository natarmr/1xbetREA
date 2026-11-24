package com.google.firebase.auth;

import a.lgw0;
import a.q5x;
import a.s0x;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class TwitterAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<TwitterAuthCredential> CREATOR = new lgw0(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45651a;
    public final String b;

    public TwitterAuthCredential(String str, String str2) {
        s0x.E(str);
        this.f45651a = str;
        s0x.E(str2);
        this.b = str2;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String m() {
        return "twitter.com";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 1, this.f45651a);
        q5x.k0(parcel, 2, this.b);
        q5x.q0(parcel, iP0);
    }
}
