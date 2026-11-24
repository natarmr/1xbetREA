package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gmf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final orf f11540a;

    public final boolean equals(Object obj) {
        if (obj instanceof gmf) {
            return this.f11540a.equals(((gmf) obj).f11540a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11540a.hashCode();
    }

    public final String toString() {
        return "FourthPlayer(value=" + this.f11540a + Separators.RPAREN;
    }
}
