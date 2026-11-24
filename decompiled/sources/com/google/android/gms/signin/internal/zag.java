package com.google.android.gms.signin.internal;

import a.equ0;
import a.m0g0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zag extends AbstractSafeParcelable implements m0g0 {
    public static final Parcelable.Creator<zag> CREATOR = new equ0(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f45552a;
    public final String b;

    public zag(String str, ArrayList arrayList) {
        this.f45552a = arrayList;
        this.b = str;
    }

    @Override // a.m0g0
    public final Status b() {
        return this.b != null ? Status.e : Status.i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.l0(parcel, 1, this.f45552a);
        q5x.k0(parcel, 2, this.b);
        q5x.q0(parcel, iP0);
    }
}
