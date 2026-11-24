package com.google.firebase.auth;

import a.erw0;
import a.q5x;
import a.s0x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p000firebaseauthapi.zzajg;

/* JADX INFO: loaded from: classes2.dex */
public final class zzc extends OAuthCredential {
    public static final Parcelable.Creator<zzc> CREATOR = new erw0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45661a;
    public final String b;
    public final String c;
    public final zzajg d;
    public final String e;
    public final String f;
    public final String g;

    public zzc(String str, String str2, String str3, zzajg zzajgVar, String str4, String str5, String str6) {
        this.f45661a = str == null ? "" : str;
        this.b = str2;
        this.c = str3;
        this.d = zzajgVar;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public static zzc p(zzajg zzajgVar) {
        s0x.I(zzajgVar, "Must specify a non-null webSignInCredential");
        return new zzc(null, null, null, zzajgVar, null, null, null);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String m() {
        return this.f45661a;
    }

    public final AuthCredential o() {
        return new zzc(this.f45661a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 1, this.f45661a);
        q5x.k0(parcel, 2, this.b);
        q5x.k0(parcel, 3, this.c);
        q5x.j0(parcel, 4, this.d, i);
        q5x.k0(parcel, 5, this.e);
        q5x.k0(parcel, 6, this.f);
        q5x.k0(parcel, 7, this.g);
        q5x.q0(parcel, iP0);
    }
}
