package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ils0 {
    public static final long b = osm0.e(0.5f, 0.5f);
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14995a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static String b(long j) {
        return axq.h(j, "TransformOrigin(packedValue=", Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ils0) {
            return this.f14995a == ((ils0) obj).f14995a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f14995a);
    }

    public final String toString() {
        return b(this.f14995a);
    }
}
