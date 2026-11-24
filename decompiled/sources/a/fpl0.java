package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fpl0 implements gpl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f9934a;

    public fpl0(sjd sjdVar) {
        this.f9934a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fpl0) && this.f9934a.equals(((fpl0) obj).f9934a);
    }

    public final int hashCode() {
        return this.f9934a.hashCode();
    }

    public final String toString() {
        return vqd.n("SendGameCardSideEffect(internalEffect=", this.f9934a, Separators.RPAREN);
    }
}
