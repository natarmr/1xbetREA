package com.google.firebase.auth;

import a.jf4;
import a.kcw0;
import a.lgw0;
import a.q5x;
import a.s0x;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.zzaje;
import com.huawei.hms.support.feature.result.CommonConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TotpMultiFactorInfo extends MultiFactorInfo {
    public static final Parcelable.Creator<TotpMultiFactorInfo> CREATOR = new lgw0(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45650a;
    public final String b;
    public final long c;
    public final zzaje d;

    public TotpMultiFactorInfo(String str, String str2, long j, zzaje zzajeVar) {
        s0x.E(str);
        this.f45650a = str;
        this.b = str2;
        this.c = j;
        s0x.I(zzajeVar, "totpInfo cannot be null.");
        this.d = zzajeVar;
    }

    public static TotpMultiFactorInfo p(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            jf4.o("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
            return null;
        }
        long jOptLong = jSONObject.optLong("enrollmentTimestamp");
        if (jSONObject.opt("totpInfo") != null) {
            return new TotpMultiFactorInfo(jSONObject.optString(CommonConstant.KEY_UID), jSONObject.optString(CommonConstant.KEY_DISPLAY_NAME), jOptLong, new zzaje());
        }
        jf4.o("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        return null;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final String m() {
        return "totp";
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final JSONObject o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt(CommonConstant.KEY_UID, this.f45650a);
            jSONObject.putOpt(CommonConstant.KEY_DISPLAY_NAME, this.b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.c));
            jSONObject.putOpt("totpInfo", this.d);
            return jSONObject;
        } catch (JSONException e) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new kcw0(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 1, this.f45650a);
        q5x.k0(parcel, 2, this.b);
        q5x.o0(parcel, 3, 8);
        parcel.writeLong(this.c);
        q5x.j0(parcel, 4, this.d, i);
        q5x.q0(parcel, iP0);
    }
}
