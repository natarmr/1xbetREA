package com.google.android.gms.measurement.internal;

import a.get0;
import a.lgw0;
import a.q5x;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbf extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzbf> CREATOR = new lgw0(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f45543a;

    public zzbf(Bundle bundle) {
        this.f45543a = bundle;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new get0(this);
    }

    public final Object m(String str) {
        return this.f45543a.get(str);
    }

    public final Double o() {
        return Double.valueOf(this.f45543a.getDouble("value"));
    }

    public final String p() {
        return this.f45543a.getString("currency");
    }

    public final Bundle s() {
        return new Bundle(this.f45543a);
    }

    public final String toString() {
        return this.f45543a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.d0(parcel, 2, s());
        q5x.q0(parcel, iP0);
    }
}
