package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class anf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final srf f1148a;

    public final boolean equals(Object obj) {
        if (obj instanceof anf) {
            return this.f1148a.equals(((anf) obj).f1148a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1148a.hashCode();
    }

    public final String toString() {
        return "FourthPlayer(value=" + this.f1148a + Separators.RPAREN;
    }
}
