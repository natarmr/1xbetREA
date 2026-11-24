package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class alb0 implements flb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjd f1061a;

    public final boolean equals(Object obj) {
        if (obj instanceof alb0) {
            return this.f1061a.equals(((alb0) obj).f1061a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1061a.hashCode();
    }

    public final String toString() {
        return vqd.n("SendAltDesignGameCardSideEffect(internalEffect=", this.f1061a, Separators.RPAREN);
    }
}
