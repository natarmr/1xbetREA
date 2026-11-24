package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gnf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11583a;

    public final boolean equals(Object obj) {
        if (obj instanceof gnf) {
            return this.f11583a.equals(((gnf) obj).f11583a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11583a.hashCode();
    }

    public final String toString() {
        return kng0.l("TotalCash(value=", this.f11583a, Separators.RPAREN);
    }
}
