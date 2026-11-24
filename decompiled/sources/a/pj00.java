package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pj00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f27065a;

    public pj00(sjd sjdVar) {
        this.f27065a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pj00) && this.f27065a.equals(((pj00) obj).f27065a);
    }

    public final int hashCode() {
        return this.f27065a.hashCode();
    }

    public final String toString() {
        return vqd.n("SendGameCardSideEffect(internalEffect=", this.f27065a, Separators.RPAREN);
    }
}
