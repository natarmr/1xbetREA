package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class d5r0 implements g5r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f5521a;

    public d5r0(sjd sjdVar) {
        this.f5521a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d5r0) && this.f5521a.equals(((d5r0) obj).f5521a);
    }

    public final int hashCode() {
        return this.f5521a.hashCode();
    }

    public final String toString() {
        return vqd.n("ComposeSendGameCardSideEffect(internalEffect=", this.f5521a, Separators.RPAREN);
    }
}
