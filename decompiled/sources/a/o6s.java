package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class o6s implements v6s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final py20 f24753a;

    public final boolean equals(Object obj) {
        if (obj instanceof o6s) {
            return this.f24753a == ((o6s) obj).f24753a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24753a.hashCode();
    }

    public final String toString() {
        return "MarketsAnchorStateChanged(anchorState=" + this.f24753a + Separators.RPAREN;
    }
}
