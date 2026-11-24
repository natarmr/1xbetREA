package com.google.android.gms.measurement.internal;

import a.erw0;
import a.jf4;
import a.s0x;
import a.v6x0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpl> CREATOR = new erw0((byte) 25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45549a;
    public final String b;
    public final long c;
    public final Long d;
    public final String e;
    public final String f;
    public final Double g;

    public zzpl(long j, Object obj, String str, String str2) {
        s0x.E(str);
        this.f45549a = 2;
        this.b = str;
        this.c = j;
        this.f = str2;
        if (obj == null) {
            this.d = null;
            this.g = null;
            this.e = null;
            return;
        }
        if (obj instanceof Long) {
            this.d = (Long) obj;
            this.g = null;
            this.e = null;
        } else if (obj instanceof String) {
            this.d = null;
            this.g = null;
            this.e = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                jf4.o("User attribute given of un-supported type");
                throw null;
            }
            this.d = null;
            this.g = (Double) obj;
            this.e = null;
        }
    }

    public final Object m() {
        Long l = this.d;
        if (l != null) {
            return l;
        }
        Double d = this.g;
        if (d != null) {
            return d;
        }
        String str = this.e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        erw0.b(this, parcel);
    }

    public zzpl(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f45549a = i;
        this.b = str;
        this.c = j;
        this.d = l;
        this.g = i == 1 ? f != null ? Double.valueOf(f.doubleValue()) : null : d;
        this.e = str2;
        this.f = str3;
    }

    public zzpl(v6x0 v6x0Var) {
        this(v6x0Var.d, v6x0Var.e, v6x0Var.c, v6x0Var.b);
    }
}
