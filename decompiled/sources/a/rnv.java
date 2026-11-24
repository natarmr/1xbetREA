package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rnv implements bov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30807a;

    public final boolean equals(Object obj) {
        if (obj instanceof rnv) {
            return this.f30807a == ((rnv) obj).f30807a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30807a);
    }

    public final String toString() {
        return ua80.e(this.f30807a, "Background(value=", Separators.RPAREN);
    }
}
