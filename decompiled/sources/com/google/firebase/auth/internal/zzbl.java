package com.google.firebase.auth.internal;

import a.lgw0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbl> CREATOR = new lgw0(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f45656a;
    public final List b;

    public zzbl(ArrayList arrayList, ArrayList arrayList2) {
        this.f45656a = arrayList == null ? new ArrayList() : arrayList;
        this.b = arrayList2 == null ? new ArrayList() : arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.n0(parcel, 1, this.f45656a);
        q5x.n0(parcel, 2, this.b);
        q5x.q0(parcel, iP0);
    }
}
