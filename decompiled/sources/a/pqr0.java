package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pqr0 implements sqr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ua20 f27428a;

    public pqr0(ua20 ua20Var) {
        this.f27428a = ua20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pqr0) && this.f27428a == ((pqr0) obj).f27428a;
    }

    public final int hashCode() {
        return this.f27428a.hashCode();
    }

    public final String toString() {
        return "ShowBetDialog(altDesignType=" + this.f27428a + Separators.RPAREN;
    }
}
