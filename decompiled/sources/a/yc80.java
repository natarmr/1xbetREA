package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yc80 implements cd80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f42374a;

    public yc80(sjd sjdVar) {
        this.f42374a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yc80) && this.f42374a.equals(((yc80) obj).f42374a);
    }

    public final int hashCode() {
        return this.f42374a.hashCode();
    }

    public final String toString() {
        return vqd.n("ComposeSendGameCardSideEffect(internalEffect=", this.f42374a, Separators.RPAREN);
    }
}
