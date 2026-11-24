package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hxp implements jxp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f13821a;

    public hxp(sjd sjdVar) {
        this.f13821a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hxp) && this.f13821a.equals(((hxp) obj).f13821a);
    }

    public final int hashCode() {
        return this.f13821a.hashCode();
    }

    public final String toString() {
        return vqd.n("ComposeSendGameCardSideEffect(internalEffect=", this.f13821a, Separators.RPAREN);
    }
}
