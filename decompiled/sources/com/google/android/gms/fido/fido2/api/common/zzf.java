package com.google.android.gms.fido.fido2.api.common;

import a.erw0;
import a.l8x;
import a.q5x;
import a.vuw0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new erw0((byte) 4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vuw0 f45509a;
    public final vuw0 b;

    public zzf(vuw0 vuw0Var, vuw0 vuw0Var2) {
        this.f45509a = vuw0Var;
        this.b = vuw0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        return l8x.Z(this.f45509a, zzfVar.f45509a) && l8x.Z(this.b, zzfVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45509a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        vuw0 vuw0Var = this.f45509a;
        q5x.e0(parcel, 1, vuw0Var == null ? null : vuw0Var.l());
        vuw0 vuw0Var2 = this.b;
        q5x.e0(parcel, 2, vuw0Var2 != null ? vuw0Var2.l() : null);
        q5x.q0(parcel, iP0);
    }
}
