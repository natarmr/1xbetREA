package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fl2 implements ml2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f9720a;

    public fl2(sjd sjdVar) {
        this.f9720a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fl2) && this.f9720a.equals(((fl2) obj).f9720a);
    }

    public final int hashCode() {
        return this.f9720a.hashCode();
    }

    public final String toString() {
        return vqd.n("ComposeSendGameCardSideEffect(internalEffect=", this.f9720a, Separators.RPAREN);
    }
}
