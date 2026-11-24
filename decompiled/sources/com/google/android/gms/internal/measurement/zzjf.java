package com.google.android.gms.internal.measurement;

import a.erw0;
import a.j5n0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjf extends AbstractSafeParcelable implements Comparable<zzjf> {
    public static final Parcelable.Creator<zzjf> CREATOR = new erw0((byte) 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45527a;
    public final zzjo[] b;
    public final String[] c;
    public final TreeMap d = new TreeMap();

    public zzjf(int i, zzjo[] zzjoVarArr, String[] strArr) {
        this.f45527a = i;
        this.b = zzjoVarArr;
        for (zzjo zzjoVar : zzjoVarArr) {
            this.d.put(zzjoVar.f45531a, zzjoVar);
        }
        this.c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzjf zzjfVar) {
        return this.f45527a - zzjfVar.f45527a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjf)) {
            return false;
        }
        zzjf zzjfVar = (zzjf) obj;
        return this.f45527a == zzjfVar.f45527a && j5n0.D(this.d, zzjfVar.d) && Arrays.equals(this.c, zzjfVar.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.f45527a);
        sb.append(", (");
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append((zzjo) it.next());
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.c;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 2, 4);
        parcel.writeInt(this.f45527a);
        q5x.m0(parcel, 3, this.b, i);
        String[] strArr = this.c;
        if (strArr != null) {
            int iP1 = q5x.p0(parcel, 4);
            parcel.writeStringArray(strArr);
            q5x.q0(parcel, iP1);
        }
        q5x.q0(parcel, iP0);
    }
}
