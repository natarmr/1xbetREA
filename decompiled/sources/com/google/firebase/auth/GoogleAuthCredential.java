package com.google.firebase.auth;

import a.jf4;
import a.lgw0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class GoogleAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<GoogleAuthCredential> CREATOR = new lgw0(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45646a;
    public final String b;

    public GoogleAuthCredential(String str, String str2) {
        if (str == null && str2 == null) {
            jf4.o("Must specify an idToken or an accessToken.");
            throw null;
        }
        if (str != null && str.length() == 0) {
            jf4.o("idToken cannot be empty");
            throw null;
        }
        if (str2 != null && str2.length() == 0) {
            jf4.o("accessToken cannot be empty");
            throw null;
        }
        this.f45646a = str;
        this.b = str2;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String m() {
        return "google.com";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 1, this.f45646a);
        q5x.k0(parcel, 2, this.b);
        q5x.q0(parcel, iP0);
    }
}
