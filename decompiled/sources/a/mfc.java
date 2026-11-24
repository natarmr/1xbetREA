package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mfc implements nfc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21688a;

    public final boolean equals(Object obj) {
        if (obj instanceof mfc) {
            return this.f21688a.equals(((mfc) obj).f21688a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21688a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchQuery(query=", this.f21688a, Separators.RPAREN);
    }
}
