package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class wuk0 implements zuk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f39795a;

    public wuk0(sjd sjdVar) {
        this.f39795a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wuk0) && this.f39795a.equals(((wuk0) obj).f39795a);
    }

    public final int hashCode() {
        return this.f39795a.hashCode();
    }

    public final String toString() {
        return vqd.n("SendAltDesignGameCardSideEffect(internalEffect=", this.f39795a, Separators.RPAREN);
    }
}
