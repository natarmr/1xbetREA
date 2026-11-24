package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class bds {
    public static final ads Companion = new ads();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2414a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static String b(long j) {
        return axq.h(j, "GameId(value=", Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bds) {
            return this.f2414a == ((bds) obj).f2414a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2414a);
    }

    public final String toString() {
        return b(this.f2414a);
    }
}
