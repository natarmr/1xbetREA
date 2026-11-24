package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class o9q0 {
    public static final long b = s7n0.e(0, 0);
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24893a;

    public /* synthetic */ o9q0(long j) {
        this.f24893a = j;
    }

    public static boolean a(Object obj, long j) {
        return (obj instanceof o9q0) && j == ((o9q0) obj).f24893a;
    }

    public static final boolean b(long j, long j2) {
        return j == j2;
    }

    public static final boolean c(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    public static final int d(long j) {
        return e(j) - f(j);
    }

    public static final int e(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final int f(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final boolean g(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    public static String h(long j) {
        return ohs0.m("TextRange(", (int) (j >> 32), ", ", Separators.RPAREN, (int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        return a(obj, this.f24893a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f24893a);
    }

    public final String toString() {
        return h(this.f24893a);
    }
}
