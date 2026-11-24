package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fi00 implements gi00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bem f9564a;

    public fi00(bem bemVar) {
        this.f9564a = bemVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fi00) && this.f9564a.equals(((fi00) obj).f9564a);
    }

    public final int hashCode() {
        return this.f9564a.hashCode();
    }

    public final String toString() {
        return twn.n("DsAction(action=", this.f9564a, Separators.RPAREN);
    }
}
