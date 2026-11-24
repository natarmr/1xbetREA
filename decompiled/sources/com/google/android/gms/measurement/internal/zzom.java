package com.google.android.gms.measurement.internal;

import a.erw0;
import a.q5x;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzom extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzom> CREATOR = new erw0((byte) 22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45546a;
    public byte[] b;
    public final String c;
    public final Bundle d;
    public final int e;
    public final long f;
    public String g;

    public zzom(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.f45546a = j;
        this.b = bArr;
        this.c = str;
        this.d = bundle;
        this.e = i;
        this.f = j2;
        this.g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 8);
        parcel.writeLong(this.f45546a);
        q5x.e0(parcel, 2, this.b);
        q5x.k0(parcel, 3, this.c);
        q5x.d0(parcel, 4, this.d);
        q5x.o0(parcel, 5, 4);
        parcel.writeInt(this.e);
        q5x.o0(parcel, 6, 8);
        parcel.writeLong(this.f);
        q5x.k0(parcel, 7, this.g);
        q5x.q0(parcel, iP0);
    }
}
