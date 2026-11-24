package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lq20 implements pq20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20466a;

    public final boolean equals(Object obj) {
        if (obj instanceof lq20) {
            return this.f20466a == ((lq20) obj).f20466a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20466a);
    }

    public final String toString() {
        return ua80.e(this.f20466a, "Background(value=", Separators.RPAREN);
    }
}
