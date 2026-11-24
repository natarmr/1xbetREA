package com.google.android.gms.internal.p000firebaseauthapi;

import a.axq;
import a.hne;
import a.jf4;
import a.lgw0;
import a.q5x;
import a.s0x;
import a.ufw0;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.support.feature.result.CommonConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajg extends AbstractSafeParcelable implements ufw0 {
    public static final Parcelable.Creator<zzajg> CREATOR = new lgw0(5);
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public boolean j;
    public String k;
    public String l;
    public String m;
    public String n;
    public boolean o;
    public String p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f45524a = "http://localhost";
    public boolean i = true;

    public zzajg(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.c = str;
        this.d = str2;
        this.h = str4;
        this.k = str5;
        this.n = str6;
        this.p = str7;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str5)) {
            jf4.o("idToken, accessToken and authCode cannot all be null");
            throw null;
        }
        s0x.E(str3);
        this.e = str3;
        this.f = null;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            hne.B(sb, "id_token=", str, "&");
        }
        if (!TextUtils.isEmpty(str2)) {
            hne.B(sb, "access_token=", str2, "&");
        }
        if (!TextUtils.isEmpty(null)) {
            sb.append("identifier=null&");
        }
        if (!TextUtils.isEmpty(str4)) {
            hne.B(sb, "oauth_token_secret=", str4, "&");
        }
        if (!TextUtils.isEmpty(str5)) {
            hne.B(sb, "code=", str5, "&");
        }
        if (!TextUtils.isEmpty(str8)) {
            hne.B(sb, "nonce=", str8, "&");
        }
        this.g = axq.n(sb, "providerId=", str3);
        this.j = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 2, this.f45524a);
        q5x.k0(parcel, 3, this.b);
        q5x.k0(parcel, 4, this.c);
        q5x.k0(parcel, 5, this.d);
        q5x.k0(parcel, 6, this.e);
        q5x.k0(parcel, 7, this.f);
        q5x.k0(parcel, 8, this.g);
        q5x.k0(parcel, 9, this.h);
        boolean z = this.i;
        q5x.o0(parcel, 10, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.j;
        q5x.o0(parcel, 11, 4);
        parcel.writeInt(z2 ? 1 : 0);
        q5x.k0(parcel, 12, this.k);
        q5x.k0(parcel, 13, this.l);
        q5x.k0(parcel, 14, this.m);
        q5x.k0(parcel, 15, this.n);
        boolean z3 = this.o;
        q5x.o0(parcel, 16, 4);
        parcel.writeInt(z3 ? 1 : 0);
        q5x.k0(parcel, 17, this.p);
        q5x.q0(parcel, iP0);
    }

    @Override // a.ufw0
    public final String zza() throws JSONException {
        String str = this.m;
        String str2 = this.l;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("autoCreate", this.j);
        jSONObject.put("returnSecureToken", this.i);
        String str3 = this.b;
        if (str3 != null) {
            jSONObject.put(CommonConstant.KEY_ID_TOKEN, str3);
        }
        String str4 = this.g;
        if (str4 != null) {
            jSONObject.put("postBody", str4);
        }
        String str5 = this.n;
        if (str5 != null) {
            jSONObject.put("tenantId", str5);
        }
        String str6 = this.p;
        if (str6 != null) {
            jSONObject.put("pendingToken", str6);
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("sessionId", str2);
        }
        if (TextUtils.isEmpty(str)) {
            String str7 = this.f45524a;
            if (str7 != null) {
                jSONObject.put("requestUri", str7);
            }
        } else {
            jSONObject.put("requestUri", str);
        }
        jSONObject.put("returnIdpCredential", this.o);
        return jSONObject.toString();
    }
}
