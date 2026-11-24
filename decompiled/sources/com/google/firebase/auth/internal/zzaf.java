package com.google.firebase.auth.internal;

import a.lgw0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaf implements SafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new lgw0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45653a;
    public final long b;

    public zzaf(long j, long j2) {
        this.f45653a = j;
        this.b = j2;
    }

    public static zzaf a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new zzaf(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 8);
        parcel.writeLong(this.f45653a);
        q5x.o0(parcel, 2, 8);
        parcel.writeLong(this.b);
        q5x.q0(parcel, iP0);
    }
}
