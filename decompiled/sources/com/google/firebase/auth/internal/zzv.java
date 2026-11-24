package com.google.firebase.auth.internal;

import a.q5x;
import a.rmw0;
import a.s0x;
import a.zcx0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzv implements SafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new zcx0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45657a;
    public final String b;
    public final boolean c;

    public zzv(String str, String str2, boolean z) {
        s0x.E(str);
        s0x.E(str2);
        this.f45657a = str;
        this.b = str2;
        rmw0.d(str2);
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 1, this.f45657a);
        q5x.k0(parcel, 2, this.b);
        q5x.o0(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        q5x.q0(parcel, iP0);
    }

    public zzv(boolean z) {
        this.c = z;
        this.b = null;
        this.f45657a = null;
    }
}
