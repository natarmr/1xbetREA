package com.google.android.gms.measurement.internal;

import a.lgw0;
import a.q5x;
import a.s0x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new lgw0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f45541a;
    public String b;
    public zzpl c;
    public long d;
    public boolean e;
    public String f;
    public final zzbh g;
    public long h;
    public zzbh i;
    public final long j;
    public final zzbh k;

    public zzah(zzah zzahVar) {
        s0x.H(zzahVar);
        this.f45541a = zzahVar.f45541a;
        this.b = zzahVar.b;
        this.c = zzahVar.c;
        this.d = zzahVar.d;
        this.e = zzahVar.e;
        this.f = zzahVar.f;
        this.g = zzahVar.g;
        this.h = zzahVar.h;
        this.i = zzahVar.i;
        this.j = zzahVar.j;
        this.k = zzahVar.k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 2, this.f45541a);
        q5x.k0(parcel, 3, this.b);
        q5x.j0(parcel, 4, this.c, i);
        long j = this.d;
        q5x.o0(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.e;
        q5x.o0(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        q5x.k0(parcel, 7, this.f);
        q5x.j0(parcel, 8, this.g, i);
        long j2 = this.h;
        q5x.o0(parcel, 9, 8);
        parcel.writeLong(j2);
        q5x.j0(parcel, 10, this.i, i);
        q5x.o0(parcel, 11, 8);
        parcel.writeLong(this.j);
        q5x.j0(parcel, 12, this.k, i);
        q5x.q0(parcel, iP0);
    }

    public zzah(String str, String str2, zzpl zzplVar, long j, boolean z, String str3, zzbh zzbhVar, long j2, zzbh zzbhVar2, long j3, zzbh zzbhVar3) {
        this.f45541a = str;
        this.b = str2;
        this.c = zzplVar;
        this.d = j;
        this.e = z;
        this.f = str3;
        this.g = zzbhVar;
        this.h = j2;
        this.i = zzbhVar2;
        this.j = j3;
        this.k = zzbhVar3;
    }
}
