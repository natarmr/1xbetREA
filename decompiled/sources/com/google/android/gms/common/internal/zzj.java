package com.google.android.gms.common.internal;

import a.erw0;
import a.q5x;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new erw0((byte) 16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f45496a;
    public Feature[] b;
    public int c;
    public ConnectionTelemetryConfiguration d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.d0(parcel, 1, this.f45496a);
        q5x.m0(parcel, 2, this.b, i);
        int i2 = this.c;
        q5x.o0(parcel, 3, 4);
        parcel.writeInt(i2);
        q5x.j0(parcel, 4, this.d, i);
        q5x.q0(parcel, iP0);
    }
}
