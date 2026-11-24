package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class elr implements jlr {
    public final long b;

    public elr(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof elr) && bds.a(this.b, ((elr) obj).b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return kng0.l("NotFound(gameId=", bds.b(this.b), Separators.RPAREN);
    }
}
