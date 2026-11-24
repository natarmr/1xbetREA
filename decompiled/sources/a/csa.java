package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class csa implements fsa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4878a;

    public final boolean equals(Object obj) {
        if (obj instanceof csa) {
            return this.f4878a.equals(((csa) obj).f4878a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4878a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchQuery(value=", this.f4878a, Separators.RPAREN);
    }
}
