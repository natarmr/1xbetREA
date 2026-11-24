package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ikx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14950a;

    public /* synthetic */ ikx(long j) {
        this.f14950a = j;
    }

    public static long a(int i, int i2, int i3, long j) {
        if ((i3 & 1) != 0) {
            i = (int) (j >> 32);
        }
        if ((i3 & 2) != 0) {
            i2 = (int) (j & 4294967295L);
        }
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    public static final long c(long j, long j2) {
        return (((long) (((int) (j >> 32)) - ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public static final long d(long j, long j2) {
        return (((long) (((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public static String e(long j) {
        return ohs0.m(Separators.LPAREN, (int) (j >> 32), ", ", Separators.RPAREN, (int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ikx) {
            return this.f14950a == ((ikx) obj).f14950a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14950a);
    }

    public final String toString() {
        return e(this.f14950a);
    }
}
