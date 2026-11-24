package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qjw implements ujw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f28860a;

    public qjw(sjd sjdVar) {
        this.f28860a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qjw) && this.f28860a.equals(((qjw) obj).f28860a);
    }

    public final int hashCode() {
        return this.f28860a.hashCode();
    }

    public final String toString() {
        return vqd.n("ComposeSendGameCardSideEffect(internalEffect=", this.f28860a, Separators.RPAREN);
    }
}
