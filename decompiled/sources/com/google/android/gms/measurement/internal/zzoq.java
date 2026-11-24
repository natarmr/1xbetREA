package com.google.android.gms.measurement.internal;

import a.erw0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzoq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoq> CREATOR = new erw0(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f45548a;

    public zzoq(ArrayList arrayList) {
        this.f45548a = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.n0(parcel, 1, this.f45548a);
        q5x.q0(parcel, iP0);
    }
}
