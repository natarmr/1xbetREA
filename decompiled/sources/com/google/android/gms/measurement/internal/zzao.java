package com.google.android.gms.measurement.internal;

import a.lgw0;
import a.q5x;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new lgw0(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f45542a;

    public zzao(Bundle bundle) {
        this.f45542a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.d0(parcel, 1, this.f45542a);
        q5x.q0(parcel, iP0);
    }
}
