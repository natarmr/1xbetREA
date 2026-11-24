package com.google.android.gms.internal.measurement;

import a.lgw0;
import a.q5x;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdb> CREATOR = new lgw0(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45525a;
    public final long b;
    public final boolean c;
    public final Bundle d;
    public final String e;

    public zzdb(long j, long j2, boolean z, Bundle bundle, String str) {
        this.f45525a = j;
        this.b = j2;
        this.c = z;
        this.d = bundle;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 8);
        parcel.writeLong(this.f45525a);
        q5x.o0(parcel, 2, 8);
        parcel.writeLong(this.b);
        q5x.o0(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        q5x.d0(parcel, 7, this.d);
        q5x.k0(parcel, 8, this.e);
        q5x.q0(parcel, iP0);
    }
}
