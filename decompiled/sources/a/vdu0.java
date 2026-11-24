package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vdu0 implements wdu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37249a;

    public final boolean equals(Object obj) {
        if (obj instanceof vdu0) {
            return this.f37249a.equals(((vdu0) obj).f37249a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37249a.hashCode();
    }

    public final String toString() {
        return kng0.l("WinnerText(value=", this.f37249a, Separators.RPAREN);
    }
}
