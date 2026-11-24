package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class m9u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21429a;

    public final boolean equals(Object obj) {
        if (obj instanceof m9u0) {
            return this.f21429a.equals(((m9u0) obj).f21429a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21429a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenBrowser(url=", this.f21429a, Separators.RPAREN);
    }
}
