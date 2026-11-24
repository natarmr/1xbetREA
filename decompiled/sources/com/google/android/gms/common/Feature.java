package com.google.android.gms.common;

import a.dq00;
import a.l8x;
import a.lgw0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new lgw0(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45481a;
    public final int b;
    public final long c;
    public final boolean d;

    public Feature(int i, long j, String str, boolean z) {
        this.f45481a = str;
        this.b = i;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (l8x.Z(this.f45481a, feature.f45481a) && m() == feature.m() && this.d == feature.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45481a, Long.valueOf(m()), Boolean.valueOf(this.d)});
    }

    public final long m() {
        long j = this.c;
        return j == -1 ? this.b : j;
    }

    public final String toString() {
        dq00 dq00Var = new dq00(this);
        dq00Var.a(this.f45481a, "name");
        dq00Var.a(Long.valueOf(m()), "version");
        dq00Var.a(Boolean.valueOf(this.d), "is_fully_rolled_out");
        return dq00Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 1, this.f45481a);
        q5x.o0(parcel, 2, 4);
        parcel.writeInt(this.b);
        long jM = m();
        q5x.o0(parcel, 3, 8);
        parcel.writeLong(jM);
        q5x.o0(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        q5x.q0(parcel, iP0);
    }

    public Feature(String str, long j) {
        this(-1, j, str, false);
    }
}
