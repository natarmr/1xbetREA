package com.google.android.gms.measurement.internal;

import a.erw0;
import a.q5x;
import a.s0x;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new erw0((byte) 28);
    public final long A;
    public final String B;
    public final String Y;
    public final long Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45550a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final int f1;
    public final String g;
    public final long g1;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final String k;
    public final long l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final Boolean p;
    public final long q;
    public final List r;
    public final String s;
    public final String t;
    public final String u;
    public final boolean v;
    public final long w;
    public final int x;
    public final String y;
    public final int z;

    public zzr(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        s0x.E(str);
        this.f45550a = str;
        this.b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.c = str3;
        this.j = j;
        this.d = str4;
        this.e = j2;
        this.f = j3;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j4;
        this.m = i;
        this.n = z3;
        this.o = z4;
        this.p = bool;
        this.q = j5;
        this.r = list;
        this.s = str7;
        this.t = str8;
        this.u = str9;
        this.v = z5;
        this.w = j6;
        this.x = i2;
        this.y = str10;
        this.z = i3;
        this.A = j7;
        this.B = str11;
        this.Y = str12;
        this.Z = j8;
        this.f1 = i4;
        this.g1 = j9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 2, this.f45550a);
        q5x.k0(parcel, 3, this.b);
        q5x.k0(parcel, 4, this.c);
        q5x.k0(parcel, 5, this.d);
        q5x.o0(parcel, 6, 8);
        parcel.writeLong(this.e);
        q5x.o0(parcel, 7, 8);
        parcel.writeLong(this.f);
        q5x.k0(parcel, 8, this.g);
        q5x.o0(parcel, 9, 4);
        parcel.writeInt(this.h ? 1 : 0);
        q5x.o0(parcel, 10, 4);
        parcel.writeInt(this.i ? 1 : 0);
        q5x.o0(parcel, 11, 8);
        parcel.writeLong(this.j);
        q5x.k0(parcel, 12, this.k);
        q5x.o0(parcel, 14, 8);
        parcel.writeLong(this.l);
        q5x.o0(parcel, 15, 4);
        parcel.writeInt(this.m);
        q5x.o0(parcel, 16, 4);
        parcel.writeInt(this.n ? 1 : 0);
        q5x.o0(parcel, 18, 4);
        parcel.writeInt(this.o ? 1 : 0);
        q5x.c0(parcel, 21, this.p);
        q5x.o0(parcel, 22, 8);
        parcel.writeLong(this.q);
        q5x.l0(parcel, 23, this.r);
        q5x.k0(parcel, 25, this.s);
        q5x.k0(parcel, 26, this.t);
        q5x.k0(parcel, 27, this.u);
        q5x.o0(parcel, 28, 4);
        parcel.writeInt(this.v ? 1 : 0);
        q5x.o0(parcel, 29, 8);
        parcel.writeLong(this.w);
        q5x.o0(parcel, 30, 4);
        parcel.writeInt(this.x);
        q5x.k0(parcel, 31, this.y);
        q5x.o0(parcel, 32, 4);
        parcel.writeInt(this.z);
        q5x.o0(parcel, 34, 8);
        parcel.writeLong(this.A);
        q5x.k0(parcel, 35, this.B);
        q5x.k0(parcel, 36, this.Y);
        q5x.o0(parcel, 37, 8);
        parcel.writeLong(this.Z);
        q5x.o0(parcel, 38, 4);
        parcel.writeInt(this.f1);
        q5x.o0(parcel, 39, 8);
        parcel.writeLong(this.g1);
        q5x.q0(parcel, iP0);
    }

    public zzr(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, ArrayList arrayList, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        this.f45550a = str;
        this.b = str2;
        this.c = str3;
        this.j = j3;
        this.d = str4;
        this.e = j;
        this.f = j2;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j4;
        this.m = i;
        this.n = z3;
        this.o = z4;
        this.p = bool;
        this.q = j5;
        this.r = arrayList;
        this.s = str7;
        this.t = str8;
        this.u = str9;
        this.v = z5;
        this.w = j6;
        this.x = i2;
        this.y = str10;
        this.z = i3;
        this.A = j7;
        this.B = str11;
        this.Y = str12;
        this.Z = j8;
        this.f1 = i4;
        this.g1 = j9;
    }
}
