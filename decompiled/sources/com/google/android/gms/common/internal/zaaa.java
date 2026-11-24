package com.google.android.gms.common.internal;

import a.equ0;
import a.fc;
import a.guw;
import a.l8x;
import a.q5x;
import a.s9x0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zaaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaaa> CREATOR = new equ0((byte) 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45493a;
    public final IBinder b;
    public final ConnectionResult c;
    public final boolean d;
    public final boolean e;

    public zaaa(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f45493a = i;
        this.b = iBinder;
        this.c = connectionResult;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        Object s9x0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaaa)) {
            return false;
        }
        zaaa zaaaVar = (zaaa) obj;
        if (!this.c.equals(zaaaVar.c)) {
            return false;
        }
        Object s9x0Var2 = null;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            s9x0Var = null;
        } else {
            int i = fc.b;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            s9x0Var = iInterfaceQueryLocalInterface instanceof guw ? (guw) iInterfaceQueryLocalInterface : new s9x0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 3);
        }
        IBinder iBinder2 = zaaaVar.b;
        if (iBinder2 != null) {
            int i2 = fc.b;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            s9x0Var2 = iInterfaceQueryLocalInterface2 instanceof guw ? (guw) iInterfaceQueryLocalInterface2 : new s9x0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", (byte) 3);
        }
        return l8x.Z(s9x0Var, s9x0Var2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 4);
        parcel.writeInt(this.f45493a);
        q5x.g0(parcel, 2, this.b);
        q5x.j0(parcel, 3, this.c, i);
        q5x.o0(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        q5x.o0(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        q5x.q0(parcel, iP0);
    }
}
