package com.google.android.gms.fido.fido2.api.common;

import a.e9d0;
import a.kng0;
import a.l8x;
import a.lgw0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new lgw0(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UvmEntries f45500a;
    public final zzf b;
    public final AuthenticationExtensionsCredPropsOutputs c;
    public final zzh d;
    public final String e;

    public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, zzf zzfVar, AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, zzh zzhVar, String str) {
        this.f45500a = uvmEntries;
        this.b = zzfVar;
        this.c = authenticationExtensionsCredPropsOutputs;
        this.d = zzhVar;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        return l8x.Z(this.f45500a, authenticationExtensionsClientOutputs.f45500a) && l8x.Z(this.b, authenticationExtensionsClientOutputs.b) && l8x.Z(this.c, authenticationExtensionsClientOutputs.c) && l8x.Z(this.d, authenticationExtensionsClientOutputs.d) && l8x.Z(this.e, authenticationExtensionsClientOutputs.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45500a, this.b, this.c, this.d, this.e});
    }

    public final JSONObject m() {
        try {
            JSONObject jSONObject = new JSONObject();
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.c;
            if (authenticationExtensionsCredPropsOutputs != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", authenticationExtensionsCredPropsOutputs.f45501a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            UvmEntries uvmEntries = this.f45500a;
            if (uvmEntries != null) {
                jSONObject.put("uvm", uvmEntries.m());
            }
            zzh zzhVar = this.d;
            if (zzhVar != null) {
                jSONObject.put("prf", zzhVar.m());
            }
            String str = this.e;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e2) {
            e9d0.m("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e2);
            return null;
        }
    }

    public final String toString() {
        return kng0.l("AuthenticationExtensionsClientOutputs{", m().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.j0(parcel, 1, this.f45500a, i);
        q5x.j0(parcel, 2, this.b, i);
        q5x.j0(parcel, 3, this.c, i);
        q5x.j0(parcel, 4, this.d, i);
        q5x.k0(parcel, 5, this.e);
        q5x.q0(parcel, iP0);
    }
}
