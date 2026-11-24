package com.google.android.gms.common.internal;

import a.equ0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zab> CREATOR = new equ0((byte) 12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45494a;
    public final String b;
    public final long c;
    public final int d;
    public final boolean e;

    public zab(int i, int i2, long j, String str, boolean z) {
        this.f45494a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 4);
        parcel.writeInt(this.f45494a);
        q5x.k0(parcel, 2, this.b);
        q5x.o0(parcel, 3, 8);
        parcel.writeLong(this.c);
        q5x.o0(parcel, 4, 4);
        parcel.writeInt(this.d);
        q5x.o0(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        q5x.q0(parcel, iP0);
    }
}
