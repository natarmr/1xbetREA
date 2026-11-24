package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rwn0 implements uwn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31224a;

    public final boolean equals(Object obj) {
        if (obj instanceof rwn0) {
            return this.f31224a.equals(((rwn0) obj).f31224a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31224a.hashCode();
    }

    public final String toString() {
        return kng0.l("PossibleWin(value=", this.f31224a, Separators.RPAREN);
    }
}
