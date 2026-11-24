package com.google.android.gms.common;

import a.erw0;
import a.etm0;
import a.hfm0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new erw0((byte) 27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f45498a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;

    public zzr(int i, int i2, long j, String str, boolean z) {
        this.f45498a = z;
        this.b = str;
        this.c = hfm0.I(i) - 1;
        this.d = etm0.x(i2) - 1;
        this.e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 4);
        parcel.writeInt(this.f45498a ? 1 : 0);
        q5x.k0(parcel, 2, this.b);
        q5x.o0(parcel, 3, 4);
        parcel.writeInt(this.c);
        q5x.o0(parcel, 4, 4);
        parcel.writeInt(this.d);
        q5x.o0(parcel, 5, 8);
        parcel.writeLong(this.e);
        q5x.q0(parcel, iP0);
    }
}
