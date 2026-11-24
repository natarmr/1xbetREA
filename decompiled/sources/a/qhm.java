package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qhm implements thm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28746a;

    public final boolean equals(Object obj) {
        if (obj instanceof qhm) {
            return this.f28746a.equals(((qhm) obj).f28746a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28746a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchQuery(value=", this.f28746a, Separators.RPAREN);
    }
}
