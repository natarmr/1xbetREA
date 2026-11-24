package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fhh0 implements hhh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f9541a;

    public fhh0(sjd sjdVar) {
        this.f9541a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fhh0) && this.f9541a.equals(((fhh0) obj).f9541a);
    }

    public final int hashCode() {
        return this.f9541a.hashCode();
    }

    public final String toString() {
        return vqd.n("SendAltDesignGameCardSideEffect(internalEffect=", this.f9541a, Separators.RPAREN);
    }
}
