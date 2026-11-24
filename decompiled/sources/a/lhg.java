package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lhg implements rhg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20054a;

    public lhg(String str) {
        this.f20054a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lhg) && this.f20054a.equals(((lhg) obj).f20054a);
    }

    public final int hashCode() {
        return this.f20054a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchQueryChanged(query=", this.f20054a, Separators.RPAREN);
    }
}
