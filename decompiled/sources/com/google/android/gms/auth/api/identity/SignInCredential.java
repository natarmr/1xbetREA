package com.google.android.gms.auth.api.identity;

import a.equ0;
import a.l8x;
import a.q5x;
import a.s0x;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR = new equ0((byte) 23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45471a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public final String f;
    public final String g;
    public final String h;
    public final PublicKeyCredential i;

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, PublicKeyCredential publicKeyCredential) {
        s0x.H(str);
        this.f45471a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = publicKeyCredential;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return l8x.Z(this.f45471a, signInCredential.f45471a) && l8x.Z(this.b, signInCredential.b) && l8x.Z(this.c, signInCredential.c) && l8x.Z(this.d, signInCredential.d) && l8x.Z(this.e, signInCredential.e) && l8x.Z(this.f, signInCredential.f) && l8x.Z(this.g, signInCredential.g) && l8x.Z(this.h, signInCredential.h) && l8x.Z(this.i, signInCredential.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45471a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 1, this.f45471a);
        q5x.k0(parcel, 2, this.b);
        q5x.k0(parcel, 3, this.c);
        q5x.k0(parcel, 4, this.d);
        q5x.j0(parcel, 5, this.e, i);
        q5x.k0(parcel, 6, this.f);
        q5x.k0(parcel, 7, this.g);
        q5x.k0(parcel, 8, this.h);
        q5x.j0(parcel, 9, this.i, i);
        q5x.q0(parcel, iP0);
    }
}
