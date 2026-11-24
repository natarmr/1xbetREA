package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ygv0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42605a;

    public final boolean equals(Object obj) {
        if (obj instanceof ygv0) {
            return this.f42605a.equals(((ygv0) obj).f42605a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42605a.hashCode();
    }

    public final String toString() {
        return kng0.l("MapBackground(value=", this.f42605a, Separators.RPAREN);
    }
}
