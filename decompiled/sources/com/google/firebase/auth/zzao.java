package com.google.firebase.auth;

import a.ejw0;
import a.gnm0;
import a.hhw0;
import a.lgw0;
import a.q5x;
import a.ulw0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new lgw0(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45660a;
    public final String b;
    public final String c;

    public zzao(String str, String str2, String str3) {
        this.f45660a = str;
        this.b = str2;
        this.c = str3;
    }

    public static ulw0 m(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            ejw0 ejw0Var = hhw0.e;
            return ulw0.h;
        }
        ejw0 ejw0Var2 = hhw0.e;
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (i < jSONArray.length()) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            zzao zzaoVar = new zzao(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString(CommonConstant.KEY_DISPLAY_NAME));
            int iA = gnm0.A(objArrCopyOf.length, i2 + 1);
            if (iA > objArrCopyOf.length || z) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iA);
                z = false;
            }
            objArrCopyOf[i2] = zzaoVar;
            i++;
            i2++;
        }
        return i2 == 0 ? ulw0.h : new ulw0(i2, objArrCopyOf);
    }

    public static final zzao o(JSONObject jSONObject) {
        return new zzao(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString(CommonConstant.KEY_DISPLAY_NAME));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 1, this.f45660a);
        q5x.k0(parcel, 2, this.b);
        q5x.k0(parcel, 3, this.c);
        q5x.q0(parcel, iP0);
    }
}
