package com.google.android.gms.internal.measurement;

import a.b1j;
import a.c99;
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
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjo extends AbstractSafeParcelable implements Comparable<zzjo> {
    public static final Parcelable.Creator<zzjo> CREATOR = new erw0((byte) 12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45531a;
    public final long b;
    public final boolean c;
    public final double d;
    public final String e;
    public final byte[] f;
    public final int g;
    public final int h;
    public final int i;

    public zzjo(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2, int i3) {
        this.f45531a = str;
        this.b = j;
        this.c = z;
        this.d = d;
        this.e = str2;
        this.f = bArr;
        this.g = i;
        this.h = i2;
        this.i = i3;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00a3 A[RETURN] */
    @Override // java.lang.Comparable
    public final int compareTo(zzjo zzjoVar) {
        int i;
        zzjo zzjoVar2 = zzjoVar;
        int iCompareTo = this.f45531a.compareTo(zzjoVar2.f45531a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int i2 = zzjoVar2.g;
        int i3 = this.g;
        if (i3 < i2) {
            i = -1;
        } else {
            i = i3 != i2 ? 1 : 0;
        }
        if (i != 0) {
            return i;
        }
        if (i3 == 1) {
            long j = this.b;
            long j2 = zzjoVar2.b;
            if (j >= j2) {
                if (j == j2) {
                    return 0;
                }
                return 1;
            }
            return -1;
        }
        if (i3 == 2) {
            boolean z = zzjoVar2.c;
            boolean z2 = this.c;
            if (z2 != z) {
                if (z2) {
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (i3 == 3) {
            return Double.compare(this.d, zzjoVar2.d);
        }
        if (i3 == 4) {
            String str = zzjoVar2.e;
            String str2 = this.e;
            if (str2 != str) {
                if (str2 != null) {
                    if (str != null) {
                        return str2.compareTo(str);
                    }
                    return 1;
                }
                return -1;
            }
            return 0;
        }
        if (i3 != 5) {
            c99.l(b1j.h(i3, "Invalid enum value: ", new StringBuilder(String.valueOf(i3).length() + 20)));
            return 0;
        }
        byte[] bArr = zzjoVar2.f;
        byte[] bArr2 = this.f;
        if (bArr2 != bArr) {
            if (bArr2 != null) {
                if (bArr != null) {
                    int i4 = 0;
                    while (true) {
                        int length = bArr.length;
                        int length2 = bArr2.length;
                        if (i4 >= Math.min(length2, length)) {
                            if (length2 < length) {
                                return -1;
                            }
                            return length2 != length ? 1 : 0;
                        }
                        int i5 = bArr2[i4] - bArr[i4];
                        if (i5 != 0) {
                            return i5;
                        }
                        i4++;
                    }
                }
                return 1;
            }
            return -1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzjo) {
            zzjo zzjoVar = (zzjo) obj;
            if (j5n0.D(this.f45531a, zzjoVar.f45531a)) {
                int i = zzjoVar.g;
                int i2 = this.g;
                if (i2 == i && this.h == zzjoVar.h && this.i == zzjoVar.i) {
                    if (i2 == 1) {
                        return this.b == zzjoVar.b;
                    }
                    if (i2 == 2) {
                        return this.c == zzjoVar.c;
                    }
                    if (i2 == 3) {
                        return this.d == zzjoVar.d;
                    }
                    if (i2 == 4) {
                        return j5n0.D(this.e, zzjoVar.e);
                    }
                    if (i2 == 5) {
                        return Arrays.equals(this.f, zzjoVar.f);
                    }
                    c99.l(b1j.h(i2, "Invalid enum value: ", new StringBuilder(String.valueOf(i2).length() + 20)));
                    return false;
                }
            }
        }
        return false;
    }

    public final void m(StringBuilder sb) {
        sb.append("Flag(");
        String str = this.f45531a;
        sb.append(str);
        sb.append(", ");
        int i = this.g;
        if (i == 1) {
            sb.append(this.b);
        } else if (i == 2) {
            sb.append(this.c);
        } else if (i == 3) {
            sb.append(this.d);
        } else if (i == 4) {
            sb.append(Separators.QUOTE);
            String str2 = this.e;
            s0x.H(str2);
            sb.append(str2);
            sb.append(Separators.QUOTE);
        } else {
            if (i != 5) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i).length());
                sb2.append("Invalid type: ");
                sb2.append(str);
                sb2.append(", ");
                sb2.append(i);
                throw new AssertionError(sb2.toString());
            }
            sb.append(Separators.QUOTE);
            byte[] bArr = this.f;
            s0x.H(bArr);
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append(Separators.QUOTE);
        }
        rw2.x(sb, ", ", i, ", ");
        sb.append(this.h);
        sb.append(", ");
        sb.append(this.i);
        sb.append(Separators.RPAREN);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f45531a;
        boolean z = str == null;
        int iP0 = q5x.p0(parcel, 20293);
        if (!z) {
            q5x.k0(parcel, 2, str);
        }
        long j = this.b;
        if (j != 0) {
            q5x.o0(parcel, 3, 8);
            parcel.writeLong(j);
        }
        if (this.c) {
            q5x.o0(parcel, 4, 4);
            parcel.writeInt(1);
        }
        double d = this.d;
        if (d != 0.0d) {
            q5x.o0(parcel, 5, 8);
            parcel.writeDouble(d);
        }
        String str2 = this.e;
        if (str2 != null) {
            q5x.k0(parcel, 6, str2);
        }
        byte[] bArr = this.f;
        if (bArr != null) {
            q5x.e0(parcel, 7, bArr);
        }
        int i2 = this.g;
        if (i2 != 0) {
            q5x.o0(parcel, 8, 4);
            parcel.writeInt(i2);
        }
        int i3 = this.h;
        if (i3 != 0) {
            q5x.o0(parcel, 9, 4);
            parcel.writeInt(i3);
        }
        int i4 = this.i;
        if (i4 != 0) {
            q5x.o0(parcel, 10, 4);
            parcel.writeInt(i4);
        }
        q5x.q0(parcel, iP0);
    }
}
