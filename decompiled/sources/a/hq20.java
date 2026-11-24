package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hq20 implements jq20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13467a;

    public final boolean equals(Object obj) {
        if (obj instanceof hq20) {
            return this.f13467a == ((hq20) obj).f13467a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13467a);
    }

    public final String toString() {
        return ua80.e(this.f13467a, "Background(value=", Separators.RPAREN);
    }
}
