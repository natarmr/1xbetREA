package com.google.android.gms.common.internal;

import a.equ0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new equ0((byte) 9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45492a;
    public List b;

    public TelemetryData(int i, List list) {
        this.f45492a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 4);
        parcel.writeInt(this.f45492a);
        q5x.n0(parcel, 2, this.b);
        q5x.q0(parcel, iP0);
    }
}
