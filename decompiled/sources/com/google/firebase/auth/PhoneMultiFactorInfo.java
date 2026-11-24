package com.google.firebase.auth;

import a.jf4;
import a.kcw0;
import a.lgw0;
import a.q5x;
import a.s0x;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.huawei.hms.support.feature.result.CommonConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class PhoneMultiFactorInfo extends MultiFactorInfo {
    public static final Parcelable.Creator<PhoneMultiFactorInfo> CREATOR = new lgw0(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45648a;
    public final String b;
    public final long c;
    public final String d;

    public PhoneMultiFactorInfo(long j, String str, String str2, String str3) {
        s0x.E(str);
        this.f45648a = str;
        this.b = str2;
        this.c = j;
        s0x.E(str3);
        this.d = str3;
    }

    public static PhoneMultiFactorInfo p(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            jf4.o("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
            return null;
        }
        return new PhoneMultiFactorInfo(jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString(CommonConstant.KEY_UID), jSONObject.optString(CommonConstant.KEY_DISPLAY_NAME), jSONObject.optString("phoneNumber"));
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final JSONObject o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt(CommonConstant.KEY_UID, this.f45648a);
            jSONObject.putOpt(CommonConstant.KEY_DISPLAY_NAME, this.b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.c));
            jSONObject.putOpt("phoneNumber", this.d);
            return jSONObject;
        } catch (JSONException e) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new kcw0(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 1, this.f45648a);
        q5x.k0(parcel, 2, this.b);
        q5x.o0(parcel, 3, 8);
        parcel.writeLong(this.c);
        q5x.k0(parcel, 4, this.d);
        q5x.q0(parcel, iP0);
    }
}
