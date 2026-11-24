package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yd7 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42419a;

    public final boolean equals(Object obj) {
        if (obj instanceof yd7) {
            return this.f42419a.equals(((yd7) obj).f42419a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42419a.hashCode();
    }

    public final String toString() {
        return kng0.l("Coefficient(value=", this.f42419a, Separators.RPAREN);
    }
}
