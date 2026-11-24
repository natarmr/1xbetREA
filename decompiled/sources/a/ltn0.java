package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ltn0 implements rtn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20637a;

    public final boolean equals(Object obj) {
        if (obj instanceof ltn0) {
            return this.f20637a.equals(((ltn0) obj).f20637a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20637a.hashCode();
    }

    public final String toString() {
        return kng0.l("Coef(value=", this.f20637a, Separators.RPAREN);
    }
}
