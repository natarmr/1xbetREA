package com.google.android.gms.fido.fido2.api.common;

import a.e9d0;
import a.erw0;
import a.kng0;
import a.l8x;
import a.q5x;
import a.vuw0;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new erw0((byte) 6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f45510a;
    public final vuw0 b;

    public zzh(boolean z, vuw0 vuw0Var) {
        this.f45510a = z;
        this.b = vuw0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return this.f45510a == zzhVar.f45510a && l8x.Z(this.b, zzhVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f45510a), this.b});
    }

    public final JSONObject m() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f45510a) {
                jSONObject.put("enabled", true);
            }
            vuw0 vuw0Var = this.b;
            byte[] bArrL = vuw0Var == null ? null : vuw0Var.l();
            if (bArrL != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(bArrL, 32), 11));
                if (bArrL.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(bArrL, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            e9d0.m("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
            return null;
        }
    }

    public final String toString() {
        return kng0.l("AuthenticationExtensionsPrfOutputs{", m().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 4);
        parcel.writeInt(this.f45510a ? 1 : 0);
        vuw0 vuw0Var = this.b;
        q5x.e0(parcel, 2, vuw0Var == null ? null : vuw0Var.l());
        q5x.q0(parcel, iP0);
    }
}
