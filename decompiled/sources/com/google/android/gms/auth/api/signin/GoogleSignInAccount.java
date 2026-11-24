package com.google.android.gms.auth.api.signin;

import a.equ0;
import a.q5x;
import a.s0x;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new equ0(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45472a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public String f;
    public final long g;
    public final String h;
    public final List i;
    public final String j;
    public final String k;
    public final HashSet l = new HashSet();

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f45472a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.g = j;
        this.h = str6;
        this.i = arrayList;
        this.j = str7;
        this.k = str8;
    }

    public static GoogleSignInAccount m(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray(CommonConstant.KEY_GRANTED_SCOPES);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString(ParameterNames.ID);
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has(CommonConstant.KEY_DISPLAY_NAME) ? jSONObject.optString(CommonConstant.KEY_DISPLAY_NAME) : null;
        String strOptString6 = jSONObject.has(CommonConstant.KEY_GIVEN_NAME) ? jSONObject.optString(CommonConstant.KEY_GIVEN_NAME) : null;
        String strOptString7 = jSONObject.has(CommonConstant.KEY_FAMILY_NAME) ? jSONObject.optString(CommonConstant.KEY_FAMILY_NAME) : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        s0x.E(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f = jSONObject.has(CommonConstant.KEY_SERVER_AUTH_CODE) ? jSONObject.optString(CommonConstant.KEY_SERVER_AUTH_CODE) : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.h.equals(this.h)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.i);
        hashSet.addAll(googleSignInAccount.l);
        HashSet hashSet2 = new HashSet(this.i);
        hashSet2.addAll(this.l);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.h.hashCode() + 527;
        HashSet hashSet = new HashSet(this.i);
        hashSet.addAll(this.l);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 2, this.f45472a);
        q5x.k0(parcel, 3, this.b);
        q5x.k0(parcel, 4, this.c);
        q5x.k0(parcel, 5, this.d);
        q5x.j0(parcel, 6, this.e, i);
        q5x.k0(parcel, 7, this.f);
        q5x.o0(parcel, 8, 8);
        parcel.writeLong(this.g);
        q5x.k0(parcel, 9, this.h);
        q5x.n0(parcel, 10, this.i);
        q5x.k0(parcel, 11, this.j);
        q5x.k0(parcel, 12, this.k);
        q5x.q0(parcel, iP0);
    }
}
