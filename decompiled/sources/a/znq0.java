package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class znq0 implements aoq0 {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44687a;

    public /* synthetic */ znq0(long j) {
        this.f44687a = j;
    }

    public static final boolean e(long j, long j2) {
        return j == j2;
    }

    public static long f(long j) {
        return new znq0(j).c();
    }

    public static long g(long j) {
        return new znq0(j).b();
    }

    public static String h(long j) {
        return axq.h(j, "Seconds(value=", Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof znq0) {
            return this.f44687a == ((znq0) obj).f44687a;
        }
        return false;
    }

    @Override // a.aoq0
    public final long getValue() {
        return this.f44687a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f44687a);
    }

    public final String toString() {
        return h(this.f44687a);
    }
}
