package com.google.android.gms.internal.measurement;

import a.erw0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjj> CREATOR = new erw0((byte) 10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f45529a;

    public zzjj(byte[] bArr) {
        this.f45529a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.e0(parcel, 2, this.f45529a);
        q5x.q0(parcel, iP0);
    }
}
