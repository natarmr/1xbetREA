package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cfg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f4259a;

    public cfg(sjd sjdVar) {
        this.f4259a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfg) && this.f4259a.equals(((cfg) obj).f4259a);
    }

    public final int hashCode() {
        return this.f4259a.hashCode();
    }

    public final String toString() {
        return vqd.n("ComposeSendGameCardSideEffect(internalEffect=", this.f4259a, Separators.RPAREN);
    }
}
