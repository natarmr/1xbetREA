package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bct0 implements fct0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f2369a;

    public bct0(sjd sjdVar) {
        this.f2369a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bct0) && this.f2369a.equals(((bct0) obj).f2369a);
    }

    public final int hashCode() {
        return this.f2369a.hashCode();
    }

    public final String toString() {
        return vqd.n("ComposeSendGameCardSideEffect(internalEffect=", this.f2369a, Separators.RPAREN);
    }
}
