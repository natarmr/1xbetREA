package com.google.android.gms.internal.measurement;

import a.brm0;
import a.d7x;
import a.erw0;
import a.j5n0;
import a.q5x;
import a.rw2;
import a.s0x;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjl> CREATOR = new erw0((byte) 11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45530a;
    public final byte[] b;
    public final byte[][] c;
    public final byte[][] d;
    public final byte[][] e;
    public final byte[][] f;
    public final int[] g;
    public final byte[][] h;
    public final int[] i;
    public final byte[][] j;

    public zzjl(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.f45530a = str;
        this.b = bArr;
        this.c = bArr2;
        this.d = bArr3;
        this.e = bArr4;
        this.f = bArr5;
        this.g = iArr;
        this.h = bArr6;
        this.i = iArr2;
        this.j = bArr7;
    }

    public static void m(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append(Separators.LPAREN);
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append(Separators.QUOTE);
            s0x.H(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append(Separators.QUOTE);
            i++;
            z = false;
        }
        sb.append(Separators.RPAREN);
    }

    public static Set p(byte[][] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) == 0) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetG = d7x.G(length);
        for (byte[] bArr2 : bArr) {
            s0x.H(bArr2);
            hashSetG.add(Base64.encodeToString(bArr2, 3));
        }
        return hashSetG;
    }

    public static List s(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new zzju(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet] */
    public final boolean equals(Object obj) {
        Object objG;
        Object objG2;
        int length;
        int length2;
        if (obj instanceof zzjl) {
            zzjl zzjlVar = (zzjl) obj;
            if (j5n0.D(this.f45530a, zzjlVar.f45530a) && j5n0.D(o(), zzjlVar.o()) && j5n0.D(p(this.c), p(zzjlVar.c)) && j5n0.D(p(this.d), p(zzjlVar.d)) && j5n0.D(p(this.e), p(zzjlVar.e)) && j5n0.D(p(this.f), p(zzjlVar.f))) {
                int[] iArr = this.g;
                if (iArr == null || (length2 = iArr.length) == 0) {
                    objG = Collections.EMPTY_SET;
                } else {
                    objG = d7x.G(length2);
                    for (int i : iArr) {
                        objG.add(Integer.valueOf(i));
                    }
                }
                int[] iArr2 = zzjlVar.g;
                if (iArr2 == null || (length = iArr2.length) == 0) {
                    objG2 = Collections.EMPTY_SET;
                } else {
                    objG2 = d7x.G(length);
                    for (int i2 : iArr2) {
                        objG2.add(Integer.valueOf(i2));
                    }
                }
                if (j5n0.D(objG, objG2) && j5n0.D(s(this.i), s(zzjlVar.i)) && j5n0.D(p(this.j), p(zzjlVar.j))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Set o() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.h;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.b;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return p((byte[][]) arrayList.toArray(new byte[0][]));
    }

    public final String toString() {
        StringBuilder sbT = brm0.t("ExperimentTokens", Separators.LPAREN);
        String str = this.f45530a;
        sbT.append(str == null ? "null" : rw2.o(new StringBuilder(str.length() + 2), Separators.QUOTE, str, Separators.QUOTE));
        sbT.append(", direct==");
        byte[] bArr = this.b;
        if (bArr == null) {
            sbT.append("null");
        } else {
            sbT.append(Separators.QUOTE);
            sbT.append(Base64.encodeToString(bArr, 3));
            sbT.append(Separators.QUOTE);
        }
        sbT.append(", ");
        m(sbT, "GAIA=", this.c);
        sbT.append(", ");
        m(sbT, "PSEUDO=", this.d);
        sbT.append(", ");
        m(sbT, "ALWAYS=", this.e);
        sbT.append(", ");
        m(sbT, "OTHER=", this.f);
        sbT.append(", weak=");
        sbT.append(Arrays.toString(this.g));
        sbT.append(", ");
        m(sbT, "directs=", this.h);
        sbT.append(", genDims=");
        sbT.append(Arrays.toString(s(this.i).toArray()));
        sbT.append(", ");
        m(sbT, "external=", this.j);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 2, this.f45530a);
        q5x.e0(parcel, 3, this.b);
        q5x.f0(parcel, 4, this.c);
        q5x.f0(parcel, 5, this.d);
        q5x.f0(parcel, 6, this.e);
        q5x.f0(parcel, 7, this.f);
        q5x.h0(parcel, 8, this.g);
        q5x.f0(parcel, 9, this.h);
        q5x.h0(parcel, 10, this.i);
        q5x.f0(parcel, 11, this.j);
        q5x.q0(parcel, iP0);
    }
}
