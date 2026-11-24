package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hbp0 implements lbp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f12781a;

    public hbp0(sjd sjdVar) {
        this.f12781a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hbp0) && this.f12781a.equals(((hbp0) obj).f12781a);
    }

    public final int hashCode() {
        return this.f12781a.hashCode();
    }

    public final String toString() {
        return vqd.n("ComposeSendGameCardSideEffect(internalEffect=", this.f12781a, Separators.RPAREN);
    }
}
