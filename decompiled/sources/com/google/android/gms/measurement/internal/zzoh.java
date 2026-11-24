package com.google.android.gms.measurement.internal;

import a.erw0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzoh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoh> CREATOR = new erw0(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45545a;
    public final long b;
    public final int c;

    public zzoh(String str, long j, int i) {
        this.f45545a = str;
        this.b = j;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 1, this.f45545a);
        q5x.o0(parcel, 2, 8);
        parcel.writeLong(this.b);
        q5x.o0(parcel, 3, 4);
        parcel.writeInt(this.c);
        q5x.q0(parcel, iP0);
    }
}
