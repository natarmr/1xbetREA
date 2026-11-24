package com.google.android.gms.fido.fido2.api.common;

import a.erw0;
import a.glt0;
import a.l8x;
import a.mkt0;
import a.pmw0;
import a.q5x;
import a.t0o;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new erw0((byte) 19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ErrorCode f45504a;
    public final String b;
    public final int c;

    public AuthenticatorErrorResponse(int i, int i2, String str) {
        try {
            this.f45504a = ErrorCode.a(i);
            this.b = str;
            this.c = i2;
        } catch (t0o e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        return l8x.Z(this.f45504a, authenticatorErrorResponse.f45504a) && l8x.Z(this.b, authenticatorErrorResponse.b) && l8x.Z(Integer.valueOf(this.c), Integer.valueOf(authenticatorErrorResponse.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45504a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        glt0 glt0Var = new glt0(getClass().getSimpleName());
        String strValueOf = String.valueOf((int) this.f45504a.f45505a);
        pmw0 pmw0Var = new pmw0();
        ((mkt0) glt0Var.d).c = pmw0Var;
        glt0Var.d = pmw0Var;
        pmw0Var.b = strValueOf;
        pmw0Var.f21959a = "errorCode";
        String str = this.b;
        if (str != null) {
            glt0Var.k(str, "errorMessage");
        }
        return glt0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        byte b = this.f45504a.f45505a;
        q5x.o0(parcel, 2, 4);
        parcel.writeInt(b);
        q5x.k0(parcel, 3, this.b);
        q5x.o0(parcel, 4, 4);
        parcel.writeInt(this.c);
        q5x.q0(parcel, iP0);
    }
}
