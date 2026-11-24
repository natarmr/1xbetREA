package com.google.android.gms.signin.internal;

import a.equ0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zaaa;

/* JADX INFO: loaded from: classes2.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new equ0(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45554a;
    public final ConnectionResult b;
    public final zaaa c;

    public zak(int i, ConnectionResult connectionResult, zaaa zaaaVar) {
        this.f45554a = i;
        this.b = connectionResult;
        this.c = zaaaVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 4);
        parcel.writeInt(this.f45554a);
        q5x.j0(parcel, 2, this.b, i);
        q5x.j0(parcel, 3, this.c, i);
        q5x.q0(parcel, iP0);
    }
}
