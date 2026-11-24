package com.google.android.gms.measurement.internal;

import a.axq;
import a.f140;
import a.lgw0;
import a.s0x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbh> CREATOR = new lgw0(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45544a;
    public final zzbf b;
    public final String c;
    public final long d;
    public final long e;

    public zzbh(zzbh zzbhVar, long j, long j2) {
        s0x.H(zzbhVar);
        this.f45544a = zzbhVar.f45544a;
        this.b = zzbhVar.b;
        this.c = zzbhVar.c;
        this.d = j;
        this.e = j2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        String str = this.c;
        int length = String.valueOf(str).length();
        String str2 = this.f45544a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        f140.v(sb, "origin=", str, ",name=", str2);
        return axq.n(sb, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        lgw0.a(this, parcel, i);
    }

    public zzbh(String str, zzbf zzbfVar, String str2, long j, long j2) {
        this.f45544a = str;
        this.b = zzbfVar;
        this.c = str2;
        this.d = j;
        this.e = j2;
    }
}
