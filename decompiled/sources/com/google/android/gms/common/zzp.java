package com.google.android.gms.common;

import a.aa60;
import a.erw0;
import a.q5x;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new erw0((byte) 26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45497a;
    public final boolean b;
    public final boolean c;
    public final Context d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public zzp(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4, boolean z5) {
        this.f45497a = str;
        this.b = z;
        this.c = z2;
        this.d = (Context) aa60.H(aa60.G(iBinder));
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 1, this.f45497a);
        q5x.o0(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        q5x.o0(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        q5x.g0(parcel, 4, new aa60(this.d));
        q5x.o0(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        q5x.o0(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        q5x.o0(parcel, 8, 4);
        parcel.writeInt(this.g ? 1 : 0);
        q5x.q0(parcel, iP0);
    }
}
