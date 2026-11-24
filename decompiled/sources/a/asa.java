package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class asa implements fsa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f1381a;

    public asa(sjd sjdVar) {
        this.f1381a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof asa) && this.f1381a.equals(((asa) obj).f1381a);
    }

    public final int hashCode() {
        return this.f1381a.hashCode();
    }

    public final String toString() {
        return vqd.n("ComposeSendGameCardSideEffect(internalEffect=", this.f1381a, Separators.RPAREN);
    }
}
