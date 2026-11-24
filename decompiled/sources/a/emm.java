package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class emm implements gmm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oa50 f8053a;

    public emm(oa50 oa50Var) {
        this.f8053a = oa50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof emm) && this.f8053a.equals(((emm) obj).f8053a);
    }

    public final int hashCode() {
        return this.f8053a.hashCode();
    }

    public final String toString() {
        return "ButtonBackground(icons=" + this.f8053a + Separators.RPAREN;
    }
}
