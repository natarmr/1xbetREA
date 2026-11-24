package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dba0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5794a;

    public final boolean equals(Object obj) {
        if (obj instanceof dba0) {
            return this.f5794a.equals(((dba0) obj).f5794a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5794a.hashCode();
    }

    public final String toString() {
        return kng0.l("PlayerName(value=", this.f5794a, Separators.RPAREN);
    }
}
