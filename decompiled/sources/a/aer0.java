package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class aer0 implements eer0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f743a;

    public aer0(sjd sjdVar) {
        this.f743a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aer0) && this.f743a.equals(((aer0) obj).f743a);
    }

    public final int hashCode() {
        return this.f743a.hashCode();
    }

    public final String toString() {
        return vqd.n("SendAltDesignGameCardSideEffect(internalEffect=", this.f743a, Separators.RPAREN);
    }
}
