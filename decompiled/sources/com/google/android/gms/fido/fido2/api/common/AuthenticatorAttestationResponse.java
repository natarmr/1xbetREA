package com.google.android.gms.fido.fido2.api.common;

import a.aww0;
import a.dww0;
import a.e9d0;
import a.erw0;
import a.glt0;
import a.hww0;
import a.hxm0;
import a.iww0;
import a.ktw0;
import a.kww0;
import a.l8x;
import a.lvm0;
import a.mow0;
import a.ntw0;
import a.oww0;
import a.puw0;
import a.q5x;
import a.s0x;
import a.tww0;
import a.vuw0;
import a.y0x0;
import a.yvw0;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new erw0((byte) 17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vuw0 f45503a;
    public final vuw0 b;
    public final vuw0 c;
    public final String[] d;

    public AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        s0x.H(bArr);
        vuw0 vuw0VarK = vuw0.k(bArr, bArr.length);
        s0x.H(bArr2);
        vuw0 vuw0VarK2 = vuw0.k(bArr2, bArr2.length);
        s0x.H(bArr3);
        vuw0 vuw0VarK3 = vuw0.k(bArr3, bArr3.length);
        this.f45503a = vuw0VarK;
        this.b = vuw0VarK2;
        this.c = vuw0VarK3;
        s0x.H(strArr);
        this.d = strArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return l8x.Z(this.f45503a, authenticatorAttestationResponse.f45503a) && l8x.Z(this.b, authenticatorAttestationResponse.b) && l8x.Z(this.c, authenticatorAttestationResponse.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.f45503a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c}))});
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0143 A[Catch: JSONException -> 0x0045, kww0 -> 0x0221, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0045, blocks: (B:3:0x000a, B:4:0x0032, B:6:0x0035, B:8:0x003f, B:12:0x004f, B:11:0x004a, B:13:0x0052, B:14:0x005b, B:15:0x0065, B:17:0x0076, B:18:0x007e, B:19:0x008c, B:21:0x009e, B:22:0x00bc, B:24:0x00cb, B:26:0x00d4, B:28:0x00e1, B:29:0x00e4, B:30:0x00ea, B:34:0x010c, B:40:0x0132, B:42:0x0143, B:25:0x00ce), top: B:133:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x01be  */
    /* JADX WARN: Code duplicated, block: B:76:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:83:0x0225  */
    public final JSONObject m() {
        oww0 oww0Var;
        JSONObject jSONObject;
        byte[] bArrS;
        String[] strArr = this.d;
        vuw0 vuw0Var = this.c;
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("clientDataJSON", y0x0.G(this.b.l()));
            jSONObject2.put("attestationObject", y0x0.G(vuw0Var.l()));
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i].equals("cable")) {
                    jSONArray.put(i, "hybrid");
                } else {
                    jSONArray.put(i, strArr[i]);
                }
            }
            try {
                jSONObject2.put("transports", jSONArray);
                try {
                    try {
                        oww0 oww0Var2 = (oww0) ((hww0) oww0.d(vuw0Var.l()).b(hww0.class)).b.get(new iww0("authData"));
                        if (oww0Var2 != null) {
                            vuw0 vuw0Var2 = ((yvw0) oww0Var2.b(yvw0.class)).f43341a;
                            byte[] bArr = vuw0Var2.b;
                            ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(bArr, 0, vuw0Var2.g()).asReadOnlyBuffer();
                            try {
                                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 32);
                                if ((byteBufferAsReadOnlyBuffer.get() & 64) != 0) {
                                    byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 4);
                                    byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 16);
                                    byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + byteBufferAsReadOnlyBuffer.getShort());
                                    try {
                                        try {
                                            int iPosition = byteBufferAsReadOnlyBuffer.position();
                                            int iJ = vuw0.j(iPosition, bArr.length, vuw0Var2.g());
                                            tww0 tww0Var = new tww0((iJ == 0 ? vuw0.c : new puw0(bArr, iPosition, iJ)).i());
                                            try {
                                                oww0 oww0VarD = hxm0.D(tww0Var);
                                                try {
                                                    tww0Var.close();
                                                } catch (IOException unused) {
                                                }
                                                mow0 mow0Var = ((hww0) oww0VarD.b(hww0.class)).b;
                                                oww0 oww0Var3 = (oww0) mow0Var.get(new dww0(3L));
                                                oww0 oww0Var4 = (oww0) mow0Var.get(new dww0(1L));
                                                if (oww0Var3 == null || oww0Var4 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                try {
                                                    long j = ((dww0) oww0Var3.b(dww0.class)).f6819a;
                                                    long j2 = ((dww0) oww0Var4.b(dww0.class)).f6819a;
                                                    if (j2 == 1) {
                                                        oww0Var = (oww0) mow0Var.get(new dww0(-1L));
                                                        try {
                                                            if (oww0Var != null) {
                                                                throw new IllegalArgumentException("COSE key missing required fields");
                                                            }
                                                            long j3 = ((dww0) oww0Var.b(dww0.class)).f6819a;
                                                            jSONObject = jSONObject2;
                                                            if (j2 != 2 && j3 == 1) {
                                                                oww0 oww0Var5 = (oww0) mow0Var.get(new dww0(-2L));
                                                                oww0 oww0Var6 = (oww0) mow0Var.get(new dww0(-3L));
                                                                if (oww0Var5 == null || oww0Var6 == null) {
                                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                                }
                                                                vuw0 vuw0Var3 = ((yvw0) oww0Var5.b(yvw0.class)).f43341a;
                                                                vuw0 vuw0Var4 = ((yvw0) oww0Var6.b(yvw0.class)).f43341a;
                                                                if (vuw0Var3.b.length != 32 || vuw0Var4.b.length != 32) {
                                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                                }
                                                                bArrS = lvm0.s(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), vuw0Var3.l(), vuw0Var4.l());
                                                            } else if (j2 == 1 || j3 != 6) {
                                                                bArrS = null;
                                                            } else {
                                                                oww0 oww0Var7 = (oww0) mow0Var.get(new dww0(-2L));
                                                                if (oww0Var7 == null) {
                                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                                }
                                                                vuw0 vuw0Var5 = ((yvw0) oww0Var7.b(yvw0.class)).f43341a;
                                                                if (vuw0Var5.b.length != 32) {
                                                                    throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                                }
                                                                bArrS = lvm0.s(Base64.decode("MCowBQYDK2VwAyEA", 0), vuw0Var5.l());
                                                            }
                                                        } catch (kww0 e) {
                                                            e = e;
                                                        }
                                                        throw new IllegalArgumentException("COSE key ill-formed", e);
                                                    }
                                                    if (j2 == 2) {
                                                        j2 = 2;
                                                        oww0Var = (oww0) mow0Var.get(new dww0(-1L));
                                                        if (oww0Var != null) {
                                                            throw new IllegalArgumentException("COSE key missing required fields");
                                                        }
                                                        long j4 = ((dww0) oww0Var.b(dww0.class)).f6819a;
                                                        jSONObject = jSONObject2;
                                                        if (j2 != 2) {
                                                            if (j2 == 1) {
                                                                bArrS = null;
                                                            } else {
                                                                bArrS = null;
                                                            }
                                                        } else if (j2 == 1) {
                                                            bArrS = null;
                                                        } else {
                                                            bArrS = null;
                                                        }
                                                        throw new IllegalArgumentException("COSE key ill-formed", e);
                                                    }
                                                    jSONObject = jSONObject2;
                                                    bArrS = null;
                                                    JSONObject jSONObject3 = jSONObject;
                                                    jSONObject3.put("authenticatorData", y0x0.G(vuw0Var2.l()));
                                                    jSONObject3.put("publicKeyAlgorithm", j);
                                                    if (bArrS != null) {
                                                        jSONObject3.put("publicKey", Base64.encodeToString(bArrS, 11));
                                                    }
                                                    return jSONObject3;
                                                } catch (kww0 e2) {
                                                    e = e2;
                                                }
                                            } catch (Throwable th) {
                                                try {
                                                    try {
                                                        tww0Var.close();
                                                    } catch (kww0 e3) {
                                                        e = e3;
                                                        throw new IllegalArgumentException("failed to parse COSE key", e);
                                                    }
                                                } catch (IOException unused2) {
                                                }
                                                try {
                                                    throw th;
                                                } catch (aww0 e4) {
                                                    e = e4;
                                                    throw new IllegalArgumentException("failed to parse COSE key", e);
                                                }
                                            }
                                        } catch (aww0 e5) {
                                            e = e5;
                                            throw new IllegalArgumentException("failed to parse COSE key", e);
                                        }
                                    } catch (kww0 e6) {
                                        e = e6;
                                        throw new IllegalArgumentException("failed to parse COSE key", e);
                                    }
                                    e9d0.m("Error encoding AuthenticatorAttestationResponse to JSON object", e);
                                    return null;
                                }
                                try {
                                    throw new IllegalArgumentException("authData does not include credential data");
                                } catch (IllegalArgumentException e7) {
                                    e = e7;
                                }
                            } catch (IllegalArgumentException e8) {
                                e = e8;
                            }
                            throw new IllegalArgumentException("ill-formed authenticator data", e);
                        }
                        try {
                            throw new IllegalArgumentException("attestation object missing authData");
                        } catch (kww0 e9) {
                            e = e9;
                        }
                    } catch (kww0 e10) {
                        e = e10;
                    }
                    throw new IllegalArgumentException("authData value has wrong type", e);
                } catch (aww0 e11) {
                    e = e11;
                    throw new IllegalArgumentException("failed to parse attestation object", e);
                } catch (kww0 e12) {
                    e = e12;
                    throw new IllegalArgumentException("failed to parse attestation object", e);
                }
            } catch (JSONException e13) {
                e = e13;
            }
        } catch (JSONException e14) {
            e = e14;
        }
    }

    public final String toString() {
        glt0 glt0Var = new glt0(getClass().getSimpleName());
        ktw0 ktw0Var = ntw0.d;
        byte[] bArrL = this.f45503a.l();
        glt0Var.k(ktw0Var.c(bArrL, bArrL.length), "keyHandle");
        byte[] bArrL2 = this.b.l();
        glt0Var.k(ktw0Var.c(bArrL2, bArrL2.length), "clientDataJSON");
        byte[] bArrL3 = this.c.l();
        glt0Var.k(ktw0Var.c(bArrL3, bArrL3.length), "attestationObject");
        glt0Var.k(Arrays.toString(this.d), "transports");
        return glt0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.e0(parcel, 2, this.f45503a.l());
        q5x.e0(parcel, 3, this.b.l());
        q5x.e0(parcel, 4, this.c.l());
        String[] strArr = this.d;
        if (strArr != null) {
            int iP1 = q5x.p0(parcel, 5);
            parcel.writeStringArray(strArr);
            q5x.q0(parcel, iP1);
        }
        q5x.q0(parcel, iP0);
    }
}
