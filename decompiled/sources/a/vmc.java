package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vmc implements xmc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37669a;

    public final boolean equals(Object obj) {
        if (obj instanceof vmc) {
            return this.f37669a.equals(((vmc) obj).f37669a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37669a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchInput(value=", this.f37669a, Separators.RPAREN);
    }
}
