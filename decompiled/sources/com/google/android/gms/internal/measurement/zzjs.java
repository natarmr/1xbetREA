package com.google.android.gms.internal.measurement;

import a.erw0;
import a.q5x;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjs> CREATOR = new erw0((byte) 14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f45533a;

    public zzjs(ArrayList arrayList) {
        this.f45533a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzjs) {
            return this.f45533a.equals(((zzjs) obj).f45533a);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (zzjq zzjqVar : this.f45533a) {
            if (!z) {
                sb.append(", ");
            }
            zzjqVar.m(sb);
            z = false;
        }
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.n0(parcel, 2, this.f45533a);
        q5x.q0(parcel, iP0);
    }
}
