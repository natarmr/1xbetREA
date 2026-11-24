package com.google.android.gms.common.internal;

import a.lgw0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new lgw0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45491a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public RootTelemetryConfiguration(int i, int i2, int i3, boolean z, boolean z2) {
        this.f45491a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 4);
        parcel.writeInt(this.f45491a);
        q5x.o0(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        q5x.o0(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        q5x.o0(parcel, 4, 4);
        parcel.writeInt(this.d);
        q5x.o0(parcel, 5, 4);
        parcel.writeInt(this.e);
        q5x.q0(parcel, iP0);
    }
}
