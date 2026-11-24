package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class p4e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26347a;

    public /* synthetic */ p4e(long j) {
        this.f26347a = j;
    }

    public static final long a(int i, int i2, int i3, int i4) {
        if (i2 < i || i4 < i3 || i < 0 || i3 < 0) {
            zcx.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return r4e.h(i, i2, i3, i4);
    }

    public static /* synthetic */ long b(long j, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = k(j);
        }
        if ((i5 & 2) != 0) {
            i2 = i(j);
        }
        if ((i5 & 4) != 0) {
            i3 = j(j);
        }
        if ((i5 & 8) != 0) {
            i4 = h(j);
        }
        return a(i, i2, i3, i4);
    }

    public static final boolean c(long j, long j2) {
        return j == j2;
    }

    public static final boolean d(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) != 0;
    }

    public static final boolean e(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << vqd.a((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1)) != 0;
    }

    public static final boolean f(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = (1 << (18 - i2)) - 1;
        int i4 = ((int) (j >> (i2 + 15))) & i3;
        int i5 = ((int) (j >> (i2 + 46))) & i3;
        return i4 == (i5 == 0 ? Integer.MAX_VALUE : i5 - 1);
    }

    public static final boolean g(long j) {
        int i = (int) (3 & j);
        int iA = (1 << vqd.a((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1;
        int i2 = ((int) (j >> 2)) & iA;
        int i3 = ((int) (j >> 33)) & iA;
        return i2 == (i3 == 0 ? Integer.MAX_VALUE : i3 - 1);
    }

    public static final int h(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i3 = ((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1);
        if (i3 == 0) {
            return Integer.MAX_VALUE;
        }
        return i3 - 1;
    }

    public static final int i(long j) {
        int i = (int) (3 & j);
        int i2 = (int) (j >> 33);
        int iA = i2 & ((1 << vqd.a((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1);
        if (iA == 0) {
            return Integer.MAX_VALUE;
        }
        return iA - 1;
    }

    public static final int j(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i2 + 15))) & ((1 << (18 - i2)) - 1);
    }

    public static final int k(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << vqd.a((i & 2) >> 1, 3, (i & 1) << 1, 13)) - 1);
    }

    public static final boolean l(long j) {
        int i = (int) (3 & j);
        int i2 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((((int) (j >> 33)) & ((1 << (i2 + 13)) - 1)) - 1 == 0) | ((((int) (j >> (i2 + 46))) & ((1 << (18 - i2)) - 1)) - 1 == 0);
    }

    public static String m(long j) {
        int i = i(j);
        String strValueOf = i == Integer.MAX_VALUE ? "Infinity" : String.valueOf(i);
        int iH = h(j);
        return rw2.k(j(j), ", maxHeight = ", iH != Integer.MAX_VALUE ? String.valueOf(iH) : "Infinity", Separators.RPAREN, vqd.r(k(j), "Constraints(minWidth = ", ", maxWidth = ", strValueOf, ", minHeight = "));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p4e) {
            return this.f26347a == ((p4e) obj).f26347a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26347a);
    }

    public final String toString() {
        return m(this.f26347a);
    }
}
