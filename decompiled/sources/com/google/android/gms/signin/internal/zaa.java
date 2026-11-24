package com.google.android.gms.signin.internal;

import a.equ0;
import a.m0g0;
import a.q5x;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zaa extends AbstractSafeParcelable implements m0g0 {
    public static final Parcelable.Creator<zaa> CREATOR = new equ0(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45551a;
    public final int b;
    public final Intent c;

    public zaa(int i, int i2, Intent intent) {
        this.f45551a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // a.m0g0
    public final Status b() {
        return this.b == 0 ? Status.e : Status.i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 4);
        parcel.writeInt(this.f45551a);
        q5x.o0(parcel, 2, 4);
        parcel.writeInt(this.b);
        q5x.j0(parcel, 3, this.c, i);
        q5x.q0(parcel, iP0);
    }
}
