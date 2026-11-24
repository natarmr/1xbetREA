package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class o27 implements o37 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24518a;

    public final boolean equals(Object obj) {
        if (obj instanceof o27) {
            return this.f24518a.equals(((o27) obj).f24518a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24518a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnBetsSummaryInfoUpdate(betId=", this.f24518a, Separators.RPAREN);
    }
}
