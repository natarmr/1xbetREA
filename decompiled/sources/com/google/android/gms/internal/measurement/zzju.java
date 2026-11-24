package com.google.android.gms.internal.measurement;

import a.erw0;
import a.q5x;
import a.rw2;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzju extends AbstractSafeParcelable implements Comparable<zzju> {
    public static final Parcelable.Creator<zzju> CREATOR = new erw0((byte) 15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45534a;
    public final int b;

    public zzju(int i, int i2) {
        this.f45534a = i;
        this.b = i2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(zzju zzjuVar) {
        zzju zzjuVar2 = zzjuVar;
        int i = zzjuVar2.f45534a;
        int i2 = this.f45534a;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int i3 = zzjuVar2.b;
        int i4 = this.b;
        if (i4 < i3) {
            return -1;
        }
        return i4 > i3 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0004, code lost:
    
        r0 = (r3 = (com.google.android.gms.internal.measurement.zzju) r3).f45534a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
    
        r3 = r3.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.zzju
            if (r0 == 0) goto L1c
            com.google.android.gms.internal.measurement.zzju r3 = (com.google.android.gms.internal.measurement.zzju) r3
            int r0 = r3.f45534a
            int r1 = r2.f45534a
            if (r1 >= r0) goto Ld
            goto L1c
        Ld:
            if (r1 <= r0) goto L10
            goto L1c
        L10:
            int r3 = r3.b
            int r2 = r2.b
            if (r2 >= r3) goto L17
            goto L1c
        L17:
            if (r2 <= r3) goto L1a
            goto L1c
        L1a:
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzju.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return (this.f45534a * 31) + this.b;
    }

    public final String toString() {
        int i = this.f45534a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(i2).length() + 1);
        rw2.s(i, i2, "GenericDimension(", ", ", sb);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 4);
        parcel.writeInt(this.f45534a);
        q5x.o0(parcel, 2, 4);
        parcel.writeInt(this.b);
        q5x.q0(parcel, iP0);
    }
}
