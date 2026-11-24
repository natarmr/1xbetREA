package com.google.firebase.auth.internal;

import a.equ0;
import a.kcw0;
import a.lrt0;
import a.q5x;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.support.feature.result.CommonConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzz extends AbstractSafeParcelable implements lrt0 {
    public static final Parcelable.Creator<zzz> CREATOR = new equ0(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f45659a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public String h;

    public zzz(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7) {
        this.f45659a = str;
        this.b = str2;
        this.e = str3;
        this.f = str4;
        this.c = str5;
        this.d = str6;
        if (!TextUtils.isEmpty(str6)) {
            Uri.parse(str6);
        }
        this.g = z;
        this.h = str7;
    }

    public static zzz m(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new zzz(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString(CommonConstant.KEY_DISPLAY_NAME), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new kcw0(e);
        }
    }

    @Override // a.lrt0
    public final String i() {
        return this.b;
    }

    public final String o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f45659a);
            jSONObject.putOpt("providerId", this.b);
            jSONObject.putOpt(CommonConstant.KEY_DISPLAY_NAME, this.c);
            jSONObject.putOpt("photoUrl", this.d);
            jSONObject.putOpt("email", this.e);
            jSONObject.putOpt("phoneNumber", this.f);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.g));
            jSONObject.putOpt("rawUserInfo", this.h);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new kcw0(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 1, this.f45659a);
        q5x.k0(parcel, 2, this.b);
        q5x.k0(parcel, 3, this.c);
        q5x.k0(parcel, 4, this.d);
        q5x.k0(parcel, 5, this.e);
        q5x.k0(parcel, 6, this.f);
        boolean z = this.g;
        q5x.o0(parcel, 7, 4);
        parcel.writeInt(z ? 1 : 0);
        q5x.k0(parcel, 8, this.h);
        q5x.q0(parcel, iP0);
    }
}
