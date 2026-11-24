package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rjw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f30618a;

    public rjw(sjd sjdVar) {
        this.f30618a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rjw) && this.f30618a.equals(((rjw) obj).f30618a);
    }

    public final int hashCode() {
        return this.f30618a.hashCode();
    }

    public final String toString() {
        return vqd.n("SendGameCardSideEffect(internalEffect=", this.f30618a, Separators.RPAREN);
    }
}
