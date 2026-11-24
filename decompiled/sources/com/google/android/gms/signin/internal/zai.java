package com.google.android.gms.signin.internal;

import a.equ0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zay;

/* JADX INFO: loaded from: classes2.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new equ0((byte) 15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45553a;
    public final zay b;

    public zai(int i, zay zayVar) {
        this.f45553a = i;
        this.b = zayVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 4);
        parcel.writeInt(this.f45553a);
        q5x.j0(parcel, 2, this.b, i);
        q5x.q0(parcel, iP0);
    }
}
