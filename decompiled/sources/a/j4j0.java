package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class j4j0 implements n4j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15887a;

    public final boolean equals(Object obj) {
        if (obj instanceof j4j0) {
            return this.f15887a.equals(((j4j0) obj).f15887a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15887a.hashCode();
    }

    public final String toString() {
        return kng0.l("FirstValue(value=", this.f15887a, Separators.RPAREN);
    }
}
