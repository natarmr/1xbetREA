package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ete implements ute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0d f8372a;

    public final boolean equals(Object obj) {
        if (obj instanceof ete) {
            return this.f8372a == ((ete) obj).f8372a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8372a.hashCode();
    }

    public final String toString() {
        return "CoefDynamic(value=" + this.f8372a + Separators.RPAREN;
    }
}
