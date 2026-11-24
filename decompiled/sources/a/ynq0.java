package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ynq0 implements aoq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42952a;

    public /* synthetic */ ynq0(long j) {
        this.f42952a = j;
    }

    public static long e(long j) {
        return new ynq0(j).c();
    }

    public static long f(long j) {
        return new ynq0(j).b();
    }

    public static String g(long j) {
        return axq.h(j, "Milliseconds(value=", Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ynq0) {
            return this.f42952a == ((ynq0) obj).f42952a;
        }
        return false;
    }

    @Override // a.aoq0
    public final long getValue() {
        return this.f42952a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f42952a);
    }

    public final String toString() {
        return g(this.f42952a);
    }
}
