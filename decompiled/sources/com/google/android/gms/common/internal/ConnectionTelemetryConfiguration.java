package com.google.android.gms.common.internal;

import a.erw0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new erw0((byte) 18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RootTelemetryConfiguration f45488a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f45488a = rootTelemetryConfiguration;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.j0(parcel, 1, this.f45488a, i);
        q5x.o0(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        q5x.o0(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        q5x.h0(parcel, 4, this.d);
        q5x.o0(parcel, 5, 4);
        parcel.writeInt(this.e);
        q5x.h0(parcel, 6, this.f);
        q5x.q0(parcel, iP0);
    }
}
