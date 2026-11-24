package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ptn0 implements rtn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27574a;

    public final boolean equals(Object obj) {
        if (obj instanceof ptn0) {
            return this.f27574a.equals(((ptn0) obj).f27574a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27574a.hashCode();
    }

    public final String toString() {
        return kng0.l("Score(value=", this.f27574a, Separators.RPAREN);
    }
}
