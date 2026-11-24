package com.google.android.gms.measurement.internal;

import a.equ0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new equ0((byte) 28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45540a;
    public final int b;
    public final long c;

    public zzaf(int i, long j, long j2) {
        this.f45540a = j;
        this.b = i;
        this.c = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 8);
        parcel.writeLong(this.f45540a);
        q5x.o0(parcel, 2, 4);
        parcel.writeInt(this.b);
        q5x.o0(parcel, 3, 8);
        parcel.writeLong(this.c);
        q5x.q0(parcel, iP0);
    }
}
