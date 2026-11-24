package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class s160 implements b260 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f31439a;

    public s160(sjd sjdVar) {
        this.f31439a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s160) && this.f31439a.equals(((s160) obj).f31439a);
    }

    public final int hashCode() {
        return this.f31439a.hashCode();
    }

    public final String toString() {
        return vqd.n("ComposeSendGameCardSideEffect(internalEffect=", this.f31439a, Separators.RPAREN);
    }
}
