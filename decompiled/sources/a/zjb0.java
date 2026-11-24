package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zjb0 implements okb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f44476a;

    public final boolean equals(Object obj) {
        if (obj instanceof zjb0) {
            return this.f44476a.equals(((zjb0) obj).f44476a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44476a.hashCode();
    }

    public final String toString() {
        return twn.n("DsGameCardAction(action=", this.f44476a, Separators.RPAREN);
    }
}
