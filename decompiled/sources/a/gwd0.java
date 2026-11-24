package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gwd0 implements hwd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12021a;

    public final boolean equals(Object obj) {
        if (obj instanceof gwd0) {
            return this.f12021a.equals(((gwd0) obj).f12021a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12021a.hashCode();
    }

    public final String toString() {
        return kng0.l("MatchClick(value=", this.f12021a, Separators.RPAREN);
    }
}
