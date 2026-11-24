package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class l5b implements o5b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19445a;

    public final boolean equals(Object obj) {
        if (obj instanceof l5b) {
            return this.f19445a.equals(((l5b) obj).f19445a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19445a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchQuery(value=", this.f19445a, Separators.RPAREN);
    }
}
