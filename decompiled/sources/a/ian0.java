package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ian0 implements jan0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f14446a;

    public ian0(bem bemVar) {
        this.f14446a = bemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ian0) && this.f14446a.equals(((ian0) obj).f14446a);
    }

    public final int hashCode() {
        return this.f14446a.hashCode();
    }

    public final String toString() {
        return twn.n("DsAction(action=", this.f14446a, Separators.RPAREN);
    }
}
