package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class adl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f685a;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String c(long j) {
        return j != 9205357640488583168L ? b1j.k(Separators.LPAREN, ycl.c(a(j)), ", ", ycl.c(b(j)), Separators.RPAREN) : "DpOffset.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof adl) {
            return this.f685a == ((adl) obj).f685a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f685a);
    }

    public final String toString() {
        return c(this.f685a);
    }
}
