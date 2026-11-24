package com.google.android.gms.internal.measurement;

import a.erw0;
import a.j5n0;
import a.q5x;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjh> CREATOR = new erw0((byte) 9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45528a;
    public final byte[] b;
    public final String c;
    public final zzjf[] d;
    public final TreeMap e = new TreeMap();
    public final boolean f;
    public final long g;

    public zzjh(String str, String str2, zzjf[] zzjfVarArr, boolean z, byte[] bArr, long j) {
        this.f45528a = str;
        this.c = str2;
        this.d = zzjfVarArr;
        this.f = z;
        this.b = bArr;
        this.g = j;
        for (zzjf zzjfVar : zzjfVarArr) {
            this.e.put(Integer.valueOf(zzjfVar.f45527a), zzjfVar);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjh)) {
            return false;
        }
        zzjh zzjhVar = (zzjh) obj;
        return j5n0.D(this.f45528a, zzjhVar.f45528a) && j5n0.D(this.c, zzjhVar.c) && this.e.equals(zzjhVar.e) && this.f == zzjhVar.f && Arrays.equals(this.b, zzjhVar.b) && this.g == zzjhVar.g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45528a, this.c, this.e, Boolean.valueOf(this.f), this.b, Long.valueOf(this.g)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.f45528a);
        sb.append("', '");
        sb.append(this.c);
        sb.append("', (");
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            sb.append((zzjf) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f);
        sb.append(", ");
        byte[] bArr = this.b;
        sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb.append(", ");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 2, this.f45528a);
        q5x.k0(parcel, 3, this.c);
        q5x.m0(parcel, 4, this.d, i);
        q5x.o0(parcel, 5, 4);
        parcel.writeInt(this.f ? 1 : 0);
        q5x.e0(parcel, 6, this.b);
        q5x.o0(parcel, 7, 8);
        parcel.writeLong(this.g);
        q5x.q0(parcel, iP0);
    }
}
