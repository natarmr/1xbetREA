package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wnf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39445a;

    public final boolean equals(Object obj) {
        if (obj instanceof wnf) {
            return this.f39445a.equals(((wnf) obj).f39445a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39445a.hashCode();
    }

    public final String toString() {
        return kng0.l("TotalCash(value=", this.f39445a, Separators.RPAREN);
    }
}
