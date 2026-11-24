package com.google.firebase.auth;

import a.lgw0;
import a.q5x;
import a.s0x;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class GithubAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<GithubAuthCredential> CREATOR = new lgw0(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45645a;

    public GithubAuthCredential(String str) {
        s0x.E(str);
        this.f45645a = str;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String m() {
        return "github.com";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 1, this.f45645a);
        q5x.q0(parcel, iP0);
    }
}
