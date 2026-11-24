package com.google.android.gms.fido.fido2.api.common;

import a.b1j;
import a.c44;
import a.f140;
import a.l8x;
import a.lgw0;
import a.lxw0;
import a.s0x;
import a.ua80;
import a.unh0;
import a.vuw0;
import a.y0x0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new lgw0(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45506a;
    public final String b;
    public final vuw0 c;
    public final AuthenticatorAttestationResponse d;
    public final AuthenticatorAssertionResponse e;
    public final AuthenticatorErrorResponse f;
    public final AuthenticationExtensionsClientOutputs g;
    public final String h;

    public PublicKeyCredential(String str, String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3) {
        vuw0 vuw0VarK = bArr == null ? null : vuw0.k(bArr, bArr.length);
        boolean z = false;
        s0x.B("Must provide a response object.", (authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null));
        if (authenticatorErrorResponse != null || (str != null && vuw0VarK != null)) {
            z = true;
        }
        s0x.B("Must provide id and rawId if not an error response.", z);
        this.f45506a = str;
        this.b = str2;
        this.c = vuw0VarK;
        this.d = authenticatorAttestationResponse;
        this.e = authenticatorAssertionResponse;
        this.f = authenticatorErrorResponse;
        this.g = authenticationExtensionsClientOutputs;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return l8x.Z(this.f45506a, publicKeyCredential.f45506a) && l8x.Z(this.b, publicKeyCredential.b) && l8x.Z(this.c, publicKeyCredential.c) && l8x.Z(this.d, publicKeyCredential.d) && l8x.Z(this.e, publicKeyCredential.e) && l8x.Z(this.f, publicKeyCredential.f) && l8x.Z(this.g, publicKeyCredential.g) && l8x.Z(this.h, publicKeyCredential.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45506a, this.b, this.c, this.e, this.d, this.f, this.g, this.h});
    }

    public final String toString() {
        vuw0 vuw0Var = this.c;
        String strG = y0x0.G(vuw0Var == null ? null : vuw0Var.l());
        String strValueOf = String.valueOf(this.d);
        String strValueOf2 = String.valueOf(this.e);
        String strValueOf3 = String.valueOf(this.f);
        String strValueOf4 = String.valueOf(this.g);
        StringBuilder sbN = b1j.n("PublicKeyCredential{\n id='", this.f45506a, "', \n type='", this.b, "', \n rawId=");
        f140.v(sbN, strG, ", \n registerResponse=", strValueOf, ", \n signResponse=");
        f140.v(sbN, strValueOf2, ", \n errorResponse=", strValueOf3, ", \n extensionsClientOutputs=");
        return ua80.m(sbN, strValueOf4, ", \n authenticatorAttachment='", this.h, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        lxw0.f20836a.getClass();
        if (unh0.g == null) {
            unh0.g = new c44((byte) 18);
        }
        synchronized (unh0.f) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }
}
