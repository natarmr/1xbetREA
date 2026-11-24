package com.google.android.gms.fido.fido2.api.common;

import a.e9d0;
import a.erw0;
import a.glt0;
import a.ktw0;
import a.l8x;
import a.ntw0;
import a.q5x;
import a.s0x;
import a.vuw0;
import a.y0x0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new erw0((byte) 7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vuw0 f45502a;
    public final vuw0 b;
    public final vuw0 c;
    public final vuw0 d;
    public final vuw0 e;

    public AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        s0x.H(bArr);
        vuw0 vuw0VarK = vuw0.k(bArr, bArr.length);
        s0x.H(bArr2);
        vuw0 vuw0VarK2 = vuw0.k(bArr2, bArr2.length);
        s0x.H(bArr3);
        vuw0 vuw0VarK3 = vuw0.k(bArr3, bArr3.length);
        s0x.H(bArr4);
        vuw0 vuw0VarK4 = vuw0.k(bArr4, bArr4.length);
        vuw0 vuw0VarK5 = bArr5 == null ? null : vuw0.k(bArr5, bArr5.length);
        this.f45502a = vuw0VarK;
        this.b = vuw0VarK2;
        this.c = vuw0VarK3;
        this.d = vuw0VarK4;
        this.e = vuw0VarK5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return l8x.Z(this.f45502a, authenticatorAssertionResponse.f45502a) && l8x.Z(this.b, authenticatorAssertionResponse.b) && l8x.Z(this.c, authenticatorAssertionResponse.c) && l8x.Z(this.d, authenticatorAssertionResponse.d) && l8x.Z(this.e, authenticatorAssertionResponse.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f45502a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e}))});
    }

    public final JSONObject m() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", y0x0.G(this.b.l()));
            jSONObject.put("authenticatorData", y0x0.G(this.c.l()));
            jSONObject.put("signature", y0x0.G(this.d.l()));
            vuw0 vuw0Var = this.e;
            if (vuw0Var == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", y0x0.G(vuw0Var == null ? null : vuw0Var.l()));
            return jSONObject;
        } catch (JSONException e) {
            e9d0.m("Error encoding AuthenticatorAssertionResponse to JSON object", e);
            return null;
        }
    }

    public final String toString() {
        glt0 glt0Var = new glt0(getClass().getSimpleName());
        ktw0 ktw0Var = ntw0.d;
        byte[] bArrL = this.f45502a.l();
        glt0Var.k(ktw0Var.c(bArrL, bArrL.length), "keyHandle");
        byte[] bArrL2 = this.b.l();
        glt0Var.k(ktw0Var.c(bArrL2, bArrL2.length), "clientDataJSON");
        byte[] bArrL3 = this.c.l();
        glt0Var.k(ktw0Var.c(bArrL3, bArrL3.length), "authenticatorData");
        byte[] bArrL4 = this.d.l();
        glt0Var.k(ktw0Var.c(bArrL4, bArrL4.length), "signature");
        vuw0 vuw0Var = this.e;
        byte[] bArrL5 = vuw0Var == null ? null : vuw0Var.l();
        if (bArrL5 != null) {
            glt0Var.k(ktw0Var.c(bArrL5, bArrL5.length), "userHandle");
        }
        return glt0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.e0(parcel, 2, this.f45502a.l());
        q5x.e0(parcel, 3, this.b.l());
        q5x.e0(parcel, 4, this.c.l());
        q5x.e0(parcel, 5, this.d.l());
        vuw0 vuw0Var = this.e;
        q5x.e0(parcel, 6, vuw0Var == null ? null : vuw0Var.l());
        q5x.q0(parcel, iP0);
    }
}
