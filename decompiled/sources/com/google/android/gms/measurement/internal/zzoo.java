package com.google.android.gms.measurement.internal;

import a.erw0;
import a.q1x0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzoo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoo> CREATOR = new erw0((byte) 23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f45547a;

    public zzoo(ArrayList arrayList) {
        this.f45547a = arrayList;
    }

    public static zzoo m(q1x0... q1x0VarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(q1x0VarArr[0].f27975a));
        return new zzoo(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        List list = this.f45547a;
        if (list != null) {
            int iP1 = q5x.p0(parcel, 1);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            q5x.q0(parcel, iP1);
        }
        q5x.q0(parcel, iP0);
    }
}
