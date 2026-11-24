package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tzo0 implements vzo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f34815a;

    public tzo0(sjd sjdVar) {
        this.f34815a = sjdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tzo0) && this.f34815a.equals(((tzo0) obj).f34815a);
    }

    public final int hashCode() {
        return this.f34815a.hashCode();
    }

    public final String toString() {
        return vqd.n("SendGameCardSideEffect(internalEffect=", this.f34815a, Separators.RPAREN);
    }
}
