package com.google.android.gms.internal.p000firebaseauthapi;

import a.kcw0;
import a.knm0;
import a.ktm0;
import a.lgw0;
import a.q5x;
import a.udw0;
import a.xfw0;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class zzaia extends AbstractSafeParcelable implements xfw0 {
    public static final Parcelable.Creator<zzaia> CREATOR = new lgw0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f45523a;
    public String b;
    public Long c;
    public String d;
    public Long e;

    public zzaia(Long l, String str, String str2) {
        this(l, Long.valueOf(System.currentTimeMillis()), str, str2, "Bearer");
    }

    public static zzaia m(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzaia zzaiaVar = new zzaia();
            zzaiaVar.f45523a = jSONObject.optString("refresh_token", null);
            zzaiaVar.b = jSONObject.optString("access_token", null);
            zzaiaVar.c = Long.valueOf(jSONObject.optLong("expires_in"));
            zzaiaVar.d = jSONObject.optString("token_type", null);
            zzaiaVar.e = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzaiaVar;
        } catch (JSONException e) {
            Log.d("zzaia", "Failed to read GetTokenResponse from JSONObject");
            throw new kcw0(e);
        }
    }

    public final String o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.f45523a);
            jSONObject.put("access_token", this.b);
            jSONObject.put("expires_in", this.c);
            jSONObject.put("token_type", this.d);
            jSONObject.put("issued_at", this.e);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.d("zzaia", "Failed to convert GetTokenResponse to JSON");
            throw new kcw0(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 2, this.f45523a);
        q5x.k0(parcel, 3, this.b);
        Long l = this.c;
        q5x.i0(parcel, 4, Long.valueOf(l == null ? 0L : l.longValue()));
        q5x.k0(parcel, 5, this.d);
        Long l2 = this.e;
        l2.getClass();
        q5x.i0(parcel, 6, l2);
        q5x.q0(parcel, iP0);
    }

    @Override // a.xfw0
    public final xfw0 zza(String str) throws udw0 {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f45523a = ktm0.a(jSONObject.optString("refresh_token"));
            this.b = ktm0.a(jSONObject.optString("access_token"));
            this.c = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.d = ktm0.a(jSONObject.optString("token_type"));
            this.e = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e) {
            throw knm0.w(e, "zzaia", str);
        }
    }

    public final boolean zzg() {
        return System.currentTimeMillis() + 300000 < (this.c.longValue() * 1000) + this.e.longValue();
    }

    public zzaia(Long l, Long l2, String str, String str2, String str3) {
        this.f45523a = str;
        this.b = str2;
        this.c = l;
        this.d = str3;
        this.e = l2;
    }

    public zzaia() {
        this.e = Long.valueOf(System.currentTimeMillis());
    }
}
