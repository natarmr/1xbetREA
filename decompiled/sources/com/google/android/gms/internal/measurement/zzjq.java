package com.google.android.gms.internal.measurement;

import a.erw0;
import a.j5n0;
import a.q5x;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjq> CREATOR = new erw0((byte) 13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45532a;
    public final String b;
    public final zzjo c;
    public final boolean d;

    public zzjq(String str, String str2, zzjo zzjoVar, boolean z) {
        this.f45532a = str;
        this.b = str2;
        this.c = zzjoVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjq)) {
            return false;
        }
        zzjq zzjqVar = (zzjq) obj;
        return j5n0.D(this.f45532a, zzjqVar.f45532a) && j5n0.D(this.b, zzjqVar.b) && j5n0.D(this.c, zzjqVar.c) && this.d == zzjqVar.d;
    }

    public final void m(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.f45532a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        this.c.m(sb);
        sb.append(", ");
        sb.append(this.d);
        sb.append(Separators.RPAREN);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 2, this.f45532a);
        q5x.k0(parcel, 3, this.b);
        q5x.j0(parcel, 4, this.c, i);
        q5x.o0(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        q5x.q0(parcel, iP0);
    }
}
