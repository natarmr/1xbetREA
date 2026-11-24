package com.google.android.gms.common.internal;

import a.equ0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new equ0(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45490a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    public MethodInvocation(int i, int i2, int i3, int i4, int i5, long j, long j2, String str, String str2) {
        this.f45490a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 4);
        parcel.writeInt(this.f45490a);
        q5x.o0(parcel, 2, 4);
        parcel.writeInt(this.b);
        q5x.o0(parcel, 3, 4);
        parcel.writeInt(this.c);
        q5x.o0(parcel, 4, 8);
        parcel.writeLong(this.d);
        q5x.o0(parcel, 5, 8);
        parcel.writeLong(this.e);
        q5x.k0(parcel, 6, this.f);
        q5x.k0(parcel, 7, this.g);
        q5x.o0(parcel, 8, 4);
        parcel.writeInt(this.h);
        q5x.o0(parcel, 9, 4);
        parcel.writeInt(this.i);
        q5x.q0(parcel, iP0);
    }
}
