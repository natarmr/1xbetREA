package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hsk implements jsk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f13588a;

    public hsk(sjd sjdVar) {
        this.f13588a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hsk) && this.f13588a.equals(((hsk) obj).f13588a);
    }

    public final int hashCode() {
        return this.f13588a.hashCode();
    }

    public final String toString() {
        return vqd.n("ComposeSendGameCardSideEffect(internalEffect=", this.f13588a, Separators.RPAREN);
    }
}
