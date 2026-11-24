package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dg2 implements gg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6028a;

    public final boolean equals(Object obj) {
        if (obj instanceof dg2) {
            return this.f6028a.equals(((dg2) obj).f6028a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6028a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchQuery(value=", this.f6028a, Separators.RPAREN);
    }
}
