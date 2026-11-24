package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xsn0 implements atn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41426a;

    public final boolean equals(Object obj) {
        if (obj instanceof xsn0) {
            return this.f41426a.equals(((xsn0) obj).f41426a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41426a.hashCode();
    }

    public final String toString() {
        return kng0.l("PossibleWin(value=", this.f41426a, Separators.RPAREN);
    }
}
