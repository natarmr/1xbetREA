package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class akx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1044a;

    public static long a(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof akx) {
            return this.f1044a == ((akx) obj).f1044a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1044a);
    }

    public final String toString() {
        long j = this.f1044a;
        return ohs0.m(Separators.LPAREN, (int) (j >> 32), ", ", Separators.RPAREN, (int) (j & 4294967295L));
    }
}
